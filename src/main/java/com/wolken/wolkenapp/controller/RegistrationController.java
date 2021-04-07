package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

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
	
		
	@RequestMapping("/register.do")
	public String register(@ModelAttribute RegistrationDTO registrationDTO,HttpServletRequest req) {
		
		String msg = registrationService.validateAndRegisterUser(registrationDTO);
		
		req.setAttribute("msg", msg);
		return "final.jsp";
		
		
	}
}
