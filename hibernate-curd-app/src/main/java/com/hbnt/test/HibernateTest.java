package com.hbnt.test;

import com.hbnt.dao.ProductDAO;
import com.hbnt.dao.impl.ProdcutDAOImpl;
import com.hbnt.entity.Product;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product();
		product.setProductName("Spring Book");
		product.setDescription("Learn Spring");
		product.setQuantity(5);
		product.setPrice(1000.50);
		
		ProductDAO productDAO = new ProdcutDAOImpl();
		Integer saveProduct = productDAO.saveProduct(product);
		
		System.out.println("Successfully saved Product ::"+saveProduct);

	}

}
