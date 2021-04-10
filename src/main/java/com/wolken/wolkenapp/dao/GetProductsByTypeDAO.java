package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.entity.AddProductEntity;

public interface GetProductsByTypeDAO {

	public List<AddProductEntity> getProductsByType(String productType);
}
