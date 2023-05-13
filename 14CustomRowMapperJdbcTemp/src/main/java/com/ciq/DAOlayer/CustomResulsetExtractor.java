package com.ciq.DAOlayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ciq.Pojo.Employee;

public class CustomResulsetExtractor implements ResultSetExtractor<List<Employee>>{

	
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Employee> li=new ArrayList();
		
		while(rs.next()) {
			Employee emp=new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getDouble(3));
			li.add(emp);
		}
		
		return  li;

		
	}

}
