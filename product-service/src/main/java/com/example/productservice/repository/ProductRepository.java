package com.example.productservice.repository;

import com.example.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author "Tojaliyev Asliddin"
 * @since 03/12/22 00:23 (Saturday)
 * product-service/IntelliJ IDEA
 */
public interface ProductRepository extends MongoRepository<Product,String> {

}
