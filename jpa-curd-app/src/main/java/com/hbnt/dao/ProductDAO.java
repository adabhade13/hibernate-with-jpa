package com.hbnt.dao;

import com.hbnt.entity.Product;

public interface ProductDAO {
	
	void saveProduct(Product product);
	
	Product fetchProduct(Integer id);

}
