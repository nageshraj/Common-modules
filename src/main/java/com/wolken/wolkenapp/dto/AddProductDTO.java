package com.wolken.wolkenapp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AddProductDTO {


	private String productName;

	private String productType;

	private double productPrice;

	private int productQuantity;

	private String productAvailability;

}
