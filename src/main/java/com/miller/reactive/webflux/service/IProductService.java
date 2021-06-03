package com.miller.reactive.webflux.service;

import com.miller.reactive.webflux.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface IProductService {
    Mono<Product> register(Product product);
    Mono<Product> update(Product product);
    Flux<Product> findAll();
    Mono<Product> findById(String id);
    Mono<Void> delete(String id);
}
