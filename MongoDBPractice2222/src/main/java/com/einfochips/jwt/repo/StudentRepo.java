package com.einfochips.jwt.repo;

import java.util.List;

import javax.security.auth.Subject;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.einfochips.jwt.model.Students;

public interface StudentRepo  extends MongoRepository<Students ,String >{

	List<Students> findFirstByEmail(String email);
	
	Students findByName(String name);
	
	List<Students> findByEmailAndName(String email,String name);
	
	List<Students> findByDepartmentDepartmentName(String departname);
	
	List<Students> findByEmailOrName (String email,String name);
	
	//List<Students> findByNameAndEmail(String name,String email);
	
	//List<Students> findByDepartmentdepartmentName(String departmentName); 
	
	List<Students> findByEmailIsLike(String email);
	
	List<Students> findByNameStartsWith(String name);
	
	
}
