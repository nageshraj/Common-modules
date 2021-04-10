package com.wolken.wolkenapp.dto;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter
@Setter
@ToString
public class EditProfileDTO {
	
	private String userName;
	
	private long userPhoneNumber;

	private String userDOB;

	private String gender;

	private String userEmail;

}
