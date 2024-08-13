package com.einfochips.jwt.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.einfochips.jwt.model.Students;
import com.einfochips.jwt.model.UserDto;
import com.einfochips.jwt.service.StudentService;
import com.fasterxml.jackson.core.JsonProcessingException;





@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private RestTemplate restTemplate; 

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
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteStudentByID(@PathVariable String id)
	{  	
		return studentService.deleteByID(id);
	}
	
	@GetMapping("/deleteByName/{name}")
	public String deleteStudentByName(@PathVariable String name)
	{  	
		return studentService.deleteByStudentName(name);
	}
	
	@GetMapping("/getByNameAndEmail")
	public List<Students> getStudentByNameAndEmail(@RequestParam String name,
			@RequestParam String email)
	{  	
		return studentService.getStudentByNameAndEmail(name, email);
	}
	
//	@GetMapping("/test/rest")
//	public List<UserDto> getByID()
//	{  	
//		ResponseEntity<List<UserDto>> dto = restTemplate.getForObject("http://localhost:8081/user/getalluser", ResponseEntity<List<UserDto>>);
//		System.out.println(dto);
//		return dto;
//	}	
	
	@GetMapping("/test/rest1")
	public List<UserDto> getByID1() {
	    ResponseEntity<List<UserDto>> responseEntity = restTemplate.exchange(
	        "http://localhost:8081/user/getalluser",
	        HttpMethod.GET,
	        null,
	        new ParameterizedTypeReference<List<UserDto>>() {}
	    );

	    List<UserDto> dtoList = responseEntity.getBody();

	    // Print the list for debugging
	    System.out.println(dtoList);

	    return dtoList;
	}
	
	@GetMapping("/test/rest")
	public UserDto getByID2() {
	    ResponseEntity<UserDto> responseEntity = restTemplate.getForEntity(
	        "http://localhost:8081/user/getUser", UserDto.class);

	    UserDto userDto = responseEntity.getBody();

	    // Print the object for debugging
	    System.out.println(userDto);

	    return userDto;
	}
	
	@GetMapping("/test/rest2")
	public String getByID3() {
	    ResponseEntity<String> responseEntity = restTemplate.getForEntity(
	        "http://localhost:8081/user/getString", String.class);

	    String jsonString = responseEntity.getBody();

	    // Print the string for debugging
	    System.out.println(jsonString);

	    return jsonString;
	}

	@GetMapping("/test/rest3")
	public Map<String, Object> getByID4() {
	    ResponseEntity<Map<String, Object>> responseEntity = restTemplate.exchange(
	        "http://localhost:8081/user/getMap",
	        HttpMethod.GET,
	        null,
	        new ParameterizedTypeReference<Map<String, Object>>() {}
	    );

	    Map<String, Object> resultMap = responseEntity.getBody();

	    // Print the map for debugging
	    System.out.println(resultMap);

	    return resultMap;
	}



}
