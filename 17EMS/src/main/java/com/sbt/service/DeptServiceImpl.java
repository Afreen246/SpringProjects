package com.sbt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbt.dao.DepartmentRepo;
import com.sbt.dto.DepartmentDto;
import com.sbt.entity.Department1;
import com.sbt.exceptionHandling.DepartmentNameNotFoundException;

@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DepartmentRepo repo;
	
	@Override
	public List<Department1> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Department1 insert(DepartmentDto depdto) {
		// TODO Auto-generated method stub
		return repo.save(Department1.builder()
				.dname(depdto.getDname())
				.dlocation(depdto.getDlocation())
				.build()
				);
	}

	@Override
	public Department1 update(DepartmentDto deptdto) {
		// TODO Auto-generated method stub
		return repo.save(Department1.builder()
				.did(deptdto.getDid())
				.dname(deptdto.getDname())
				.dlocation(deptdto.getDlocation())
				.build()
				);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Department1 getbyid(long id) {
		// TODO Auto-generated method stub
		Optional<Department1> optional = repo.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		Department1 dep=optional.get();
		if(dep.getDname().equals("")) {
			throw new DepartmentNameNotFoundException("dept name not recognizing");
		}
		return optional.get();
	}

}
