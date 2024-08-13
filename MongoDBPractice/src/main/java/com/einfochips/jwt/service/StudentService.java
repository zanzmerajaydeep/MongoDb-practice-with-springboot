package com.einfochips.jwt.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einfochips.jwt.model.Students;
import com.einfochips.jwt.repo.StudentRepo;
import com.fasterxml.jackson.core.JsonProcessingException;


@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;

	public Students createStudent(Students students) throws JsonProcessingException {
		System.out.println(students.getDepartment().toString());
		return repo.save(students);
	}

	public Optional<Students> getStudentByID(String id) {

		return repo.findById(id);

	}
	
	public String deleteByID(String id) {

		repo.deleteById(id);
		
		return "delete success!...";
	}
	
	public String deleteByStudentName(String name) {

		repo.deleteByName(name);
		
		return "delete success!...";

	}
	
	public List<Students> getStudentByNameAndEmail(String name,String email) {
		
		return repo.findByNameAndEmail(name, email);

	}
	

}
