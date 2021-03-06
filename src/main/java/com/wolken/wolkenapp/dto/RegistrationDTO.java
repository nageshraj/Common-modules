package com.wolken.wolkenapp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegistrationDTO {

	private String userName;

	private String userEmailId;

	private long userPhoneNumber;

	private String userDOB;

	private String gender;

	private String userPassword;

	private String confirmUserPassword;

}
