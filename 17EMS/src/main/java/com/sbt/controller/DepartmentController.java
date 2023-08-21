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

import com.sbt.dto.DepartmentDto;
import com.sbt.entity.Department1;
import com.sbt.service.DeptService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DeptService service;
	
	@GetMapping("/getAllDept")
	public List<Department1> getAll(){
		return service.getAll();
	}
	@PostMapping("/saveDep")
	public Department1 save(@RequestBody DepartmentDto dto) {
		return service.insert(dto);
	}
	
	@PutMapping("/update")
	public Department1 update(@RequestBody DepartmentDto dto) {
		return service.update(dto);
	}
	
	@DeleteMapping("/deletedid/{did}")
	public String delete(@PathVariable ("did") long id) {
		service.delete(id);
		return "successfully deleted";
	}
	
	@GetMapping("/getDId/{did}")
	public Department1 getbyid(@PathVariable ("did") long did) {
		return service.getbyid(did);
	}
}
