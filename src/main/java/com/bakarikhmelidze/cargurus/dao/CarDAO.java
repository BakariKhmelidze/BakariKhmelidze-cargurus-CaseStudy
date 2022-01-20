package com.bakarikhmelidze.cargurus.dao;

import java.util.List;

import com.bakarikhmelidze.cargurus.entity.Car;
import com.bakarikhmelidze.cargurus.entity.Make;


public interface CarDAO {
	public Make getCars(String make, String model);
	public Make getCar(int theId);
	public List<Make> getCars();
	public void saveCar(Make theMake);
	public void updateCar(Make theMake);
	public void deleteCar(Make theMake);

}
