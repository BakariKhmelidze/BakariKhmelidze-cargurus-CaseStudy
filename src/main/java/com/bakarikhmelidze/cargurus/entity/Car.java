package com.bakarikhmelidze.cargurus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="img")
	private String img;
	
	@Column(name="year")
	private int year;
	
	@Column(name="price")
	private double price;
	
	@Column(name="millage")
	private int mi;
	
	@Column(name="transmission")
	private String transmission;
	
	@Column(name="ex_color")
	private String ex_color;
	
	@Column(name="int_color")
	private String int_color;
	
	@Column(name="vin")
	private String vin;
	
	@Column(name="engine")
	private String engine;
	
	@Column(name="drivetraine")
	private String drivetrain;
	
	
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDrivetrain() {
		return drivetrain;
	}

	public void setDrivetrain(String drivetrain) {
		this.drivetrain = drivetrain;
	}

	public Car() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMi() {
		return mi;
	}

	public void setMi(int mi) {
		this.mi = mi;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getEx_color() {
		return ex_color;
	}

	public void setEx_color(String ex_color) {
		this.ex_color = ex_color;
	}

	public String getInt_color() {
		return int_color;
	}

	public void setInt_color(String int_color) {
		this.int_color = int_color;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	@Override
    public int hashCode()
    {
          
        // We are returning the Geek_id 
        // as a hashcode value.
        // we can also return some 
        // other calculated value or may
        // be memory address of the 
        // Object on which it is invoked. 
        // it depends on how you implement 
        // hashCode() method.
        return this.id;
    }
	 @Override
	    public boolean equals(Object obj)
	    {
	          
	    // if both the object references are 
	    // referring to the same object.
	    if(this == obj)
	            return true;
	          
	        // it checks if the argument is of the 
	        // type Geek by comparing the classes 
	        // of the passed argument and this object.
	        // if(!(obj instanceof Geek)) return false; ---> avoid.
	        if(obj == null || obj.getClass()!= this.getClass())
	            return false;
	          
	        // type casting of the argument. 
	        Car geek = (Car) obj;
	          
	        // comparing the state of argument with 
	        // the state of 'this' Object.
	        return (geek.id == this.id);
	    }

}
