package com.hbnt.onetomany.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hbnt.onetomany.dao.OneToManyDAO;
import com.hbnt.onetomany.entities.CustomerEntity;
import com.hbnt.onetomany.entities.OrderEntity;

public class OneToManyDAOImpl implements OneToManyDAO {
	
	private EntityManagerFactory emf;
	
	public OneToManyDAOImpl() {
		emf = Persistence.createEntityManagerFactory("demo");
	}

	@Override
	public void saveCustomerWithOrderDetails(CustomerEntity customerEntity) {
		EntityManager em = emf.createEntityManager();

		EntityTransaction t = em.getTransaction();

		t.begin();
		try {
			em.persist(customerEntity);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	@Override
	public CustomerEntity fetchCustomerDetails(Integer id) {
		EntityManager em = emf.createEntityManager();
        CustomerEntity customerEntity = em.find(CustomerEntity.class, id);
      //  List<OrderEntity> orders = customerEntity.getOrders();
		//orders.forEach(e -> System.out.println(e));
        em.close();
		return customerEntity;
	}

	@Override
	public void deleteCustomerBasedOnId(Integer id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		try {
			    CustomerEntity customerEntity = em.find(CustomerEntity.class, id);
		        em.remove(customerEntity);
		        et.commit();
		}catch (Exception e) {
			et.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
	}
}
