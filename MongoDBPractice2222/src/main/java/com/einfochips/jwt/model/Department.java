package com.einfochips.jwt.model;

import org.springframework.data.mongodb.core.mapping.Field;



public class Department {
	
	@Field(name = "deapartment_Name")
	private String departmentName;
	
	@Field(name = "department_location")
	private String departmentLocation;
	
	 
	
	
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
	
	

}
