package com.ciq.Bean;

public class Student {
  private int id;
  private String name;
  private double fee;
  private String email;
  
  
public Student(int id, String name, double fee, String email) {
	super();
	this.id = id;
	this.name = name;
	this.fee = fee;
	this.email = email;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getFee() {
	return fee;
}


public void setFee(double fee) {
	this.fee = fee;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", email=" + email + "]";
}
  
  

}
