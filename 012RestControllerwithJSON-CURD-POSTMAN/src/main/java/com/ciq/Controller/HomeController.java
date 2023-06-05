package com.ciq.Controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.DAO.EmpDaoImpl;
import com.ciq.model.Employee;

@RestController
//@Controller
//@RequestMapping("/home")
public class HomeController {

	@Autowired
	private EmpDaoImpl d;
	

	
	private static List<Employee> l=new ArrayList<>();
	
	static {
		 l=new ArrayList<>();
		l.add(new Employee(1, "aaaa",25000.00));
		l.add(new Employee(2, "ssss",35000.00));
		l.add(new Employee(3, "vvvv",4000.00));
	}
	
	//@ResponseBody
	@GetMapping("/getall")
	public List<Employee> getAll(){
		System.out.println(l);
		return l;
	}
	
	//@ResponseBody
	@GetMapping("/getemps")
	public List<Employee> getallEmps(){
		
		return d.listEmp();
	}
	
	
	
	@RequestMapping(value = "/save",method=RequestMethod.POST)
	public void insert(@RequestBody Employee e1) {
		//Employee e=new Employee(91, "kaveri", 55000);
		d.save(e1);
	}
	
	@RequestMapping(value = "/updt",method = RequestMethod.POST)
	public void update12(@RequestBody Employee e) {
		d.empUpdate(e);
	}

	@RequestMapping(value = "/dlt/{id}")
	public void deleted(@PathVariable int id) {
		d.delete(id);
		
	}
}
