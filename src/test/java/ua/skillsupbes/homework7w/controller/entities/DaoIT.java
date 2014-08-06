/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ua.skillsupbes.homework7w.controller.entities;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Andrey
 */
public class DaoIT {
    
    public DaoIT() {
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
	Student s = null;
	Dao instance = new Dao();
	instance.deleInstrument(s);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
