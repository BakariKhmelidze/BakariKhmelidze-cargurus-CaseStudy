package com.bakarikhmelidze.cargurus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bakarikhmelidze.cargurus.dao.UserDAO;
import com.bakarikhmelidze.cargurus.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public User getUser(String email) {
		// TODO Auto-generated method stub
		return userDAO.getUser(email);
		
	}

}
