package com.bakarikhmelidze.cargurus.entity;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;






@Entity
@Table(name="make")
public class Make {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="make", unique = true)
	private String Make;

	
	
	@OneToMany(targetEntity=Model.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private Set<Model> Modellist;
	
	public Make() {
		
	}
	public void setModellist(Set<Model> modellist) {
		Modellist = modellist;
	}
	public Make(String make) {
		this.Make = make;
	}
	
	
	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Set<Model> getModellist(){
        return Modellist;
    }
	

	
		
}





