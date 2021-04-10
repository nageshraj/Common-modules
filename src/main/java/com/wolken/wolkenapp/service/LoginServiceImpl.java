package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dao.LoginDAO;
import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.entity.LoginEntity;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDAO;
	
	Logger logger = Logger.getLogger("GetProductsByTypeServiceImpl");


	@Override
	public LoginEntity validateAndLogin(LoginDTO loginDTO) {
		
		logger.debug("INSIDE validateAndLogin");

		LoginEntity loginEntity = loginDAO.getByUserName(loginDTO.getLoginUserName());
		if (loginEntity != null) {
			if (loginDTO.getLoginUserName().equals(loginEntity.getUserName())) {
				if (loginDTO.getLoginUserPassword().equals(loginEntity.getUserPassword())) {
					return loginEntity;
				}
			} else {
				return null;
			}
		} 
		return null;

	}

}
