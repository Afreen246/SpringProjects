package com.ciq.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ciq.POJO.Employee;
import com.ciq.TemplatePkg.EmpTemplate;

@Repository
public class EmpDaoImpl implements EmpDao {

	@Autowired
	private EmpTemplate emt;

	public void save(Employee emp) {
		int result = emt.update("insert into employee values(?,?,?)",
				new Object[] { emp.getId(), emp.getName(), emp.getSalary() });
		System.out.println(result);

	}

	public List<Employee> getEmployee() {
		System.out.println("list of employees ");
		return null;
	}
}
