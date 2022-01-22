package com.bakarikhmelidze.cargurus.test;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.bakarikhmelidze.cargurus.dao.CarDAO;
import com.bakarikhmelidze.cargurus.entity.Car;
import com.bakarikhmelidze.cargurus.entity.Make;
import com.bakarikhmelidze.cargurus.entity.Model;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(classes = TestConfig.class)
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestCarDAO {

	
	@Autowired
    private CarDAO carDAO;

     
     
    @Test
    @Transactional
    @Rollback(true)
    public void TestPrice()
    {
        Make make = carDAO.getCar(1);
        Model model = (Model) make.getModellist().iterator().next();
        Car c = model.getCarlist().iterator().next();
        assertTrue(c.getPrice() > 0);
    }
     

}

