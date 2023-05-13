package com.ciq.Conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.POJO.Employee;
import com.ciq.ServiceLayer.EmpServiceImpl;

@Controller("ctl")
public class EmpController {

	@Autowired
	private EmpServiceImpl imp;

	public void save(Employee e) {
		imp.save(e);
	}

	public List<Employee> getStudent() {
		return imp.getEmployee();
	}
}
