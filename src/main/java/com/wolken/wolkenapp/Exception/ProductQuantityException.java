package com.wolken.wolkenapp.Exception;

import org.apache.log4j.Logger;

public class ProductQuantityException extends Exception{

	
	Logger logger = Logger.getLogger("ProductQuantityException");
	
	@Override
	public String toString() {
		
		logger.error("ProductQuantityException Caught");
		
		return "ProductQuantity must be between length 1-5";
		
	}
}
