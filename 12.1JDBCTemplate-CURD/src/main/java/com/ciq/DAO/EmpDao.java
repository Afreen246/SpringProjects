package com.ciq.DAO;

import java.util.List;

import com.ciq.Pojo.Employee;

public interface EmpDao {
	
	public void save(Employee emp);
	
	public void update(int id,String name);
	
	public void delete(int id);
	
	public List<Employee> getEmployees();

}
