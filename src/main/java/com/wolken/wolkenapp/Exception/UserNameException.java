package com.wolken.wolkenapp.Exception;

public class UserNameException extends Exception {
	
	@Override
	public String toString() {
		
		return "UserName must be between 3-18";
	}

}
