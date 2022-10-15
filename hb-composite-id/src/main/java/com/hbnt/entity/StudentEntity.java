package com.hbnt.entity;

import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "TBL_STUDENTS")
public class StudentEntity {

	@EmbeddedId
	private StudentPrimaryKey studentPrimaryKey;
	private String studentNamber;
	private Double marks;
	@CreationTimestamp
	private LocalDateTime createdDate;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	public StudentPrimaryKey getStudentPrimaryKey() {
		return studentPrimaryKey;
	}
	public void setStudentPrimaryKey(StudentPrimaryKey studentPrimaryKey) {
		this.studentPrimaryKey = studentPrimaryKey;
	}
	public String getStudentNamber() {
		return studentNamber;
	}
	public void setStudentNamber(String studentNamber) {
		this.studentNamber = studentNamber;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "StudentEntity [studentPrimaryKey=" + studentPrimaryKey + ", studentNamber=" + studentNamber + ", marks="
				+ marks + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}


}
