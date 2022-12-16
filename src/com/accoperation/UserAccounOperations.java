package com.accoperation;

import com.exceptions.InvalidInputException;
import com.exceptions.PasswordSizeException;

public interface UserAccounOperations {
	void signUp(String username,String password,String sqa)throws PasswordSizeException,InvalidInputException;
	void signIn(String username,String password)throws PasswordSizeException,InvalidInputException;
	void updatePassword(String username,String password)throws PasswordSizeException,InvalidInputException;
	void forgotPass(String username,String sqa) throws InvalidInputException;
}
