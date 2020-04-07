/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import newcalculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class SecondLevel {
   
    Calculator calc = new Calculator();
    
    public SecondLevel() {
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
    
     @Test
     public void test1()
     {
         double result = 0;
         result =calc.addition(87, 19);
         result = calc.division(result, 22);
         result = calc.subtraction(result, 17);
         result = calc.multiplication(result, 4);
         assertEquals(-48.72,result,0.01);
     }
     
    @Test 
    public void test2()
     {
         double result = 0;
         result =calc.factorial(5);
         result = calc.power(result, 3);       
         result = calc.root(result); 
         result = calc.modulus(result, 7);
         assertEquals(5.53,result,0.01);
     }
    
    @Test 
    public void test3()
     {
         double result = 0;
         result =calc.addition(84.23,-14.77);
         result =calc.addition(result,18.22);
         result =calc.subtraction(result,-26.347);
         result = calc.power(result, 4);
         result = calc.root(result); 
         result = calc.division(result, -20);      
         result = calc.multiplication(result, -1);
         result = calc.modulus(result, 11);
         result = calc.multiplication(result, 17);
         assertEquals(18.83,result,0.01);
     }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
