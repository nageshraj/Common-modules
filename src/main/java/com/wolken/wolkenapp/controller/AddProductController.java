package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.AddProductDTO;
import com.wolken.wolkenapp.service.AddProductService;

@Controller
@RequestMapping("/")
public class AddProductController {

	@Autowired
	AddProductService addProductService;
	
	Logger logger = Logger.getLogger("AddProductController");
	

	@RequestMapping("/addProduct.do")
	public String getProductsByType(@ModelAttribute AddProductDTO addProductDTO, HttpServletRequest req) {

		logger.debug("INSIDE addProduct.do");
		
		String msg = addProductService.validateAndAddProduct(addProductDTO);

		req.setAttribute("msg", msg);
		return "successfulLogin.jsp";
		
	}

}
