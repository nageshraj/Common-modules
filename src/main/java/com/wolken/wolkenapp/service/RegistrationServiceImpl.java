package com.wolken.wolkenapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dao.RegistrationDAO;
import com.wolken.wolkenapp.dto.RegistrationDTO;
import com.wolken.wolkenapp.entity.UserEntity;

@Component
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationDAO registrationDAO;

	@Override
	public String validateAndRegisterUser(RegistrationDTO registrationDTO) {
		// TODO Auto-generated method stub

		UserEntity userEntity = new UserEntity();
		userEntity = registrationDAO.getByUserName(registrationDTO.getUserName());

		if (userEntity == null) {
			userEntity.setUserName(registrationDTO.getUserName());
			userEntity.setConfirmUserPassword(registrationDTO.getConfirmUserPassword());
			userEntity.setGender(registrationDTO.getGender());
			userEntity.setUserDOB(registrationDTO.getUserDOB());
			userEntity.setUserEmailId(registrationDTO.getUserEmailId());
			userEntity.setUserPassword(registrationDTO.getUserPassword());
			userEntity.setUserPhoneNumber(registrationDTO.getUserPhoneNumber());

			return registrationDAO.registerUser(userEntity);
		} else {
			return "USER ALREADY EXISTS";
		}
	}

}
