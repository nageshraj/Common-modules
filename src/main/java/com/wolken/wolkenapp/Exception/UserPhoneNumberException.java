package com.wolken.wolkenapp.Exception;

import org.apache.log4j.Logger;

public class UserPhoneNumberException extends Exception{
	
	Logger logger = Logger.getLogger("UserPhoneNumberException");
	
	@Override
	public String toString() {
		
		logger.error("UserPhoneNumberException Caught");

		return "Phone Number must contain 10 digits";
	
	}

}
