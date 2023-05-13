package com.ciq.ServiceLayer;

import java.util.List;

import com.ciq.Pojo.Employee;

public interface EmpServise {
	
	public void save(Employee emp);
	
	public void updatecust(int id,String name,double salary);
	
	public void delete(int id);
	
	public List<Employee> getEmployees();
	
	public List<Employee> findAll();


	public List<Employee> getEmps();
	
	public void getId(int id);
	
	public void getByName(String name);
}
