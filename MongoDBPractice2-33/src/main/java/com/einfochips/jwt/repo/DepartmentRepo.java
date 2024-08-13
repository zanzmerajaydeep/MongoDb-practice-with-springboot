package com.einfochips.jwt.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.einfochips.jwt.model.Department;
import com.einfochips.jwt.model.Subjects;

public interface DepartmentRepo extends MongoRepository<Department, String >{

	

}
