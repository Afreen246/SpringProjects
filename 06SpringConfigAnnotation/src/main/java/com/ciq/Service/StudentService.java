package com.ciq.Service;

import java.util.List;

import com.ciq.Bean.Student;

public interface StudentService {

	public void save(Student st);
	
	public List<Student> getStudent();
	
}
