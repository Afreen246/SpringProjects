package com.ciq.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.ciq.Pojo.Employee;

@Component
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private JdbcTemplate jdbctemp;

//	public EmpDaoImpl(JdbcTemplate jdbctemp) {
//		super();
//		this.jdbctemp = jdbctemp;
//	}

	public void save(Employee emp) {

		int i = jdbctemp.update("insert into employee values(?,?,?)",
				new Object[] { emp.getId(), emp.getName(), emp.getSalary() });
		System.out.println(i);
	}

	// DriverManagerDataSource

}
