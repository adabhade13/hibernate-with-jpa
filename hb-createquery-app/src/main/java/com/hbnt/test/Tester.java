package com.hbnt.test;

import java.util.List;

import com.hbnt.dao.ProductDAO;
import com.hbnt.dao.impl.ProdcutDAOImpl;
import com.hbnt.entity.Product;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDAO productDAO = new ProdcutDAOImpl();
		
		List<Product> productBasedOnProductId = productDAO.getProductBasedOnProductId(5);
		
		productBasedOnProductId.stream().forEach(System.out::println);
		
		System.out.println("*********************************************************");
		List<Object[]> pnameAndPrice = productDAO.getPnameAndPrice();
		pnameAndPrice.stream().forEach(p -> System.out.println("Pname ::"+p[0]+", Price ::"+p[1]));
	
	
	}

}
