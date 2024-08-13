package com.einfochips.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Student {
	
	@Id
	String id;
	private String name ;
	int age;
	
	
	Address address;
	
	
	List<Product> products;
	

}
