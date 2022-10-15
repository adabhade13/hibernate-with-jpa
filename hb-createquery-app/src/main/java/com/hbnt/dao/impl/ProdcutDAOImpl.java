package com.hbnt.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.hbnt.dao.ProductDAO;
import com.hbnt.entity.Product;

public class ProdcutDAOImpl implements ProductDAO {
	

	
	private EntityManagerFactory emf;
	
	
	public ProdcutDAOImpl() {
		emf = Persistence.createEntityManagerFactory("test");
	}


	@Override
	public List<Product> getProductBasedOnProductId(Integer id) {
		EntityManager em = emf.createEntityManager();
		//Index parameter
		//TypedQuery<Product> query = em.createQuery("SELECT p FROM Product p WHERE p.quantity=?1", Product.class);
		//query.setParameter(1, id);
		
		//Named Parameter
		TypedQuery<Product> query = em.createQuery("SELECT p FROM Product p WHERE p.quantity=:pqty", Product.class);
		query.setParameter("pqty", id);
		
		List<Product> list = query.getResultList();
		return list;
	}


	@Override
	public List<Object[]> getPnameAndPrice() {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		TypedQuery<Object[]> query = em.createQuery("SELECT p.productName, p.price FROM Product p", Object[].class);
		List<Object[]> list = query.getResultList();
		return list;
	}

}
