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

import com.sbt.dto.ProjectDto;
import com.sbt.entity.Project1;
import com.sbt.service.ProjectService;

@RestController
@RequestMapping("/Project")
public class ProjectController {
	@Autowired
	private ProjectService service;
	
	@GetMapping("/getAllPrj")
	public List<Project1> getAll(){
		return service.getAll();
	}
	@PostMapping("/insertPrj")
	public Project1 save(@RequestBody ProjectDto prj) {
		return service.insert(prj);
	}
	
	@PutMapping("/updatePrj")
	public Project1 update(@RequestBody ProjectDto dto) {
		return service.update(dto);
	}
	
	@DeleteMapping("/deletPrj/{pid}")
	public String delete(@PathVariable ("pid") long pid) {
		service.delete(pid);
		return "deleted successfully";
	}
	
	@GetMapping("/getpid/{pid}")
	public Project1 getbyid(@PathVariable ("pid") long pid) {
		return service.getbyid(pid);
	}
}
