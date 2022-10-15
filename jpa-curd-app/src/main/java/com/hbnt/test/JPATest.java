package com.hbnt.test;

import com.hbnt.dao.ProductDAO;
import com.hbnt.dao.impl.ProdcutDAOImpl;
import com.hbnt.entity.Product;

public class JPATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDAO productDAO = new ProdcutDAOImpl();
		/*Product product = new Product();
		product.setProductName("Spring Book11");
		product.setDescription("Learn Spring11");
		product.setQuantity(6);
		product.setPrice(3000.50);
		
		
		productDAO.saveProduct(product);*/
		
		productDAO.fetchProduct(3);

	}

}
