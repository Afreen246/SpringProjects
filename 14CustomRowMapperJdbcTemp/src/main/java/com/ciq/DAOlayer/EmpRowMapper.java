package com.ciq.DAOlayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import com.ciq.Pojo.Employee;

public class EmpRowMapper implements RowMapper<Employee>{

	private static Logger lg=LoggerFactory.getLogger(EmpRowMapper.class);
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		lg.info("custom empRowmapper started here....");
		
		Employee emp=new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getDouble(3));
		lg.debug("custom empRowMapper ended execution here...");

		return emp;
		
	}

}
