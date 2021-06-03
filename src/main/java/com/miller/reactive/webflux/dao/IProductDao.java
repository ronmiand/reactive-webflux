package com.miller.reactive.webflux.dao;

import com.miller.reactive.webflux.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IProductDao extends ReactiveMongoRepository<Product, String> {

}
