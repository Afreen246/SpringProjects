package com.ciq.DAO;

import java.util.List;

import com.ciq.model.Employee;



public interface EmpDao {

	public void save(Employee emp);
	
	public List<Employee> listEmp();
	
	public void empUpdate(Employee updt);
	
	public Employee getById(int id);
	
	public void delete(int id);
}
