package com.sbt.service;

import java.util.List;

import com.sbt.dto.DepartmentDto;
import com.sbt.entity.Department1;

public interface DeptService {
	public List<Department1> getAll();
	
	public Department1 insert(DepartmentDto depdto);
	
	public Department1 update(DepartmentDto deptdto);
	
	public void delete(long id);
	
	public Department1 getbyid(long id);
}
