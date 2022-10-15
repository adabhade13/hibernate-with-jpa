package com.hbnt.dao;

import com.hbnt.entity.Product;

public interface ProductDAO {
	
	Integer saveProduct(Product product);
	
	Product fetchProduct(Integer id);

}
