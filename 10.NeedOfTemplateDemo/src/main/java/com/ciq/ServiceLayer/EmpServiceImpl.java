 package com.ciq.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.DAO.EmpDaoImpl;
import com.ciq.POJO.Employee;
@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpDaoImpl imp;
	
	public void save(Employee emp) {
       	imp.save(emp);	
	}

	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return imp.getEmployee();
	}

}
