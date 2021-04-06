package com.wolken.wolkenapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dao.UserDAO;
import com.wolken.wolkenapp.dto.UserDTO;
import com.wolken.wolkenapp.entity.UserEntity;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	@Override
	public String validateAndRegisterUser(UserDTO userDTO) {
		// TODO Auto-generated method stub

		UserEntity userEntity = new UserEntity();
		userEntity = userDAO.getByUserName(userDTO.getUserName());

		if (userEntity == null) {
			userEntity.setUserName(userDTO.getUserName());
			userEntity.setConfirmUserPassword(userDTO.getConfirmUserPassword());
			userEntity.setGender(userDTO.getGender());
			userEntity.setUserDOB(userDTO.getUserDOB());
			userEntity.setUserEmailId(userDTO.getUserEmailId());
			userEntity.setUserPassword(userDTO.getUserPassword());
			userEntity.setUserPhoneNumber(userDTO.getUserPhoneNumber());

			return userDAO.registerUser(userEntity);
		} else {
			return "USER ALREADY EXISTS";
		}
	}

}
