package com.wolken.wolkenapp.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dto.EditProfileDTO;
import com.wolken.wolkenapp.entity.EditProfileEntity;

@Component
public class EditProfileDAOImpl implements EditProfileDAO {

	@Autowired
	LocalSessionFactoryBean bean;

	Logger logger = Logger.getLogger("EditProfileDAOImpl");

	@Override
	public String editProfile(EditProfileDTO editProfileDTO) {

		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(
				"Update EditProfileEntity EPE set EPE.userName=: uName,EPE.userPhoneNumber=: uPhone,EPE.userDOB=: uDOB,EPE.gender=: uGender where EPE.userEmailId=: uEmail");

		query.setParameter("uName", editProfileDTO.getUserName());
		query.setParameter("uPhone", editProfileDTO.getUserPhoneNumber());
		query.setParameter("uDOB", editProfileDTO.getUserDOB());
		query.setParameter("uGender", editProfileDTO.getGender());
		query.setParameter("uEmail", editProfileDTO.getUserEmail());

		query.executeUpdate();

		logger.debug("EDITING PROFILE");

		transaction.commit();
		session.close();

		return null;

	}

	@Override
	public EditProfileEntity getUserByEmail(String email) {

		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		
		logger.debug("INSIDE getUserByEmail() ");

		Query query = session.createQuery("from EditProfileEntity epe where epe.userEmailId =:uEmail");

		query.setParameter("uEmail", email);

		EditProfileEntity editProfileEntity = (EditProfileEntity) query.uniqueResult();
		
		
		transaction.commit();
		session.close();

		return editProfileEntity;
	}

}
