package com.sbt.dto;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EmployeeDto {
	private long eid;
	private String ename;
	private double esal;
	
	private List<Long> pids;
	
	private long depid;
	
}
