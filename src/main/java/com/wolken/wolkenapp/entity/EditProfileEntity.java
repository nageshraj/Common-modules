package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "new_user_table")
public class EditProfileEntity {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "user_name")
	private String userName;
	
	@Column(name="user_email")
	private String userEmailId;

	@Column(name = "user_phone")
	private long userPhoneNumber;

	@Column(name = "user_dob")
	private String userDOB;

	@Column(name = "user_gender")
	private String gender;

}
