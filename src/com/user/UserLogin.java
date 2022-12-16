package com.user;

import com.databases.UserAccount;
import com.exceptions.InvalidInputException;
import com.exceptions.PasswordSizeException;
import com.services.UserServices;

import java.nio.channels.AcceptPendingException;
import java.util.*;


public class UserLogin {
	UserServices accServices;
	static UserAccount acc;

	
	
	//Scanner
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])  {
		UserServices as1 = new UserServices();
		
		//username
		System.out.print("Enter Username Here : ");
		String username = sc.nextLine();
		
		//password
		System.out.print("Enter Password Here : ");
		String password = sc.nextLine();
		
		//security question
		String question = "What Is Your Favorite Game ? ";
		System.out.println(question);
		
		//security answer
		System.out.println("Enter Answer Here : ");
		String ans = sc.nextLine();
		System.out.println();
		
//operations
//1] Signup (Creat Account)
		
		System.out.println("SignUp Started....");
		try {
			as1.signUp(username, password, ans);
		} catch (PasswordSizeException e) {
			e.printStackTrace();
		}

		System.out.println();
		
		
		
		
//2] SignIn
//		try {
//			System.out.println("Sign In Started....");
//			try {
//				as1.signIn(username, password);
//			} catch (InvalidInputException e) {
//				e.printStackTrace();
//			}
//		} catch (PasswordSizeException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println();
		
		
//3]Forgot Password
//		try {
//			System.out.println("Forgot Password Process Started....");
//			as1.forgotPass(username, ans);
//		} catch (InvalidInputException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println();
//		
		
		
//4]Update Password
//		try {
//			System.out.println("Update Password Process Started....");
//			try {
//				as1.updatePassword(username, password);
//			} catch (InvalidInputException e) {
//				e.printStackTrace();
//			}
//		} catch (PasswordSizeException e) {
//			
//			e.printStackTrace();
//		}
//		
//		System.out.println();
//
//		
	}
}
