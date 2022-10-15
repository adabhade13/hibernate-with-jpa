package com.hbnt.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hbnt.dao.StudentDAO;
import com.hbnt.entity.StudentEntity;
import com.hbnt.entity.StudentPrimaryKey;

public class StudentDAOImpl implements StudentDAO {

	private EntityManagerFactory emf;

	public StudentDAOImpl() {
		emf = Persistence.createEntityManagerFactory("test");
	}

	@Override
	public void saveStudent(StudentEntity studentEntity) {
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		try {
			entityManager.persist(studentEntity);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
		}
		System.out.println("SAVED");
		entityManager.close();
	}

	@Override
	public StudentEntity fetchStudent(StudentPrimaryKey studentPrimaryKey) {
		EntityManager entityManager = emf.createEntityManager();
		StudentEntity studentEntity = entityManager.find(StudentEntity.class, studentPrimaryKey);
		System.out.println("STUDENT ENTITY ::"+studentEntity);
		return studentEntity;
	}

}
