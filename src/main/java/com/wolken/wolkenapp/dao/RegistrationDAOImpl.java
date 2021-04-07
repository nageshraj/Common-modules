package com.wolken.wolkenapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.entity.UserEntity;

@Component
public class RegistrationDAOImpl implements RegistrationDAO {

	@Autowired
	LocalSessionFactoryBean bean;

	@Override
	public String registerUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(userEntity);
		transaction.commit();
		session.close();

		return "SUCCESSFULLY ADDED";

	}
	
	
	public  UserEntity getByUserName(String userName) {
	SessionFactory factory=bean.getObject();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	Query query = session.createQuery("From UserEntity UE where UE.userName=:uName");
	query.setParameter("uName", userName);
	UserEntity userEntity= (UserEntity) query.uniqueResult();
	
	return userEntity;
			
	}

}
