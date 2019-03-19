package epamtask2;
/*@author Madhavi*/
import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestingCalculator {

	@Test
	void test_addition_method() {
	Calculator  calculator=new Calculator();
		
		assertEquals(200,calculator.addition_method(100,-200,300));
	     assertEquals(60.7,calculator.addition_method(10.2,20.0,30.5));
	     assertEquals(-60.7,calculator.addition_method(-10.2,-20.0,-30.5));
	}
	@Test
	void test_multiplication_method() {
	Calculator  calculator=new Calculator();
		
		assertEquals(20000,calculator.multiplication_method(100,200));
	     assertEquals(204,calculator.multiplication_method(10.2,20.0));
	     assertEquals(-204,calculator.multiplication_method(10.2,-20.0));
	}
	
	@Test
	void test_division_method() {
	Calculator  calculator=new Calculator();
		
		assertEquals(5,calculator.division_method(100,20));
	     assertEquals(10,calculator.division_method(10,1));
	     assertEquals(-25,calculator.division_method(50,-2));
	     Assertions.assertThrows(ArithmeticException.class, () -> 
	    	 calculator.division_method(3,0));
	}
}
