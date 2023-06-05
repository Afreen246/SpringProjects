package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.DAO.ProductDaoImpl;
import com.ciq.Model.Product;

public class Client {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring-servlet.xml");
		
		ProductDaoImpl bean = ap.getBean(ProductDaoImpl.class);
		
//		System.out.println(bean.getProducts());
		Product p=new Product(1, "lappi", "used for programm",12345l);
		
		bean.updatepr(p);
		System.out.println(bean);
	}
}
