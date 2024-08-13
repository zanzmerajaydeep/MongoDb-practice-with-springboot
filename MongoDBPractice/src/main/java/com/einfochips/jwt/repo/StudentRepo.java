package com.einfochips.jwt.repo;




import java.util.List;

import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.einfochips.jwt.model.Students;


public interface StudentRepo extends MongoRepository<Students, String> {

	
	 void deleteById(String id);
	 
	 void deleteByName(String name);

	 List<Students> findByNameAndEmail(String name,String email);
	
}
