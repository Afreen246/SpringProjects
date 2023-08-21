package com.sbt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbt.entity.Project1;

public interface ProjectRepo extends JpaRepository<Project1, Long>{

}
