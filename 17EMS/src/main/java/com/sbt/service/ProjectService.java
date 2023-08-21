package com.sbt.service;

import java.util.List;

import com.sbt.dto.ProjectDto;
import com.sbt.entity.Project1;

public interface ProjectService {

	public List<Project1> getAll();
	
	public Project1 insert(ProjectDto dto);
	
	public Project1 update(ProjectDto dto);
	
	public void delete(long id);
	
	public Project1 getbyid(long id);
}
