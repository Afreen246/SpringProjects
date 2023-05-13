package com.ciq.DAOlayer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ciq.Pojo.Employee;


public class EmpDAOImpl implements EmpDaoLayer{
	
	//private JdbcTemplate jdbctemp;
	
	//@Autowired
	private JdbcTemplate jdbctemp;
	
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	private static Logger LOGS = LoggerFactory.getLogger(EmpDAOImpl.class);

	public void save(Employee emp) {
//		LOGS.info("EmpDaAOimpl save method started....");
//		String insert="insert into employee values(?,?,?)";
//		int res=jdbctemp.update(insert,new Object[] {emp.getId(),emp.getName(),emp.getSalary()} );
//		System.out.println(res+":inserted sucessfully...");
//		
//		LOGS.info(res+":value inserted sucessfully...");
//
//		LOGS.info("EmpDaAOimpl save method ended here....");

	}

	public void customupdate(int id, String name,double salary) {
      LOGS.info("DAOimpl customUpdate() starts here.....");
		
		String updt="update employee set name=?, salary=? where id=?";
      
      int res=jdbctemp.update(updt,name,salary,id);
      
      System.out.println(res+":updated successfully...");
      
      LOGS.info(res+":updated successfully...");
      LOGS.info("DAOIMPL custom update method end here...");
	}

	public void delete(int id) {
		LOGS.info("DAOimpl delete() start here...");
		String dlt = "delete from employee where id=?";
		int res = jdbctemp.update(dlt, id);
		System.out.println(res+":deleted successfully...");
		
		LOGS.info(id+":deleted successfully...");
		LOGS.info("DAOimpl delete() ended here....");
	}

	public List<Employee> getEmployees() {
		LOGS.info("DAOimpl getEmployee() started here....");
		RowMapper<Employee> rmap=new RowMapper<Employee>() {
			
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				LOGS.info("mapROW() in RowMapper anonymous block...");
				Employee emp=new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				
				return emp;
			}
		};
		
		LOGS.info("rowmap block end here.... ");
		List<Employee> list=jdbctemp.query("select * from employee", rmap);
		
		LOGS.info(list+"list of employee...");

		LOGS.info("DAOimpl getEmployee()ended here...");
		return list;
	}

	
	//batch process program
	
	//using transaction
	@Transactional
	public int batchUpdate(final List<Employee> emps) {
		String sql="insert into employee values(?,?,?)";
	int rs[]=jdbctemp.batchUpdate(sql,new BatchPreparedStatementSetter() {
		
		public void setValues(PreparedStatement ps, int i) throws SQLException {
              //ps.setInt(1, emps.get(i).getId());
              Employee e=emps.get(i);
              ps.setInt(1, e.getId());
              ps.setString(2, e.getName());
              ps.setDouble(3, e.getSalary());
              
		}
		
		public int getBatchSize() {

			return emps.size();
		}
	});
	
	int i = 0;
	int count = 0;
	for (i = 0; i < rs.length; i++) {
		if (rs[i] == 1) {
		//if(rs[i])
			count++;
		}
		System.out.println("no.of queries:"+count);
	}
	System.out.println(Arrays.toString(rs));
	
		return count;
	}

	
	

}
