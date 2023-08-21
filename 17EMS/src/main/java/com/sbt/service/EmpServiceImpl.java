package com.sbt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbt.dao.DepartmentRepo;
import com.sbt.dao.EmployeeRepo;
import com.sbt.dao.ProjectRepo;
import com.sbt.dto.EmployeeDto;
import com.sbt.entity.Department1;
import com.sbt.entity.Employee1;
import com.sbt.entity.Project1;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmployeeRepo emprepo;
	
	@Autowired
	private DepartmentRepo deprepo;
	
	@Autowired
	private ProjectRepo prjrepo;
	
	@Override
	public List<Employee1> getAll() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public Employee1 insert(EmployeeDto empdto) {
		// TODO Auto-generated method stub
		Department1 department=deprepo.findById(empdto.getDepid()).get();
		List<Project1> project=prjrepo.findAllById(empdto.getPids());
		
		return emprepo.save(Employee1.builder().ename(empdto.getEname())
							.esal(empdto.getEsal())
							.dept(department)
							.projects(project)
							.build());

	}

	@Override
	public Employee1 update(EmployeeDto empdto) {
		Department1 department=deprepo.findById(empdto.getDepid()).get();
		List<Project1> project=prjrepo.findAllById(empdto.getPids());
		
		return emprepo.save(Employee1.builder().eid(empdto.getEid()).ename(empdto.getEname())
							.esal(empdto.getEsal())
							.dept(department)
							.projects(project)
							.build());

	}

	@Override
	public void delete(long eid) {
		// TODO Auto-generated method stub
		emprepo.deleteById(eid);
	}

	@Override
	public Employee1 getById(long eid) {
		// TODO Auto-generated method stub
		return emprepo.findById(eid).get();
	}
	
}
