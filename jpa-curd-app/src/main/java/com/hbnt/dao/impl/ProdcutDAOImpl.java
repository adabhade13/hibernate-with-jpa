package com.hbnt.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hbnt.dao.ProductDAO;
import com.hbnt.entity.Product;

public class ProdcutDAOImpl implements ProductDAO {
	

	
	private EntityManagerFactory emf;
	
	
	public ProdcutDAOImpl() {
		emf = Persistence.createEntityManagerFactory("test");
	}

	@Override
	public void saveProduct(Product product) {
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction ex = entityManager.getTransaction();
		ex.begin();
		try {
			entityManager.persist(product);
			ex.commit();
		}catch(Exception e) {
			ex.rollback();
		}
		
		entityManager.close();
		System.out.println("save ");
	}

	@Override
	public Product fetchProduct(Integer id) {
		EntityManager entityManager = emf.createEntityManager();
		Product product = entityManager.find(Product.class, id);
		System.out.println("Product ::"+product);
		entityManager.close();
		return product;
	}

}
