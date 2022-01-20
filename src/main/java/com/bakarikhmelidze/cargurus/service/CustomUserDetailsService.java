package com.bakarikhmelidze.cargurus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bakarikhmelidze.cargurus.entity.CustomUserDetails;
import com.bakarikhmelidze.cargurus.entity.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {
 
	@Autowired
	private UserService userService;
     
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    	User user = userService.getUser(email);
    	
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }
 
}
