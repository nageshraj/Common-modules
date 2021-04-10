package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dao.RegistrationDAO;
import com.wolken.wolkenapp.dto.RegistrationDTO;
import com.wolken.wolkenapp.entity.UserEntity;

@Component
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationDAO registrationDAO;

	Logger logger = Logger.getLogger("GetProductsByTypeServiceImpl");

	@Override
	public String validateAndRegisterUser(RegistrationDTO registrationDTO) {
		// TODO Auto-generated method stub

		logger.debug("INSIDE validateAndRegisterUser()");

		UserEntity userEntity = new UserEntity();
		userEntity = registrationDAO.getByUserName(registrationDTO.getUserName());

		if (userEntity == null) {

			UserEntity userEntity1 = new UserEntity();
			userEntity1.setUserName(registrationDTO.getUserName());
			userEntity1.setConfirmUserPassword(registrationDTO.getConfirmUserPassword());
			userEntity1.setGender(registrationDTO.getGender());
			userEntity1.setUserDOB(registrationDTO.getUserDOB());
			userEntity1.setUserEmailId(registrationDTO.getUserEmailId());
			userEntity1.setUserPassword(registrationDTO.getUserPassword());
			userEntity1.setUserPhoneNumber(registrationDTO.getUserPhoneNumber());

			return registrationDAO.registerUser(userEntity1);

		} else {

			return "USER ALREADY EXISTS";
		}
	}

}
