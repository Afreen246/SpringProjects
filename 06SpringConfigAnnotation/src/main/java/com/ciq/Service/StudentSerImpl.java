package com.ciq.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ciq.Bean.Student;
import com.ciq.DAO.StudentDaoIMPL;

//@Component
@Service
public class StudentSerImpl implements StudentService{

	@Autowired
	private StudentDaoIMPL imp;

	//setter
//	public void setImp(StudentDaoIMPL imp) {
//		this.imp = imp;
//	}

	public void save(Student st) {
		imp.save(st);
	}

	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return imp.getStudent();
	}

}
