package com.hbnt.onetomany.dao;

import com.hbnt.onetomany.entities.CustomerEntity;

public interface OneToManyDAO {
	
	void saveCustomerWithOrderDetails(CustomerEntity customerEntity);
	
	
	CustomerEntity fetchCustomerDetails(Integer id);
	
	
	void deleteCustomerBasedOnId(Integer id);

}
