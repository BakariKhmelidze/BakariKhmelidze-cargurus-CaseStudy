package com.bakarikhmelidze.cargurus.entity;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="model")
public class Model {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="model")
	private String model;
	
	@OneToMany(targetEntity=Car.class, orphanRemoval = true, cascade = {CascadeType.ALL})
	private Set<Car> Carlist;
	
	
	public Set<Car> getCarlist() {
		return Carlist;
	}



	public void setCarlist(Set<Car> carlist) {
		Carlist = carlist;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Model() {
		
	}
	public Model(String model) {
		this.model=model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void addCar(Car c) {
		Carlist.add(c);
	}
	public void removeCar(Car c) {
		Carlist.remove(c);
	}
	

	
		
}





