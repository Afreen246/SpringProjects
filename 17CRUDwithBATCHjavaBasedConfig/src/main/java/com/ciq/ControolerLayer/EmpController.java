package com.ciq.ControolerLayer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.Pojo.Employee;
import com.ciq.ServiceLayer.EmpServiceIMPL;

public class EmpController {
	
	private static Logger lg=LoggerFactory.getLogger(EmpController.class);
	
	//@Autowired
	private EmpServiceIMPL ser;
	

	public void setSer(EmpServiceIMPL ser) {
		this.ser = ser;
	}

	public void save(Employee emp) {
		lg.info("EmpController save()...");
		ser.save(emp);
	}
	
	public void updatecust(int id,String name,double salary) {
		lg.info("EmpController updateCust()...");

		ser.updatecust(id, name, salary);
	}	
	
	public void delete(int id) {
		
		lg.info("EmpController dalete()...");
		
		ser.delete(id);
	}
	
	public List<Employee> getEmployees(){
		
		lg.info("EmpConroller getEmployee()...");
		
		return ser.getEmployees();
	}

	public int batchUpdate(List<Employee> emps) {
		// TODO Auto-generated method stub
		return ser.batchUpdate(emps);
	}
}
