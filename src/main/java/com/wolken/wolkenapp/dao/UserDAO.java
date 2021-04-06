package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.UserDTO;
import com.wolken.wolkenapp.entity.UserEntity;

public interface UserDAO {

	public String registerUser(UserEntity userEntity);
	
	public  UserEntity getByUserName(String userName);
	
	
}
