package com.hbnt.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StudentPrimaryKey implements Serializable{
	
	private Integer rollNumber;
	private String section;
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	

}
