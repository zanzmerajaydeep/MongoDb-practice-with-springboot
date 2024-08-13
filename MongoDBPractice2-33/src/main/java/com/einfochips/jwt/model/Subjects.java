package com.einfochips.jwt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Subjects")
public class Subjects {
	
	@Id
	private String id;
	
	@Field(name = "subject_Name")
	private String subjectName;
	
	@Field(name = "marks_Obtained ")
	private String marksObtained;
	
	
	@Override
	public String toString() {
		return "subjects [subjectName=" + subjectName + ", marksObtained=" + marksObtained + "]";
	}
	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
