package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.entity.LoginEntity;

public interface LoginDAO {

	public LoginEntity getByUserName(String userName);
}
