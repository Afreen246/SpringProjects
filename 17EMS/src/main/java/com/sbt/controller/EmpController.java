package com.sbt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbt.dto.EmployeeDto;
import com.sbt.entity.Employee1;
import com.sbt.service.EmpService;

@RestController
@RequestMapping("/Employee")
public class EmpController {
	@Autowired
	private EmpService service;
	
	@GetMapping("/getemp")
	public List<Employee1> findAll()
	{
		return service.getAll();
	}
	
	@PostMapping("/saveEmp")
	public Employee1 save(@RequestBody EmployeeDto dto) {
		return service.insert(dto);
	}
	
	@PutMapping("/updateEmp")
	public Employee1 update(@RequestBody EmployeeDto dto) {
		return service.update(dto);
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public String delete(@PathVariable ("id") long id) {
		service.delete(id);
		return "deleted successfully";
	}
	
	@GetMapping("/getid/{id}")
	public Employee1 getById(@PathVariable ("id") long eid) {
		return service.getById(eid);
	}
}
