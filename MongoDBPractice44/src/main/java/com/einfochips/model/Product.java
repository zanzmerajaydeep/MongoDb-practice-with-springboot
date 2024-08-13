package com.einfochips.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Product {
	
	@Id
	String id;
	String name;
	int qty;
	int price;

}
