package com.bakarikhmelidze.cargurus.entity;



public class Helper {
	int makeid;
	int modelid;
	int carid;
	private String Make;
	public int getMakeid() {
		return makeid;
	}
	public void setMakeid(int makeid) {
		this.makeid = makeid;
	}
	public int getModelid() {
		return modelid;
	}
	public void setModelid(int modelid) {
		this.modelid = modelid;
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	private String model;
	private String img;
	private int year;
	private double price;
	private int mi;
	private String transmission;
	private String ex_color;
	private String int_color;
	private String vin;
	private String engine;
	private String drivetrain;
	
	public Helper() {
		
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
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
	public String getDrivetrain() {
		return drivetrain;
	}
	public void setDrivetrain(String drivetrain) {
		this.drivetrain = drivetrain;
	}

}
