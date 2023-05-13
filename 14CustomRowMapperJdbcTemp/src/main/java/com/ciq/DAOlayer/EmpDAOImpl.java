package com.ciq.DAOlayer;

import java.rmi.server.LogStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ciq.Pojo.Employee;


@Repository
public class EmpDAOImpl implements EmpDaoLayer{
	
	
	
	@Autowired
	private JdbcTemplate jdbctemp;
	
	private static Logger LOGS = LoggerFactory.getLogger(EmpDAOImpl.class);

	public void save(Employee emp) {
		LOGS.info("EmpDaAOimpl save method started....");
		String insert="insert into employee values(?,?,?)";
		int res=jdbctemp.update(insert,new Object[] {emp.getId(),emp.getName(),emp.getSalary()} );
		System.out.println(res+":inserted sucessfully...");
		
		LOGS.info(res+":value inserted sucessfully...");

		LOGS.info("EmpDaAOimpl save method ended here....");

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
//		RowMapper<Employee> rmap=new RowMapper<Employee>() {
//			
//			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				LOGS.info("mapROW() in RowMapper anonymous block...");
//				Employee emp=new Employee();
//				emp.setId(rs.getInt(1));
//				emp.setName(rs.getString(2));
//				emp.setSalary(rs.getDouble(3));
//				
//				return emp;
//			}
//		};
//		
//		LOGS.info("rowmap block end here.... ");
//		List<Employee> list=jdbctemp.query("select * from employee", rmap);
//		
//		LOGS.info(list+"list of employee...");
//
//		LOGS.info("DAOimpl getEmployee()ended here...");
//		return list;
//	}
		
		//or using custom RowMapper Class
		//RowMapper create nth no.of instance at to nth no.of retrieval records
		
		
		List<Employee> list=jdbctemp.query("select * from employee", new EmpRowMapper());
		
		LOGS.info(list+":list of employees...");
		
	return list;
	}

	@Override
	public List<Employee> findAll() {
		LOGS.info("customResultsetExtractor  using in findAll()...");
		// its created instance only one at a multiple record retrieved
		LOGS.info("findAll() end here........");

		return jdbctemp.query("select * from employee", new CustomResulsetExtractor());
	}

	@Override
	public List<Employee> getEmps() {
		LOGS.info("BeanPropertyRowMapper getEmps()....");
		return jdbctemp.query("select * from employee", new BeanPropertyRowMapper(Employee.class));
	}

	@Override
	public void getById(int id) {
		LOGS.info("getById() started here.....");
		
		String q="select * from employee where id=?";
		List<Employee> query = jdbctemp.query(q, new Object[] {id}, new EmpRowMapper());
		System.out.println(query);
		
		LOGS.info(query+":choosen id result...");
	}

	@Override
	public void getByName(String name) {

		String q="select * from employee where name=?";
		List<Employee> query=jdbctemp.query(q, new Object[] {name}, new EmpRowMapper());
		System.out.println(query);
		LOGS.info(query+"getByName().......");
	}

	
}
