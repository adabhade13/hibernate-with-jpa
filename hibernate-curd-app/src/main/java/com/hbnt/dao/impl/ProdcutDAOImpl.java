package com.hbnt.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hbnt.dao.ProductDAO;
import com.hbnt.entity.Product;
import com.hbnt.utils.HibernateUtils;

public class ProdcutDAOImpl implements ProductDAO {

	@Override
	public Integer saveProduct(Product product) {
		SessionFactory sessionFactory = HibernateUtils.createSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Integer id= (Integer) session.save(product);
		transaction.commit();
		session.close();
		System.out.println("Product saved successfully with ID ::"+id);
		return id;
	}

	@Override
	public Product fetchProduct(Integer id) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory = HibernateUtils.createSessionFactory();
		
		Session session = sessionFactory.openSession();
Transaction transaction = session.beginTransaction();
		
		//session.load(theClass, id)
		
		return null;
	}

}
