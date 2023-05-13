package com.ciq.Client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.ControolerLayer.EmpController;
import com.ciq.Pojo.Employee;

public class EmpTest {

	public static void main(String[] args) {

		Employee emp=new Employee(99, "sharukh", 54000);
		ApplicationContext ap=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		EmpController bean = ap.getBean(EmpController.class);
		
		bean.save(emp);
		
		//bean.updatecust(1, "rehan", 55000);
		
		//bean.delete(2);
		
		//System.out.println(bean.getEmployees());
		                 //or
		//used to print line by line
//		List<Employee> li=bean.getEmployees();
//		//java 8 feature
//		li.forEach(System.out::println);
		
		
		//System.out.println(bean.findAll());
		
		//System.out.println(bean.getEmps());
		
		//bean.getById(44);
		
		bean.getByName("meerub");
	}

}
