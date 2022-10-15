package com.hbnt.dao;

import java.util.List;

import com.hbnt.entity.Product;

public interface ProductDAO {
	
	List<Product> getProductBasedOnProductId(Integer id);
	
	List<Object[]> getPnameAndPrice();

}
