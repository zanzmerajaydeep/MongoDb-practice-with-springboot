package com.einfochips.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.einfochips.model.Address;
import com.einfochips.model.Product;
import com.einfochips.model.Student;
import com.einfochips.model.StudentDto;
import com.einfochips.repo.AddressRepo;
import com.einfochips.repo.ProductRepo;
import com.einfochips.repo.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private AddressRepo addressRepo;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody StudentDto studentDto)
	{
		List<Product> products=productRepo.findByIdIn(studentDto.getProductId());
		
		Student student = new Student();
		student.setName(studentDto.getName());
		student.setAge(studentDto.getAge());
		
		student.setAddress(studentDto.getAddress());
		student.setProducts(products);
		
		return studentRepo.save(student);
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		System.out.println(product);
		return productRepo.save(product);
	}
	
	@PostMapping("/addAddress")
	public Address addAddress(@RequestBody Address address)
	{
		return addressRepo.save(address);
	}
	
	@GetMapping("/addProductByID")
	public List<Product> getProduct(@RequestParam List<String > productList)
	{
		return productRepo.findByIdIn(productList);
	}
	
	@GetMapping("/getCount")
	public Long getCount()
	{
		return studentRepo.countByName();
	}


}
