package com.ciq.DAO;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ciq.Bean.Student;

//@Component
@Repository
public class StudentDaoIMPL implements StudentDAO{

	public void save(Student st) {
        System.out.println(st);		
	}

	public List<Student> getStudent() {
       System.out.println("list of student");
		return null;
	}

}
