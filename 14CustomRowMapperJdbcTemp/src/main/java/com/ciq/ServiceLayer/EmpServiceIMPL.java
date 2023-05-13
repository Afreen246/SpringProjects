package com.ciq.ServiceLayer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.DAOlayer.EmpDAOImpl;
import com.ciq.Pojo.Employee;

@Service
public class EmpServiceIMPL implements EmpServise {

	private static Logger lg = LoggerFactory.getLogger(EmpServiceIMPL.class);

	@Autowired
	private EmpDAOImpl impl;

	public void save(Employee emp) {
		lg.info("serviceIMPL in save()...");
		impl.save(emp);
	}

	public void updatecust(int id, String name, double salary) {

		lg.info("serviceIMPL in updatecust()...");

		impl.customupdate(id, name, salary);
	}

	public void delete(int id) {

		lg.info("serviceIMPL in delete()...");

		impl.delete(id);

	}

	public List<Employee> getEmployees() {
		lg.info("serviceIMPL in getEmployee()...");
		return impl.getEmployees();
	}

	@Override
	public List<Employee> findAll() {
		return impl.findAll();
	}

	@Override
	public List<Employee> getEmps() {
		// TODO Auto-generated method stub
		return impl.getEmps();
	}

	@Override
	public void getId(int id) {
       impl.getById(id);		
	}

	@Override
	public void getByName(String name) {

		impl.getByName(name);
	}

}
