package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.EditProfileDTO;
import com.wolken.wolkenapp.entity.EditProfileEntity;

public interface EditProfileService {

	public String validateAndEditProfile(EditProfileDTO editProfileDTO);
	
	public EditProfileEntity validateAndGetUserByEmail(String email);
}
