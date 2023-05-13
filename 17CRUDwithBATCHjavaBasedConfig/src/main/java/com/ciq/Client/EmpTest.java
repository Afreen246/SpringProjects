package com.ciq.Client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.ControolerLayer.EmpController;
import com.ciq.DAOlayer.JavaConfig;
import com.ciq.Pojo.Employee;

public class EmpTest {

	public static void main(String[] args) {

		//Employee emp=new Employee(11, "sandeep", 54000);
		
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		EmpController bean = ap.getBean(EmpController.class);
		
		//bean.save(emp);
		
		//bean.updatecust(1, "rehan", 55000);
		
		//bean.delete(2);
		
		//System.out.println(bean.getEmployees());
		
		Employee e1=new Employee(77, "saraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 88000);
		Employee e2=new Employee(78, "maya", 45000);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		bean.batchUpdate(list);
		
	}

}
