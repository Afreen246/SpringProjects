package com.ciq.DAOlayer;

import java.util.List;

import com.ciq.Pojo.Employee;

public interface EmpDaoLayer {
	
	public void save(Employee emp);
	
	public void customupdate(int id,String name,double salary);
	
	public void delete(int id);
	
	public List<Employee> getEmployees();
	
	
	public int batchUpdate(List<Employee> emps);

}
