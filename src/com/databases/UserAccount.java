package com.databases;

public class UserAccount {
	private String userName;
	private String password;
	private String sqn = "Enter Your Teachers Name : ";
	private String sqa;

	
//	constructor
	public UserAccount(String userName,String password,String sqa) {
		this.userName = userName;
		this.password = password;
		this.sqa = sqa;
	}
	
//	setter
	public void setUsername(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}	
	
	public void setSqa(String sqa) {
		this.sqa = sqa;	
	}
	
//	getter
	public String getUsername() {
		return this.userName; 
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getSqn() {
		return this.sqn;
	}
	
	public String getSqa() {
		return this.sqa;	
	}
	
	//toString 
	public String toString() {
		return("User Name : "+this.userName+" Password : "+this.password+" Security Question Is : "+this.sqn+" Security Questions Answer Is : "+this.sqa);
	}
	
	
}
