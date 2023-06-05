package com.ciq.DAO;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.model.Employee;


@Repository
public class EmpDaoImpl implements EmpDao{
	
	@Autowired
     public JdbcTemplate jdbcTemp;
	
	@Override
	public void save(Employee emp) {

		String sql="insert into Employee values(?,?,?)";
		jdbcTemp.update(sql, new Object[] {emp.getId(),emp.getName(),emp.getSalary()});
	}

	@Override
	public List<Employee> listEmp() {
		BeanPropertyRowMapper<Employee> bean=new BeanPropertyRowMapper<>(Employee.class);
		System.out.println("list of the employees:"+bean);
		return jdbcTemp.query("select *from employee", bean);
	}

	@Override
	public void empUpdate(Employee updt) {
		String sql="update employee set name=?,salary=? where id=?";
		jdbcTemp.update(sql,new Object[] {updt.getName(),updt.getSalary(),updt.getId()});
		
	}

	@Override
	public Employee getById(int id) {
       String sql="select * from employee where id=?";
       return jdbcTemp.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class),id);
	}

	@Override
	public void delete(int id) {
    jdbcTemp.update("delete from employee where id=?",id);		
	}

}
