package com.einfochips.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class StudentDto {
	
	
	String id;
	private String name ;
	int age;
	
	
	Address address;
	
	
	List<String> productId;

	//http://localhost:8080/addProductByID?productList=653e7a8cc09456210d134162,653e826cc09456210d134170
}
