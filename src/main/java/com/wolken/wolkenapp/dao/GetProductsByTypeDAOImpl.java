package com.wolken.wolkenapp.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.entity.AddProductEntity;

@Component
public class GetProductsByTypeDAOImpl implements GetProductsByTypeDAO {

	@Autowired
	LocalSessionFactoryBean bean;
	
	Logger logger = Logger.getLogger("GetProductsByTypeDAOImpl");

	
	@Override
	public List<AddProductEntity> getProductsByType(String productType) {
		
		logger.debug("INSIDE getProductsByType() ");

		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("select ape from AddProductEntity ape where ape.productType =:pType");
		query.setParameter("pType", productType);
		
		List<AddProductEntity> productsList = query.list(); 

		transaction.commit();
		session.close();
		
		return productsList;
	
	}

}
