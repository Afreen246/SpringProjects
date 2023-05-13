package com.ciq.StereioAnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args) {
        ApplicationContext con=new ClassPathXmlApplicationContext("StereioConfig.xml");
        Employee bean = (Employee) con.getBean("employee");
       
        System.out.println(bean);
	}

}
