package com.sbt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbt.entity.Employee1;

public interface EmployeeRepo extends JpaRepository<Employee1, Long>{

}
