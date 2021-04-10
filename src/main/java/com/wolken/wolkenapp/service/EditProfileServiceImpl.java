package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dao.EditProfileDAO;
import com.wolken.wolkenapp.dto.EditProfileDTO;
import com.wolken.wolkenapp.entity.EditProfileEntity;

@Component
public class EditProfileServiceImpl implements EditProfileService {

	@Autowired
	EditProfileDAO editProfileDAO;
	
	Logger logger = Logger.getLogger("EditProfileServiceImpl");

	@Override
	public String validateAndEditProfile(EditProfileDTO editProfileDTO) {
		// TODO Auto-generated method stub
		
		logger.debug("INSIDE validateAndEditProfile() ");

		return editProfileDAO.editProfile(editProfileDTO);
		
		

	}

	@Override
	public EditProfileEntity validateAndGetUserByEmail(String email) {
		// TODO Auto-generated method stub
		
		logger.debug("INSIDE validateAndGetUserByEmail() ");

		
		return	editProfileDAO.getUserByEmail(email);
		
		
		
	}

}
