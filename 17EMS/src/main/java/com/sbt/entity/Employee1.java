package com.sbt.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder

@Entity
public class Employee1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eid;
	private String ename;
	private double esal;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Project1> projects;
	
	@ManyToOne(cascade = CascadeType.ALL)
//	@JsonIgnore
	private Department1 dept;
}
