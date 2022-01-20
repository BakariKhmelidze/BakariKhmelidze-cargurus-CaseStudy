package com.bakarikhmelidze.cargurus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bakarikhmelidze.cargurus.dao.MakeDAO;
import com.bakarikhmelidze.cargurus.entity.Make;

@Service
public class MakeServiceImpl implements MakeService  {
	@Autowired
	private MakeDAO MakeDAO;

	@Override
	@Transactional
	public List<Make> getMake() {
		// TODO Auto-generated method stub
		return MakeDAO.getMake();
	}
	
	
}
