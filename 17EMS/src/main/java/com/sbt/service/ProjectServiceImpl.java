package com.sbt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbt.dao.ProjectRepo;
import com.sbt.dto.ProjectDto;
import com.sbt.entity.Project1;

@Service
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	private ProjectRepo repo;
	
	@Override
	public List<Project1> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Project1 insert(ProjectDto dto) {
		// TODO Auto-generated method stub
		return repo.save(Project1.builder()
				.pname(dto.getPname())
				.build());
	}

	@Override
	public Project1 update(ProjectDto dto) {
		// TODO Auto-generated method stub
		return repo.save(Project1.builder()
				.pid(dto.getPid())
				.pname(dto.getPname())
				.build());
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Project1 getbyid(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}
