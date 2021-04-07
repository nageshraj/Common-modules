package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.entity.UserEntity;

public interface RegistrationDAO {

	public String registerUser(UserEntity userEntity);
	
	public  UserEntity getByUserName(String userName);
	
	
}
