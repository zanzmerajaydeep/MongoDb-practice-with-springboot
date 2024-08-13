package com.einfochips.jwt.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class subjects {
	
	@Field(name = "subject_Name")
	private String subjectName;
	
	@Field(name = "marks_Obtained ")
	private String marksObtained;
	
	
	@Override
	public String toString() {
		return "subjects [subjectName=" + subjectName + ", marksObtained=" + marksObtained + "]";
	}
	public subjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(String marksObtained) {
		this.marksObtained = marksObtained;
	}
	
	
	

}
