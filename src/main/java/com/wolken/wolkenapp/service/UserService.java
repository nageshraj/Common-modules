package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.UserDTO;
import com.wolken.wolkenapp.entity.UserEntity;

public interface UserService {
	
	public String validateAndRegisterUser(UserDTO userDTO);

}
