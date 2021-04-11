package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.EditProfileDTO;
import com.wolken.wolkenapp.entity.EditProfileEntity;
import com.wolken.wolkenapp.service.EditProfileService;

@Controller
@RequestMapping("/")
public class EditProfileController {

	@Autowired
	EditProfileService editProfileService;

	Logger logger = Logger.getLogger("EditProfileController");

	@RequestMapping("/editProfile.do")
	public String editProfile(@ModelAttribute EditProfileDTO editProfileDTO, HttpServletRequest req) {

		editProfileService.validateAndEditProfile(editProfileDTO);

		return "successfulLogin.jsp";

	}

	@RequestMapping("/getUser.do")
	public String getUserbyEmail(HttpServletRequest req) {

		logger.debug("INSIDE getUser.do");

		String email = req.getParameter("emailToGetUser");
		logger.debug("emailToGetUser: " + email);

		EditProfileEntity editProfileEntity = editProfileService.validateAndGetUserByEmail(email);
		if (editProfileEntity == null) {
			req.setAttribute("msg", "USER DOES NOT EXIST");
			return "final.jsp";
		}
		req.setAttribute("userToUpdate", editProfileEntity);
		return "EditProfile.jsp";

	}

}
