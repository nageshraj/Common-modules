package com.wolken.wolkenapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.entity.LoginEntity;
import com.wolken.wolkenapp.service.LoginService;

@Component
@RequestMapping("/")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	Logger logger = Logger.getLogger("LoginController");

	@RequestMapping("/login.do")
	public String login(@ModelAttribute LoginDTO loginDTO, HttpServletRequest req) {

		logger.debug("INSIDE login.do");
		
		String msg = null;
		LoginEntity loginEntity = loginService.validateAndLogin(loginDTO);
		if (loginEntity == null) {
			msg = "UserName/Password Incorrect";
			req.setAttribute("msg", msg);
			return "final.jsp";
		} else {

			req.setAttribute("loggedIn", loginEntity);
			return "successfulLogin.jsp";
		}

	}

}
