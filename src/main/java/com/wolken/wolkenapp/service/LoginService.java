package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.entity.LoginEntity;

public interface LoginService {
	
	public LoginEntity validateAndLogin(LoginDTO loginDTO);

}
