package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.RegistrationDTO;

public interface RegistrationService {
	
	public String validateAndRegisterUser(RegistrationDTO registrationDTO);

}
