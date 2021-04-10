package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.EditProfileDTO;
import com.wolken.wolkenapp.entity.EditProfileEntity;

public interface EditProfileDAO {

	public String editProfile(EditProfileDTO editProfileDTO);
	
	public EditProfileEntity getUserByEmail(String email);
}
