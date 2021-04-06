package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.UserDTO;
import com.wolken.wolkenapp.service.UserService;

@Component
@RequestMapping("/")
public class UserController {

	@Autowired
	UserService userService;
	
		
	@RequestMapping("/register.do")
	public String register(@ModelAttribute UserDTO userDTO,HttpServletRequest req) {
		
		String msg = userService.validateAndRegisterUser(userDTO);
		
		req.setAttribute("msg", msg);
		return "final.jsp";
		
		
	}
}
