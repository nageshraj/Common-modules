package com.wolken.wolkenapp.Exception;

import org.apache.log4j.Logger;

public class ProductNameException extends Exception {

	Logger logger = Logger.getLogger("ProductNameException");
	
	@Override
	public String toString() {

		logger.error("ProductNameException Caught");
	
		return "ProductName must be between 3-18";
	}
}
