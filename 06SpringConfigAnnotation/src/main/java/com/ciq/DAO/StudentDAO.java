package com.ciq.DAO;

import java.util.List;

import com.ciq.Bean.Student;

public interface StudentDAO {

	public void save(Student st);
	
	public List<Student> getStudent();
}
