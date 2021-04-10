package com.wolken.wolkenapp.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.entity.AddProductEntity;

@Component
public class AddProductDAOImpl implements AddProductDAO {
	
	@Autowired
	LocalSessionFactoryBean bean;
	
	Logger logger = Logger.getLogger("AddProductDAOImpl");

	@Override
	public String addProduct(AddProductEntity addProductEntity) {

		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(addProductEntity);
		transaction.commit();
		session.close();
		
		logger.debug("PROUDCT SUCCESSFULLY ADDED");

		return "PROUDCT SUCCESSFULLY ADDED";
	
	}

}
