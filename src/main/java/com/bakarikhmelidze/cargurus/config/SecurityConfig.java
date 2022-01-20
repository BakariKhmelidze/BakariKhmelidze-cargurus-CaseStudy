package com.bakarikhmelidze.cargurus.config;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.bakarikhmelidze.cargurus.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
@ComponentScan("com.bakarikhmelidze.cargurus")
public class SecurityConfig extends WebSecurityConfigurerAdapter {
        
		@Autowired
		private UserDetailsService userDetailsService;
	     
		@Bean
	    public UserDetailsService userDetailsService() {
	        return new CustomUserDetailsService();
	    }
	     
	    @Bean
	    public BCryptPasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	     
	    @Bean
	    public DaoAuthenticationProvider authenticationProvider() {
	        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	        authProvider.setUserDetailsService(userDetailsService);
	        authProvider.setPasswordEncoder(passwordEncoder());
	         
	        return authProvider;
	    }
	 
	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.authenticationProvider(authenticationProvider());
	    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http
    	.authorizeRequests()
    	.antMatchers("/")
    	.permitAll()
    	.antMatchers("/car")
    	.permitAll()
    	.antMatchers("/car/list")
    	.permitAll()
    	.antMatchers("/admin/list",
    				 "/admin/showFormForAdd",
    				 "/admin/saveCar",
    				 "/admin/showFormForUpdate",
    				 "/admin/updateCar",
    				 "/admin/delete").authenticated().and()
        .formLogin().loginPage("/login").usernameParameter("email");

            
 
    }
    

}