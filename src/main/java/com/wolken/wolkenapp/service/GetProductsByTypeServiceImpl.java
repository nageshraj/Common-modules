package com.wolken.wolkenapp.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dao.GetProductsByTypeDAO;
import com.wolken.wolkenapp.entity.AddProductEntity;

@Component
public class GetProductsByTypeServiceImpl implements GetProductsByTypeService {

	@Autowired
	GetProductsByTypeDAO getProductsByTypeDAO;
	
	Logger logger = Logger.getLogger("GetProductsByTypeServiceImpl");
	
	@Override
	public List<AddProductEntity> validateAndGetProductsByType(String productType) {
		// TODO Auto-generated method stub
		
		logger.debug("INSIDE validateAndGetProductsByType()");
		
		return getProductsByTypeDAO.getProductsByType(productType);
	}

}
