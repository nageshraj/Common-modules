package com.wolken.wolkenapp.Exception;

import org.apache.log4j.Logger;

public class ProductTypeException extends Exception{

	Logger logger = Logger.getLogger("ProductTypeException");
	
	@Override
	public String toString() {
		
		logger.warn("ProductTypeException Caught");
		
		return "ProductType must be between 3-18";
	}
}
