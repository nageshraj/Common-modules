package com.wolken.wolkenapp.Exception;

import org.apache.log4j.Logger;

public class ProductPriceException extends Exception {
	
	Logger logger = Logger.getLogger("ProductPriceException");
	
	@Override
	public String toString() {

	logger.warn("ProductPriceException Caught");
	
	return "ProductPrice must be between length 0-10";
	
	}

}
