package com.bakarikhmelidze.cargurus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bakarikhmelidze.cargurus.dao.CarDAO;
import com.bakarikhmelidze.cargurus.dao.MakeDAO;
import com.bakarikhmelidze.cargurus.entity.Car;
import com.bakarikhmelidze.cargurus.entity.Make;

@Service
public class carServiceImpl implements carService {
	
	@Autowired
	private CarDAO carDAO;
	
	@Override
	@Transactional
	public Make getCars(String make, String model) {
		// TODO Auto-generated method stub
		return carDAO.getCars(make,model);
	}

	@Override
	@Transactional
	public Make getCar(int theId) {
		// TODO Auto-generated method stub
		return carDAO.getCar(theId);
	}

	@Override
	@Transactional
	public List<Make> getCars() {
		// TODO Auto-generated method stub
		return carDAO.getCars();
	}

	@Override
	@Transactional
	public void saveCar(Make theMake) {
		// TODO Auto-generated method stub
		carDAO.saveCar(theMake);
	}

	@Override
	@Transactional
	public void updateCar(Make theMake) {
		// TODO Auto-generated method stub
		carDAO.updateCar(theMake);
	}

	@Override
	@Transactional
	public void deleteCar(Make theMake) {
		// TODO Auto-generated method stub
		carDAO.deleteCar(theMake);
	}



}
