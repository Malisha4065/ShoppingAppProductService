package me.dushminmalisha.productservice.repository;

import me.dushminmalisha.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public class ProductRepository extends MongoRepository<Product, String> {
}
