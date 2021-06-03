package com.miller.reactive.webflux.controller;

import com.miller.reactive.webflux.model.Product;
import com.miller.reactive.webflux.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("list")
    public Mono<String> list(Model model){

        Flux<Product> products = iProductService.findAll();
        model.addAttribute("products", products);

        return Mono.just("products/list");
    }
    @GetMapping("product-form")
    public Mono<String> productForm(Model model){
        model.addAttribute("product", new Product());
        return Mono.just("products/product-form");
    }
}
