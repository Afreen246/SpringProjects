package com.ciq.DAOlayer;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ciq.ControolerLayer.EmpController;
import com.ciq.ServiceLayer.EmpServiceIMPL;


@Configuration
@ComponentScan(basePackages = "com.ciq.*")
@EnableTransactionManagement(proxyTargetClass = true)
public class JavaConfig {
	
	public DataSource getDataSource() {
		BasicDataSource ds=new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/ConnectionPoolDB");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("afreen");
		
		System.out.println(ds);
		return ds;
	}
	
	
	@Bean
	public JdbcTemplate jdbctemp() {
		return new JdbcTemplate(getDataSource());
	}
	
	@Bean
	public EmpDAOImpl getDaoimpl() {
		EmpDAOImpl imp=new EmpDAOImpl();
		 imp.setJdbctemp(jdbctemp());
		 return imp;
	}
	
	@Bean
	public EmpServiceIMPL getSERviceimpl() {
		EmpServiceIMPL ser=new EmpServiceIMPL();
		ser.setImpl(getDaoimpl());
		return ser;
	}
	
	@Bean
	public EmpController getControler() {
		EmpController ctl=new EmpController();
		ctl.setSer(getSERviceimpl());
		return ctl;
	}
	
	
	@Bean
	public PlatformTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(getDataSource());
		return transactionManager;
	}
}
