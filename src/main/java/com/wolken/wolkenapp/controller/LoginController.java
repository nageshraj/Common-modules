package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.service.LoginService;

@Component
@RequestMapping("/")
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping("/login.do")
	public String login(@ModelAttribute LoginDTO loginDTO, HttpServletRequest req) {
		String msg=loginService.validateAndLogin(loginDTO);
		req.setAttribute("msg", msg);
		
		return "final.jsp";
	}

}
