package com.einfochips.jwt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "Department")
public class Department {
	
	@Id
	private String id;
	
	@Field(name = "deapartment_Name")
	private String departmentName;
	
	@Field(name = "department_location")
	private String departmentLocation;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

	public Department(String id, String departmentName, String departmentLocation) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}

	public Department(String departmentName, String departmentLocation) {
		super();
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", departmentLocation="
				+ departmentLocation + "]";
	}
	
	 
	
//	
	

}
