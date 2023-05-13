package com.ciq.ServiceLayer;

import java.util.List;

import com.ciq.Pojo.Employee;

public interface EmpServise {
	
	public void save(Employee emp);
	
	public void updatecust(int id,String name,double salary);
	
	public void delete(int id);
	
	public List<Employee> getEmployees();
	
	public int batchUpdate(List<Employee> emps);


}
