package com.einfochips.jwt.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Students")
public class Students implements Comparable<Students>{
	@Id
	private String id;

	private String name;
	private String email;
	private Department department;
	private List<subjects> subjects;
	
//	insert formate by postmen
//	{
//		  "name":"jaydeep",
//		  "email":"zanzmera@Gmail.com",
//		  "department":{
//		                 "DepartmentName":"MCA",
//		                  "DepartmentLocation":"changa"
//		               },
//		  "subjects":[
//		    {
//		      "subjectName":"java",
//		      "marksObtained":"80"
//		    },
//		    {
//		       "subjectName":"spring",
//		       "marksObtained":"90"
//		      
//		    }]
//
//		  
//		}
//	 
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Students(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	public Students(String id, String name, String email, Department department,
			List<com.einfochips.jwt.model.subjects> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.subjects = subjects;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<subjects> subjects) {
		this.subjects = subjects;
	}


	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
	

}
