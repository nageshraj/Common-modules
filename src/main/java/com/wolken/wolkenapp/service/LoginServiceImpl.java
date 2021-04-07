package com.wolken.wolkenapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dao.LoginDAO;
import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.entity.LoginEntity;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDAO;

	@Override
	public String validateAndLogin(LoginDTO loginDTO) {

		LoginEntity loginEntity = loginDAO.getByUserName(loginDTO.getLoginUserName());
		if (loginEntity != null) {
			if (loginDTO.getLoginUserName().equals(loginEntity.getUserName())) {
				if (loginDTO.getLoginUserPassword().equals(loginEntity.getUserPassword())) {
					return "LOGIN SUCCESSFUL";
				}
			} else {
				return "USERNAME/PASSWORD INCORRECT";
			}
		} 
		return "USERNAME/PASSWORD INCORRECT";

	}

}
