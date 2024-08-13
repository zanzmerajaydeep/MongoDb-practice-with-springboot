package com.einfochips.jwt.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.einfochips.jwt.model.Students;
import com.einfochips.jwt.model.Subjects;
import com.einfochips.jwt.repo.DepartmentRepo;
import com.einfochips.jwt.repo.StudentRepo;
import com.einfochips.jwt.repo.SubjectRepo;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Autowired
	private SubjectRepo subjectRepo;
	
	

	public Students createStudent(Students students) throws JsonProcessingException {
		
		if(students.getDepartment() != null)
		{
			departmentRepo.save(students.getDepartment());
			
		}
		if(students.getSubjects() != null && students.getSubjects().size() >0)
		{
			subjectRepo.saveAll(students.getSubjects());
		}
		//System.out.println(students.getDepartment().toString());
		return repo.save(students);
	}
	
	public Optional<List<Students>> getStudentByDepartmentID(String id) {

		List<Students> stu = repo.findByDepartmentId(id);
		// Collections.sort(stu);
		// Collections.reverse(stu);

		return Optional.of(stu);

	}
	
	public Optional<List<Students>> getStudentByName(String name) {

		List<Students> stu = repo.getStudentByName(name);
	
		return Optional.of(stu);

	}
	
	public Optional<List<Students>> getStudentByNameAndEmail(String name,String email) {

		List<Students> stu = repo.getStudentByNameAndEmail(name, email);
	
		return Optional.of(stu);

	}

//	public Optional<Students> getStudentByID(String id) {
//
//		return repo.findById(id);
//
//	}
//
//	public Optional<List<Students>> getStudenAll() {
//
//		return Optional.of(repo.findAll());
//
//	}
//
//	public String deleteByID(String id) {
//
//		repo.deleteById(id);
//
//		return "delete success!...";
//	}
//
//	public List<Students> getStudentByNameAndEmail(String email, String name) {
//		System.out.println(repo.findFirstByEmail(email));
//		return repo.findByEmailAndName(email, name);
//
//	}
//
//	public Students getStudentByName(String name) {
//		Students student = repo.findByName(name);
//		return student;
//	}
//
//	public List<Students> byDepartmentName(String deptName) {
//		return repo.findByDepartmentDepartmentName(deptName);
//	}
//
//	public List<Students> getStudentByNameOrEmail(String email, String name) {
//		// System.out.println(repo.findFirstByEmail(email));
//		return repo.findByEmailOrName(email, name);
//
//	}
//
//	public Optional<List<Students>> getStudenAllWithSortingPagination(String sortField, String sortOrder, int pageNo) {
//		// desc //asc
//		Sort sort = sortOrder.equalsIgnoreCase("asc") ? Sort.by(sortField).ascending()
//				: Sort.by(sortField).descending();
//		Pageable paging = PageRequest.of(pageNo, 5, sort);
//		List<Students> stu = repo.findAll(paging).getContent();
//		// Collections.sort(stu);
//		// Collections.reverse(stu);
//
//		return Optional.of(stu);
//
//	}
//
//	public Optional<List<Students>> getStudenAllWithSorting() {
//
//		Sort sort = Sort.by(Sort.DEFAULT_DIRECTION.DESC, "name");
//
//		List<Students> stu = repo.findAll(sort);
//		// Collections.sort(stu);
//		// Collections.reverse(stu);
//
//		return Optional.of(stu);
//
//	}
//
//	public Optional<List<Students>> getStudenByEmailIsLike(String email) {
//
//		List<Students> stu = repo.findByEmailIsLike(email);
//		// Collections.sort(stu);
//		// Collections.reverse(stu);
//
//		return Optional.of(stu);
//
//	}
//
//
//
//	public Optional<List<Students>> getStudenNameStartWith(String name) {
//
//		List<Students> stu = repo.findByNameStartsWith(name);
//		// Collections.sort(stu);
//		// Collections.reverse(stu);
//
//		return Optional.of(stu);
//
//	}

}
