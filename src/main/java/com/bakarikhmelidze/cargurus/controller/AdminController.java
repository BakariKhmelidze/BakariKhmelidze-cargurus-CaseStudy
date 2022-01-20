package com.bakarikhmelidze.cargurus.controller;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bakarikhmelidze.cargurus.entity.Car;
import com.bakarikhmelidze.cargurus.entity.Make;
import com.bakarikhmelidze.cargurus.entity.Helper;
import com.bakarikhmelidze.cargurus.service.carService;
import com.bakarikhmelidze.cargurus.service.carServiceImpl;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private carService carservice ;
	
	@GetMapping("/list")
	public String listCars(Model theCars) {
		
		List<Make> cars= carservice.getCars();
		
		
		theCars.addAttribute("cars", cars);
		
		return "Admin.jsp";
		
	}
	@GetMapping("/showFormForAdd")
	public String addCar(Model theCars) {
		
		Helper helper = new Helper();
		
		theCars.addAttribute("make", helper);
		
		return "add_car.jsp";
		
	}
	@PostMapping("/saveCar")
	public String saveCar(@ModelAttribute("make") Helper thehelper) {
		
		Make make = new Make();
		make.setMake(thehelper.getMake());
		com.bakarikhmelidze.cargurus.entity.Model model = new com.bakarikhmelidze.cargurus.entity.Model();
		model.setModel(thehelper.getModel());
		Car c = new Car();
		c.setImg(thehelper.getImg());
		c.setInt_color(thehelper.getInt_color());
		c.setMi(thehelper.getMi());
		c.setPrice(thehelper.getPrice());
		c.setTransmission(thehelper.getTransmission());
		c.setVin(thehelper.getVin());
		c.setYear(thehelper.getYear());
		c.setDrivetrain(thehelper.getDrivetrain());
		c.setEngine(thehelper.getEngine());
		c.setEx_color(thehelper.getEx_color());
		Set<Car> car = new HashSet<>();
		car.add(c);
		Set<com.bakarikhmelidze.cargurus.entity.Model> m = new HashSet<>();
		m.add(model);
		model.setCarlist(car);
		make.setModellist(m);
		carservice.saveCar(make);
		
		
		
		return "redirect:/admin/list";
	}
	@GetMapping("/showFormForUpdate")
	public String ShowformUpdate(@RequestParam("carId") int theId,Model theModel) {
		
		Helper helper = new Helper();
		Make make = carservice.getCar(theId);
		
		
		helper.setMake(make.getMake());
		com.bakarikhmelidze.cargurus.entity.Model model = (com.bakarikhmelidze.cargurus.entity.Model) make.getModellist().iterator().next();
		helper.setModel(model.getModel());
		Car car = (Car) model.getCarlist().iterator().next();
		helper.setDrivetrain(car.getDrivetrain());
		helper.setEngine(car.getEngine());
		helper.setEx_color(car.getEx_color());
		helper.setImg(car.getImg());
		helper.setInt_color(car.getInt_color());
		helper.setMi(car.getMi());
		helper.setPrice(car.getPrice());
		helper.setTransmission(car.getTransmission());
		helper.setVin(car.getVin());
		helper.setYear(car.getYear());
		helper.setCarid(car.getId());
		theModel.addAttribute("make", helper);
		
		
		return "update_car.jsp";
		
	}
	@PostMapping("/updateCar")
	public String updateCar(@ModelAttribute("make") Helper thehelper) {
		
		Make make = new Make();
		make.setMake(thehelper.getMake());
		make.setId(thehelper.getMakeid());
		com.bakarikhmelidze.cargurus.entity.Model model = new com.bakarikhmelidze.cargurus.entity.Model();
		model.setModel(thehelper.getModel());
		model.setId(thehelper.getModelid());
		Car c = new Car();
		c.setId(thehelper.getCarid());
		c.setImg(thehelper.getImg());
		c.setInt_color(thehelper.getInt_color());
		c.setMi(thehelper.getMi());
		c.setPrice(thehelper.getPrice());
		c.setTransmission(thehelper.getTransmission());
		c.setVin(thehelper.getVin());
		c.setYear(thehelper.getYear());
		c.setDrivetrain(thehelper.getDrivetrain());
		c.setEngine(thehelper.getEngine());
		c.setEx_color(thehelper.getEx_color());
		model.setCarlist(Set.of(c));
		make.setModellist(Set.of(model));
		carservice.updateCar(make);
		
		
		
		return "redirect:/admin/list";
	}
	
	@GetMapping("/delete")
	public String deleteCar(@RequestParam("carId") int theId) {
		
		Make m = carservice.getCar(theId);
		// delete the customer
		carservice.deleteCar(m);
		
		return "redirect:/admin/list";
	}
	
	
}
