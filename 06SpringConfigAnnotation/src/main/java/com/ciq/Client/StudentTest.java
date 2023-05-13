package com.ciq.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.Bean.Student;
import com.ciq.Controller.StudController;

public class StudentTest {

	public static void main(String[] args) {
		Student st =new Student(1, "afreen", 25000, "afreen@gmail.com");

		ApplicationContext con=new ClassPathXmlApplicationContext("SpringConfig.xml");
		StudController bean =  (StudController) con.getBean("controller");
		
		bean.save(st);
		
	}

}
