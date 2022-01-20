package com.bakarikhmelidze.cargurus.dao;


import com.bakarikhmelidze.cargurus.entity.User;

public interface UserDAO {
	public User getUser(String email);
	
}
