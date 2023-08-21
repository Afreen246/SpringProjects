package com.sbt.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@Entity
public class Department1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long did;
	private String dname;
	private String dlocation;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "dept")
	@JsonIgnore
	private List<Employee1> employees;
}
