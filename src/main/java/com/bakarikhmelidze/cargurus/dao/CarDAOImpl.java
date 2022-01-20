package com.bakarikhmelidze.cargurus.dao;


import java.util.List;
import java.util.Set;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bakarikhmelidze.cargurus.entity.Car;
import com.bakarikhmelidze.cargurus.entity.Make;
import com.bakarikhmelidze.cargurus.entity.Model;

@Repository
public class CarDAOImpl implements CarDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public Make getCars(String make, String model) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		TypedQuery<Make> theQuery = 
				currentSession.createQuery("from Make m JOIN FETCH m.Modellist m1 JOIN FETCH m1.Carlist where m.Make = :make and m1.model= :model", Make.class);
		 		theQuery.setParameter("make", make);
		 		theQuery.setParameter("model", model);
		
		 		Make m = null;
				try {
					m = (Make) theQuery.getSingleResult();
				} catch (NoResultException nre){
					
				}
		
				return m;
	}


	@Override
	@Transactional
	public Make getCar(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		TypedQuery<Make> theQuery =
						currentSession.createQuery("from Make m JOIN FETCH m.Modellist m1 JOIN FETCH m1.Carlist c where c.id = :id", Make.class);
						theQuery.setParameter("id", theId);
						
		Make m = (Make) theQuery.getSingleResult();
		
		return m;
	}


	@Override
	@Transactional
	public List<Make> getCars() {
		Session currentSession = sessionFactory.getCurrentSession();
		TypedQuery<Make> theQuery =
						currentSession.createQuery("Select distinct m from Make m JOIN FETCH m.Modellist m1 JOIN FETCH m1.Carlist", Make.class);
		
		List<Make> makes = (List<Make>) theQuery.getResultList();
		return makes;
	}


	@Override
	@Transactional
	public void saveCar(Make theMake) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		Model m = (Model) theMake.getModellist().iterator().next();
		Car c = (Car) m.getCarlist().iterator().next();
		

		TypedQuery<Make> theQuery = 
				currentSession.createQuery("from Make m JOIN FETCH m.Modellist m1 JOIN FETCH m1.Carlist where m.Make = :make and m1.model= :model", Make.class);
		 		theQuery.setParameter("make", theMake.getMake());
		 		theQuery.setParameter("model", m.getModel());
		Make make = null;
		try {
			make = (Make) theQuery.getSingleResult();
		} catch (NoResultException nre){
			
		}
		if(make == null) {
			currentSession.saveOrUpdate(theMake);
		}
		else {
			Model m1 = (Model) make.getModellist().iterator().next();
			m1.getCarlist().add(c);
			
			currentSession.saveOrUpdate(make);
		}
		
	}


	@Override
	@Transactional
	public void updateCar(Make theMake) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		Model m = (Model) theMake.getModellist().iterator().next();
		
		String hsql =  "update Car c set c.img = :img, c.year = :year, c.price = :price, c.mi = :mi, c.transmission = :transmission, c.ex_color = :ex_color, c.int_color = :int_color, c.vin = :vin, c.engine = :engine, c.drivetrain = :drivetrain  where c.id = :id";
		Query theQuery3 =
				currentSession.createQuery(hsql);
		
		Car c = m.getCarlist().iterator().next();
		theQuery3.setParameter("id", c.getId());
		theQuery3.setParameter("img", c.getImg());
		theQuery3.setParameter("year", c.getYear());
		theQuery3.setParameter("price", c.getPrice());
		theQuery3.setParameter("mi", c.getMi());
		theQuery3.setParameter("transmission", c.getTransmission());
		theQuery3.setParameter("int_color", c.getInt_color());
		theQuery3.setParameter("vin", c.getVin());
		theQuery3.setParameter("engine", c.getEngine());
		theQuery3.setParameter("drivetrain", c.getTransmission());
		theQuery3.setParameter("ex_color", c.getEx_color());
		theQuery3.executeUpdate();
	}


	@Override
	@Transactional
	public void deleteCar(Make theMake) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Model m1 = (Model) theMake.getModellist().iterator().next();
		Car c = (Car) m1.getCarlist().iterator().next();
		System.out.println(theMake.getMake());
		System.out.println(m1.getModel());
		
		TypedQuery<Make> theQuery = 
				currentSession.createQuery("from Make m JOIN FETCH m.Modellist m1 JOIN FETCH m1.Carlist where m.Make = :make and m1.model= :model", Make.class);
		 		theQuery.setParameter("make", theMake.getMake());
		 		theQuery.setParameter("model", m1.getModel());
		
		// execute query and get result listS
		Make make = (Make) theQuery.getSingleResult();
		
		
		
		Model main = (Model) make.getModellist().iterator().next();
		main.getCarlist().remove(c);
		
		if(main.getCarlist().size() == 0) {
			currentSession.delete(make);
		}
		else {
			currentSession.saveOrUpdate(make);
		}

		
	}



		
	

}
