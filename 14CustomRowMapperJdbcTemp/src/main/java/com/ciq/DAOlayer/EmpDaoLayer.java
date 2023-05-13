package com.ciq.DAOlayer;

import java.util.List;

import com.ciq.Pojo.Employee;

public interface EmpDaoLayer {
	
	public void save(Employee emp);
	
	public void customupdate(int id,String name,double salary);
	
	public void delete(int id);
	
	//custom row-mapper
	public List<Employee> getEmployees();
	
	//resultset extractor
	public List<Employee>  findAll();
	
	//using beanPropertyrowMap
	public List<Employee> getEmps();
	
	public void getById(int id);
	
	public void getByName(String name);

}
