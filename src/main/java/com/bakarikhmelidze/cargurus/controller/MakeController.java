package com.bakarikhmelidze.cargurus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bakarikhmelidze.cargurus.dao.MakeDAO;
import com.bakarikhmelidze.cargurus.entity.Make;



@Controller
@RequestMapping("/make")
public class MakeController {
	
	@Autowired
	private MakeDAO makeDAO;
	// need to inject the customer dao
	
	
	@RequestMapping("/get")
	public String getCustomers(Model theModel) {
		
		
		
		return "name";
	}
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from the dao
			List<Make> make= makeDAO.getMake();
			for(Make m1:make) {
				System.out.println(m1.getMake());	
				}
				// add the customers to the model
			theModel.addAttribute("make", make);
				
			return "name";
			
	}
	
}


