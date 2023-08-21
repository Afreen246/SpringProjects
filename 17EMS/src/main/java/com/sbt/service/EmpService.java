package com.sbt.service;

import java.util.List;

import com.sbt.dto.EmployeeDto;
import com.sbt.entity.Employee1;

public interface EmpService {

	public List<Employee1> getAll();
	
	public Employee1 insert(EmployeeDto empdto);
	
	public Employee1 update(EmployeeDto empdto);
	
	public void delete(long eid);
	
	public Employee1 getById(long eid);
}
