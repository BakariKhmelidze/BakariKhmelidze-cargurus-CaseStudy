package com.bakarikhmelidze.cargurus.dao;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bakarikhmelidze.cargurus.entity.Make;
import com.bakarikhmelidze.cargurus.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public User getUser(String email) {
		System.out.println(email);
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		TypedQuery<User> theQuery =
				currentSession.createQuery("FROM User u WHERE u.email = :email", User.class);
				theQuery.setParameter("email", email);
		User u = (User) theQuery.getSingleResult();
		System.out.println(u.getEmail());
		return u;
	}

}
