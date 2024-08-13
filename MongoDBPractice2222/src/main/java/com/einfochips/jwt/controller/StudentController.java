package com.einfochips.jwt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.einfochips.jwt.model.Students;
import com.einfochips.jwt.service.StudentService;
import com.fasterxml.jackson.core.JsonProcessingException;





@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	public Students  cerateStudent(@RequestBody Students students) throws JsonProcessingException
	{
		return studentService.createStudent(students);
	}
	
	@GetMapping("/getByID/{id}")
	public Optional<Students> getStudentByID(@PathVariable String id)
	{  	
		return studentService.getStudentByID(id);
	}
	
	@GetMapping("/getAll")
	public Optional<List<Students>> getStudentByID()
	{  	
		return studentService.getStudenAll();
	}
	
	@GetMapping("/byname/{name}")
	public Students byName(@PathVariable String name)
	{  	
		return studentService.getStudentByName(name);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteStudentByID(@PathVariable String id)
	{  	
		return studentService.deleteByID(id);
	}
	
//	@GetMapping("/deleteByName/{name}")
//	public String deleteStudentByName(@PathVariable String name)
//	{  	
//		return studentService.deleteByStudentName(name);
//	}
	
	@GetMapping("/getByNameAndEmail")
	public List<Students> getStudentByNameAndEmail(
			@RequestParam String email,@RequestParam String name)
	{  	
		System.out.println(email);
		return studentService.getStudentByNameAndEmail(email, name);
	}
	
	@GetMapping("/byDepartmentName")
	public List<Students> byDepartmentName(@RequestParam String departName) {
		return studentService.byDepartmentName(departName);
	}
	
	@GetMapping("/fetch/{id}")
	public Optional<Students> getByID(@PathVariable String id)
	{  	
		return studentService.getStudentByID(id);
	}
	
	@GetMapping("/getByNameOrEmail")
	public List<Students> getStudentByNameOrEmail(
			@RequestParam String email,@RequestParam String name)
	{  	
		//System.out.println(email);
		return studentService.getStudentByNameOrEmail(email, name);
	}
	

	@GetMapping("/getAllBySortBypagination")
	public Optional<List<Students>> getStudentBySortBypagination(@RequestParam(defaultValue = "name") String sortField, @RequestParam(defaultValue = "asc") String sortOrder, @RequestParam(defaultValue = "0") int pageNo)
	{  	
		return studentService.getStudenAllWithSortingPagination(sortField, sortOrder,pageNo);
	}
	
	@GetMapping("/getAllBySort")
	public Optional<List<Students>> getStudentBySortBy()
	{  	
		return studentService.getStudenAllWithSorting();
	}
	
	@GetMapping("/getStudentEmailIsLike")
	public Optional<List<Students>> getStudentByEmailIsLike(@RequestParam String email) {
		return studentService.getStudenByEmailIsLike(email);
	}
	
	@GetMapping("/getStudentNameStartWith")
	public Optional<List<Students>> getStudentNameStartWith(@RequestParam String name) {
		return studentService.getStudenNameStartWith(name);
	}
}
