package com.hbnt.test;

import com.hbnt.dao.StudentDAO;
import com.hbnt.dao.impl.StudentDAOImpl;
import com.hbnt.entity.StudentEntity;
import com.hbnt.entity.StudentPrimaryKey;

public class Tester {

	public static void main(String[] args) {
		
		StudentDAO studentDAO = new StudentDAOImpl();
		
		StudentPrimaryKey studentPK = new StudentPrimaryKey();
		studentPK.setRollNumber(101);
		studentPK.setSection("S2");
		
		/*
		 * StudentEntity studentEntity = new StudentEntity();
		 * studentEntity.setStudentPrimaryKey(studentPK);
		 * studentEntity.setStudentNamber("Rosalin"); studentEntity.setMarks(600.0);
		 * 
		 * studentDAO.saveStudent(studentEntity);
		 * 
		 * 
		 */
		
		studentDAO.fetchStudent(studentPK);

	}

}
