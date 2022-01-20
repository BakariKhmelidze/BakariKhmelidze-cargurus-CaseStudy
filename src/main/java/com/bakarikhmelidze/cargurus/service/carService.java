package com.bakarikhmelidze.cargurus.service;

import java.util.List;

import com.bakarikhmelidze.cargurus.entity.Car;
import com.bakarikhmelidze.cargurus.entity.Make;

public interface carService {
	public Make getCars(String make, String model);
	public Make getCar(int theId);
	public List<Make> getCars();
	public void saveCar(Make theMake);
	public void updateCar(Make theMake);
	public void deleteCar(Make theMake);
}
