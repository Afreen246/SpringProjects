package com.ciq.Clent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.DAO.EmpDaoImpl;
import com.ciq.Pojo.Employee;

public class EmpTest {

	public static void main(String[] args) {

		Employee e=new Employee(46, "muzaffar", 45000);
		ApplicationContext ap=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		EmpDaoImpl bean = ap.getBean(EmpDaoImpl.class);
		System.out.println(bean);
		bean.save(e);
		//bean.update(1, "fathima");
		//bean.delete(45);
		bean.getEmployees();
		System.out.println(bean.getEmployees());

	}

}
