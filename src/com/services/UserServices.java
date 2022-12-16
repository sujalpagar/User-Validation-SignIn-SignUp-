package com.services;
import java.util.*;

import com.accoperation.UserAccounOperations;
import com.databases.UserAccount;
import com.exceptions.InvalidInputException;
import com.exceptions.PasswordSizeException;

public class UserServices implements UserAccounOperations {
	UserAccount acc;
	
	//Scanner
	Scanner sc = new Scanner(System.in);
	
	
	//Create Account (signUp)
	public void signUp(String username,String password,String sqa) throws PasswordSizeException {
		if(username != "" || username != null || password != "" || password != null || sqa != "" || sqa != null ) {
			if(password.length()<8) {
				throw new PasswordSizeException("Password Size Should be Greater Than 8 Characters");
				
			}else {
				acc = new UserAccount(username,password,sqa);
				System.out.println("Account Open Sucessfully");
			}
		}
	}
	
	//Signin
	public void signIn(String username,String password) throws PasswordSizeException,InvalidInputException {
		if(acc.getUsername().equals(username) && acc.getPassword().equals(password)) {
			if(password.length()<8) {
				throw new PasswordSizeException("Password Size Should be Greater Than 8 Characters");
			}else if(username.equals(" ") && username.equals(null)) {
				throw new InvalidInputException("Invalid Input");
			}
			else {
				System.out.println("Welcome "+acc.getUsername());
			}
		}else if(acc.getUsername().equals("") || acc.getPassword().equals("")) {
			throw new InvalidInputException("Invalid Input");
		}
	}
	
	//Update Password
	public void updatePassword(String username,String password) throws PasswordSizeException,InvalidInputException {
		if(acc.getUsername().equals(username) && acc.getPassword().equals(password)) {
			if(password.length()<8) {
				throw new PasswordSizeException("Password Size Should be Greater Than 8 Characters");
			}else {
				System.out.print("Enter New Password Here : ");
				String newPass = sc.nextLine();
				if(newPass.length()<8) {
					throw new PasswordSizeException("Password Size Should be Greater Than 8 Characters");
				}else {
					acc.setPassword(newPass);
					System.out.println("Password Update Successfully...");
				}
			}
		}
	}
	
	//Forgot Password 
	public void forgotPass(String username,String usa) throws InvalidInputException  {
		System.out.print("Enter Your Username : ");
		String uname = sc.nextLine();
		String data = acc.getUsername();
		String data1 = acc.getSqa();
		
		if(data.equals(uname)) {
			System.out.println(acc.getSqn());
			
			usa = sc.nextLine();
			if(data1.equals(usa)) {
				System.out.println();
				System.out.println("User Details Are.... "+"\nUser Id : "+acc.getUsername()+"\nYour Password Is : "+acc.getPassword());
			}else {
//				System.out.println("Invalid Answer....");
				throw new InvalidInputException("Invalid Answer....");
			}
		}else {
			throw new InvalidInputException("Incorrect Username....");
//			System.out.println("Incorrect Username...."); 
		}
	}

}
