package com.miller.reactive.webflux.service.impl;

import com.miller.reactive.webflux.dao.IProductDao;
import com.miller.reactive.webflux.model.Product;
import com.miller.reactive.webflux.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao iProductDao;

    @Override
    public Mono<Product> register(Product product) {
        return iProductDao.save(product);
    }

    @Override
    public Mono<Product> update(Product product) {
        return iProductDao.save(product);
    }

    @Override
    public Flux<Product> findAll() {
        return iProductDao.findAll();
    }

    @Override
    public Mono<Product> findById(String id) {
        return iProductDao.findById(id);
    }

    @Override
    public Mono<Void> delete(String id) {
        return iProductDao.deleteById(id);
    }
}
