package com.bakarikhmelidze.cargurus.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bakarikhmelidze.cargurus.dao.CarDAO;
import com.bakarikhmelidze.cargurus.entity.Car;
import com.bakarikhmelidze.cargurus.entity.Make;
import com.bakarikhmelidze.cargurus.service.carService;
import com.bakarikhmelidze.cargurus.service.carServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarsController {
	
	@Autowired
	private carService carservice ;
	
	@PostMapping("/list")
	public String listCars(@ModelAttribute("make1") Make theMake,Model theCars) {
		String[] arrOfStr = theMake.getMake().split(",");
		
		Make cars= carservice.getCars(arrOfStr[0], arrOfStr[1]);
		
		if (cars == null) {
			return "no_record.jsp";
		}else {
			theCars.addAttribute("cars", cars);
			return "Products.jsp";
		}
		
		

		
	}
	
	@GetMapping("/list/car")
	public String getCar(@RequestParam("carId") int theId,
						Model theCar) {
		
		Make car= carservice.getCar(theId);
		
		
		theCar.addAttribute("car", car);
		
		return "Product.jsp";
		
	}
	
	
}
