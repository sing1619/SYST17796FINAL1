/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalthree1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Balraj
 */
public class CalculateSalaryIT {
    
    public CalculateSalaryIT() {
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
     * Test of calculateNet method, of class CalculateSalary.
     */
    @Test
    public void testCalculateNet() {
        System.out.println("calculateNet");
        double hours = 8.0;
        double rate = 50.0;
        double tax = 100.0;
        CalculateSalary instance = new CalculateSalary();
        double result = instance.calculateNet(hours, rate, tax);
        assertEquals(200, result, 0.0);        
    }
    
}
