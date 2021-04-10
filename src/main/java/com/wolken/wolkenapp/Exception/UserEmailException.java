package com.wolken.wolkenapp.Exception;

import org.apache.log4j.Logger;

public class UserEmailException extends Exception {

	Logger logger = Logger.getLogger("UserEmailException");

	@Override
	public String toString() {

		logger.error("UserEmailException Caught");

		return "Email must be between length 5-56";

	}

}
