package com.einfochips.jwt.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Students")
public class Students implements Comparable<Students> {
	@Id
	private String id;

	private String name;
	private String email;

	@DBRef
	private Department department;

	@DBRef
	private List<Subjects> subjects;

	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Students(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Students(String id, String name, String email, Department department, List<Subjects> subjects) {
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

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
	//@Null
	//private String nullProperty; // Valid if null
	//
	//@NotNull
	//private String notNullProperty; // Invalid if null
	//
	//@NotBlank
	//private String notBlankProperty; // Invalid if null or blank
	//
	//@NotEmpty
	//private List<String> notEmptyList; // Invalid if null or empty
	//
	//@Size(min = 2, max = 10)
	//private String sizeLimitedProperty; // Invalid if length is less than 2 or greater than 10
	//
	//@Min(18)
	//private int minValue; // Invalid if less than 18
	//
	//@Max(100)
	//private int maxValue; // Invalid if greater than 100
	//
	//@Email
	//private String email; // Invalid if not a valid email address
	//
	//@Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}")
	//private String phone; // Invalid if not in the format XXX-XXX-XXXX
	//
	//@Digits(integer = 5, fraction = 2)
	//private BigDecimal decimalNumber; // Invalid if not a decimal number with 5 integer and 2 fractional digits
	//
	//@Range(min = 1, max = 100)
	//private int rangeLimitedProperty; // Invalid if not within the range 1-100
	//
	//@AssertTrue
	//private boolean flag; // Invalid if false
	//
	//@AssertFalse
	//private boolean oppositeFlag; // Invalid if true

	// Constructors, getters, and setters


}
