package com.hbnt.onetomany.test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.hbnt.onetomany.dao.OneToManyDAO;
import com.hbnt.onetomany.dao.impl.OneToManyDAOImpl;
import com.hbnt.onetomany.entities.CustomerEntity;
import com.hbnt.onetomany.entities.OrderEntity;

public class OneToManyTest {

	public static void main(String[] args) {

		OneToManyDAO oneToManyDAO = new OneToManyDAOImpl();
		
		/*CustomerEntity entity = new CustomerEntity();
		entity.setId(2);
		entity.setName("Avinash");
		
		OrderEntity orderEntity1 = new OrderEntity();
		orderEntity1.setId(4);orderEntity1.setOrderId(897761); orderEntity1.setLocaldate(LocalDate.of(2022, 7, 22));
		orderEntity1.setOrderStatus("Dispatched");
		
		
		OrderEntity orderEntity2 = new OrderEntity();
		orderEntity2.setId(5);orderEntity2.setOrderId(889762); orderEntity2.setLocaldate(LocalDate.of(2022, 7, 10));
		orderEntity2.setOrderStatus("Delivery");
		
		List<OrderEntity> list = Arrays.asList(orderEntity1,orderEntity2);
		
		entity.setOrders(list);
		oneToManyDAO.saveCustomerWithOrderDetails(entity);*/
		
		
		/* Fetch Customer */
		
		CustomerEntity customerEntity = oneToManyDAO.fetchCustomerDetails(1);
		List<OrderEntity> orders = customerEntity.getOrders();
		System.out.println("CUSTOMER DETAILS ::"+customerEntity); 
		orders.forEach(e -> System.out.println(e));
		
		
		//oneToManyDAO.deleteCustomerBasedOnId(2);
		
	}

}
