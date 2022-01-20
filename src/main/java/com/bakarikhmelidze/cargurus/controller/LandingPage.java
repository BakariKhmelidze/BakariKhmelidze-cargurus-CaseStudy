package com.bakarikhmelidze.cargurus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.bakarikhmelidze.cargurus.entity.Make;
import com.bakarikhmelidze.cargurus.service.MakeService;


@Controller
public class LandingPage {
	@Autowired
	private MakeService makeservice;
	
	@RequestMapping("/")
	public String landingPage(Model theModel) {
		List<Make> make= makeservice.getMake();
					
			
		theModel.addAttribute("make", make);
		theModel.addAttribute("make1", new Make());
		return "index.jsp";
	}
}
