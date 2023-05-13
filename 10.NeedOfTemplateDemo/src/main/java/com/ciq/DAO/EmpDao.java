package com.ciq.DAO;

import java.util.List;

import com.ciq.POJO.Employee;

public interface EmpDao {
	
	public void save(Employee emp);
	
	public List<Employee> getEmployee();

}
