package com.einfochips.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.einfochips.model.Product;

public interface ProductRepo extends MongoRepository<Product, String >{
	
	List<Product> findByIdIn(List<String> id);

}
