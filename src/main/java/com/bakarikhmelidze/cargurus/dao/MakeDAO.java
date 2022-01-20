package com.bakarikhmelidze.cargurus.dao;

import java.util.List;

import com.bakarikhmelidze.cargurus.entity.Make;



public interface MakeDAO {
	public void addMake(String make, String model);
	public List<Make> getMake();
}
