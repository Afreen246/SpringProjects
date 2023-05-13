package com.ciq.ServiceLayer;

import java.util.List;

import com.ciq.POJO.Employee;

public interface EmpService {

	public void save(Employee emp);
	
	public List<Employee> getEmployee();
	
}
