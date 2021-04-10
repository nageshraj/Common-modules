package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.entity.AddProductEntity;

public interface GetProductsByTypeService{

	public List<AddProductEntity> validateAndGetProductsByType(String productType);
}
