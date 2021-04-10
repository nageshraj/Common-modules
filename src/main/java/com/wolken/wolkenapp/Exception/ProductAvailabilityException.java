package com.wolken.wolkenapp.Exception;

import org.apache.log4j.Logger;

public class ProductAvailabilityException extends Exception{
	
	Logger logger = Logger.getLogger("ProductAvailabilityException");
	
	@Override
	public String toString() {

	logger.error("ProductAvailabilityException Caught");
	
	return "Product Availability can be either YES/NO";
	
	}

}
