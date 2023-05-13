package com.ciq.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.Conroller.EmpController;
import com.ciq.POJO.Employee;

public class EmpTest {

	public static void main(String[] args) {
     
       Employee emp=new Employee(1, "afreen", 80000);
       
		ApplicationContext ap=new ClassPathXmlApplicationContext("springConfig.xml");
		
		EmpController bean = (EmpController) ap.getBean("ctl");
		
		System.out.println(bean);
		
		bean.save(emp);
	}

}
