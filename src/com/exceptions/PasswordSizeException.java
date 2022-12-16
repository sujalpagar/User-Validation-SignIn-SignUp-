package com.exceptions;

public class PasswordSizeException extends Exception {
	private String msg;
	
	public PasswordSizeException(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		return ""+msg;
	}
}
