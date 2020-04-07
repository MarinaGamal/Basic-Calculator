import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import newcalculator.*;

/**
 *
 * @author Monica Magedd
 */
public class FirstLevel {
    
    Calculator calc = new Calculator();
    
    public FirstLevel() {
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
    
    @Test
    public void testAdd(){
        assertEquals(4 , calc.addition(0, 4),0.01);
        assertEquals(-3 , calc.addition(-1, -2),0.01);
        assertEquals(1222 , calc.addition(753, 469),0.01);
        assertEquals(27 , calc.addition(-23, 50),0.01);
        assertEquals(236 , calc.addition(12.5, 223.5),0.01);
        assertEquals(-270.26 , calc.addition(-245.87, -24.39),0.01);
        assertEquals(0 , calc.addition(0, 0),0.01);
        assertNotEquals(4 , calc.addition(4, 4),0.01);   
    }
    
    @Test
    public void testSubtract(){
        assertEquals(2 , calc.subtraction(4, 2),0.01);
        assertEquals(-3 , calc.subtraction(1, 4),0.01);
        assertEquals(0 , calc.subtraction(10, 10),0.01);  
        assertEquals(0 , calc.subtraction(0, 0),0.01);
        assertEquals(-16 , calc.subtraction(-21, -5),0.01);
        assertEquals(-19.99 , calc.subtraction(87.28, 107.27),0.01);
        assertEquals(-945.84 , calc.subtraction(-987.5, -41.66),0.01);
        assertEquals(-25 , calc.subtraction(-17.25, 7.75),0.01);
        assertNotEquals(3,calc.subtraction(10, 3),0.01); 
    }    
   
    @Test
    public void testMultiply(){
        assertEquals(8 , calc.multiplication(4, 2),0.01);
        assertEquals(203 , calc.multiplication(29, 7),0.01);
        assertEquals(-330 , calc.multiplication(-66, 5),0.01);
        assertEquals(37590 , calc.multiplication(537, 70),0.01);
        assertEquals(13230 , calc.multiplication(-315, -42),0.01);
        assertEquals(166299.16 , calc.multiplication(-3879.15, -42.87),0.01);
        assertEquals(-113422.17 , calc.multiplication(8439.15, -13.44),0.01);
        assertEquals(1330.24 , calc.multiplication(18.678, 71.22),0.01);
        assertEquals(0 , calc.multiplication(70, 0),0.01);
        assertEquals(-44 , calc.multiplication(-44, 1),0.01);
        assertNotEquals(900 , calc.multiplication(10, 9),0.01);   
        
        
    }  
    
    @Test
    public void testDivide(){
        assertEquals(2 , calc.division(4, 2),0.01);
        assertEquals(1 , calc.division(-50, -50),0.01);
        assertEquals(0 , calc.division(0, 70),0.01);
        assertEquals(2.19 , calc.division(657, 300),0.01);
        assertEquals(-0.19 , calc.division(17.25, -89.2),0.01);
        assertEquals(4.9 , calc.division(-547.5, -111.58),0.01);
        assertEquals(0.04 , calc.division(32.178, 784.1),0.01);
        assertEquals(-0.17 , calc.division(-84, 481),0.01);
        assertNotEquals(1 , calc.division(10, 9),0.01);   
        
    }
    
    @Test
    public void testZeroDivision(){    
        try{ 
            calc.division(512, 0);
            fail("Cannot divide by zero");
        }
        catch(Exception e){
            assertTrue(true);
        }
        
    }
    
    @Test
    public void testpower(){
        assertEquals(16 , calc.power(4, 2),0.01);
        assertEquals(625 , calc.power(-5, 4),0.01);
        assertEquals(27000000 , calc.power(300,3 ),0.01);
        assertEquals(0.01 , calc.power(-3,-4 ),0.01);
        assertEquals(282475249 , calc.power(7,10 ),0.01);
        assertEquals(1281043.24 , calc.power(397.158,2.35 ),0.01);
        assertEquals(7679.18 , calc.power(45.75,2.34 ),0.01);
        assertEquals(1 , calc.power(80,0),0.01);
        assertEquals(714 , calc.power(714,1),0.01);
        assertNotEquals(100 , calc.power(10, 9),0.01);   
        
    }
    
    @Test
    public void testFactorial(){
        assertEquals(362880 , calc.factorial(9),0.01);
        assertEquals(6 , calc.factorial(3),0.01);
        assertEquals(39916800,calc.factorial(11),0.01);
        assertNotEquals(2700 , calc.factorial(10),0.01);
    
    }
    @Test
    public void testNegativeFactorial(){
        try{ 
            calc.factorial(-7);
            fail("No factorial for -ve numbers");
        }
        catch(Exception e){
            assertTrue(true);
        }
        
        
    }
    
    @Test
    public void testRoot(){
        assertEquals(3, calc.root(9),0.01);
        assertEquals(23.23 , calc.root(540),0.01);
        assertEquals(4 , calc.root(16),0.01);
        assertEquals(0 , calc.root(0),0.01);  
        assertEquals(3.16 , calc.root(10),0.01);
        assertNotEquals(8 , calc.root(6),0.01);
       
    }
     @Test
    public void testNegativeRoot(){
        try{
            calc.root(-10);
            fail("no square root for -ve numbers");
        }
        catch(RuntimeException e)
        {
            assertTrue(true);
        }     
    }
    
    @Test
    public void testModulus(){
        assertEquals(0, calc.modulus(60,4),0.01);
        assertEquals(0 , calc.modulus(300,4),0.01);
        assertEquals(4 , calc.modulus(550,6 ),0.01);
        assertEquals(-60, calc.modulus(-60,-411),0.01);
        assertEquals(-6 , calc.modulus(-678,7),0.01);
        assertEquals(-14.23 , calc.modulus(-872.23,78),0.01);
        assertNotEquals(5 , calc.modulus(105,3),0.01);   
        
    }
    
    
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
