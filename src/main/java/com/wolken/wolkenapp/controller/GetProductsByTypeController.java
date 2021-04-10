package com.wolken.wolkenapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.entity.AddProductEntity;
import com.wolken.wolkenapp.service.GetProductsByTypeService;

@Controller
@RequestMapping("/")
public class GetProductsByTypeController {
	
	Logger logger = Logger.getLogger("GetProductsByTypeController");


	@Autowired
	GetProductsByTypeService getProductsByTypeService;

	@RequestMapping("/getProductsByType.do")
	public String getProductsByType(HttpServletRequest req) {
		
		logger.debug("INSIDE getProductsByType.do ");

		String type = req.getParameter("productTypeToRetrieve");

		logger.debug("productTypeToRetrieve: "+ type);

		List<AddProductEntity> productsList = getProductsByTypeService.validateAndGetProductsByType(type);

		logger.debug("productsList: "+ productsList);
		
		req.setAttribute("productsList", productsList);

		return "successfulLogin.jsp";

	}

}
