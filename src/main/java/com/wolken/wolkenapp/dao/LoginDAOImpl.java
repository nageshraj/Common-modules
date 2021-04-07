package com.wolken.wolkenapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.entity.LoginEntity;

@Component
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	LocalSessionFactoryBean bean;

	@Override
	public LoginEntity getByUserName(String userName) {
		// TODO Auto-generated method stub

		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from LoginEntity le where le.userName =:uName");
		query.setParameter("uName", userName);

		LoginEntity loginEntity = (LoginEntity) query.uniqueResult();
		transaction.commit();
		session.close();
		
		return loginEntity;
	}

}
