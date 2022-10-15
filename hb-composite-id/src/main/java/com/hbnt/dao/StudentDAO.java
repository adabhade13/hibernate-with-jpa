package com.hbnt.dao;

import com.hbnt.entity.StudentEntity;
import com.hbnt.entity.StudentPrimaryKey;

public interface StudentDAO {
	
	void saveStudent(StudentEntity studentEntity);
	
	StudentEntity fetchStudent(StudentPrimaryKey studentPrimaryKey);

}
