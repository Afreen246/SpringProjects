package com.ciq.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.ciq.Pojo.Employee;

@Component
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private JdbcTemplate jdbctemp;



	public void save(Employee emp) {

		int i = jdbctemp.update("insert into employee values(?,?,?)",
				new Object[] { emp.getId(), emp.getName(), emp.getSalary() });
		System.out.println(i);
	}



	public void update(int id, String name) {

		String sql="update employee set name=? where id=?";
		jdbctemp.update(sql, name,id);
		System.out.println("updated..."+id);
	}

	// DriverManagerDataSource : used to open declration copy qualified name
	
	public void delete(int id) {
		String sql="delete from employee where id=?";
		jdbctemp.update(sql, id);
		System.out.println("deleted ..."+id);
	}



	public List<Employee> getEmployees() {
		RowMapper<Employee> rowmap=new RowMapper<Employee>() {
			
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp=new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				
				return emp;
			}
		};
		
		List<Employee> list=jdbctemp.query("select * from employee", rowmap);
		return list;
	}

}
