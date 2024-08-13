package com.einfochips.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.einfochips.model.Student;

public interface StudentRepo extends MongoRepository<Student, String>{
	
	long countByName();

}
