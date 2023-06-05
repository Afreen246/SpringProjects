package com.ciq.Model;


public class LogClass {
	private String username;
	private String psw;
	public LogClass(String username, String psw) {
		super();
		this.username = username;
		this.psw = psw;
	}
	public LogClass() {
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	@Override
	public String toString() {
		return "LogClass [username=" + username + ", psw=" + psw + "]";
	}

}
