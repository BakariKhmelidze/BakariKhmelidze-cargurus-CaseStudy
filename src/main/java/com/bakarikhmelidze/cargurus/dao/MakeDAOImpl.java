package com.bakarikhmelidze.cargurus.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bakarikhmelidze.cargurus.entity.Make;
import com.bakarikhmelidze.cargurus.entity.Model;

@Repository
public class MakeDAOImpl implements MakeDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	@Transactional
	public void addMake(String make, String model) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Make m = new Make(make);
		List<Model> modellist = new ArrayList();
		modellist.add(new Model(model));
		//m.setModellist(modellist);
		//currentSession.save(m);
	
		
	}


	@Override
	@Transactional
	public List<Make> getMake() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Make> theQuery = 
				currentSession.createQuery("from Make", Make.class);
		
		// execute query and get result list
		List<Make> makes = theQuery.getResultList();
				
		// return the results		
		return makes;
	}

}
