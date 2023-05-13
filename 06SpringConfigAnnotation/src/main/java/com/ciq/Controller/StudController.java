package com.ciq.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.ciq.Bean.Student;
import com.ciq.Service.StudentSerImpl;

//@Component("controller")
@Controller("controller")
public class StudController {

	@Autowired
	private StudentSerImpl ser;


//	public void setSer(StudentSerImpl ser) {
//		this.ser = ser;
//	}

	public void save(Student st) {
		ser.save(st);
	}
	
	public List<Student> getStudent(){
		return ser.getStudent();
	}
}
