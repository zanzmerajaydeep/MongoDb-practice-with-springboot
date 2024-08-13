package com.einfochips.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Address {
	
	
	@Id
	String id;
	String address;
	int pincode;

}
