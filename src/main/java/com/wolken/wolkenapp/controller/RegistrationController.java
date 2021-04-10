package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.RegistrationDTO;
import com.wolken.wolkenapp.service.RegistrationService;

@Component
@RequestMapping("/")
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;
	
	Logger logger = Logger.getLogger("RegistrationController");
	
		
	@RequestMapping("/register.do")
	public String register(@ModelAttribute RegistrationDTO registrationDTO,HttpServletRequest req) {
		
		logger.debug("INSIDE register.do");
		
		String msg = registrationService.validateAndRegisterUser(registrationDTO);
		
		req.setAttribute("msg", msg);
		return "final.jsp";
		
		
	}
}
