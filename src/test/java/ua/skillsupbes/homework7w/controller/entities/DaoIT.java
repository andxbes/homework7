/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ua.skillsupbes.homework7w.controller.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Andrey
 */
public class DaoIT {
    private  Dao dao;
    public DaoIT() {
	System.out.println("\nhohoho\n");
	ApplicationContext context =
		new ClassPathXmlApplicationContext("/app-context.xml");
	   // dao = (Dao) context.getBean("dao");
	
    }
    
    
    @BeforeClass
    public static void setUpClass() {
	
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deleInstrument method, of class Dao.
     */
    @org.junit.Test
    public void testDeleInstrument() {
	System.out.println("deleInstrument");
	

	
	//instance.deleInstrument(s);
	// TODO review the generated test code and remove the default call to fail.
	//fail("The test case is a prototype.");
    }
    
}
