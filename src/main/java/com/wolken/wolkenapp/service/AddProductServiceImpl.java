package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.Exception.ProductAvailabilityException;
import com.wolken.wolkenapp.Exception.ProductNameException;
import com.wolken.wolkenapp.Exception.ProductTypeException;
import com.wolken.wolkenapp.dao.AddProductDAO;
import com.wolken.wolkenapp.dto.AddProductDTO;
import com.wolken.wolkenapp.entity.AddProductEntity;

@Component
public class AddProductServiceImpl implements AddProductService {

	@Autowired
	AddProductDAO addProductDAO;

	Logger logger = Logger.getLogger("AddProductServiceImpl");

	@Override
	public String validateAndAddProduct(AddProductDTO addProductDTO) {
		// TODO Auto-generated method stub

		logger.debug("INSIDE validateAndAddProduct() ");

		if (addProductDTO != null) {

			AddProductEntity addProductEntity = new AddProductEntity();

			try {
				if (addProductDTO.getProductName().length() < 3 || addProductDTO.getProductName().length() > 18)
					throw new ProductNameException();
				else {
					addProductEntity.setProductName(addProductDTO.getProductName());
					if (addProductDTO.getProductType().length() < 3 || addProductDTO.getProductType().length() > 18)
						throw new ProductTypeException();
					else {
						addProductEntity.setProductType(addProductDTO.getProductType());
						addProductEntity.setProductPrice(addProductDTO.getProductPrice());
						addProductEntity.setProductQuantity(addProductDTO.getProductQuantity());

						if (!(addProductDTO.getProductAvailability().equals("YES")
								|| addProductDTO.getProductAvailability().equals("NO")))
							throw new ProductAvailabilityException();
						else {
							addProductEntity.setProductAvailability(addProductDTO.getProductAvailability());

						}

					}
				}

			} catch (ProductNameException | ProductTypeException | ProductAvailabilityException e) {
				e.toString();
			}
			return addProductDAO.addProduct(addProductEntity);
		}
		return null;

	}

}
