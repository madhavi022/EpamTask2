package epamtask2;
/*@author Madhavi*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSimpleInterestAndCompoundInterset {

	@Test
	void test_simpleInterest() {
		
		SimpleInterestAndCompoundInterset sc=new SimpleInterestAndCompoundInterset();
		assertEquals(8496.6,sc.cal_SimpleInterest(68000, 16.66, 0.75));
		assertEquals(2525.25,sc.cal_SimpleInterest(20202, 2.5, 5));
	}
	@Test
   void test_compoundInterest() {
		
		SimpleInterestAndCompoundInterset sc1=new SimpleInterestAndCompoundInterset();
		assertEquals(612.0000000000009,sc1.cal_CompoundInterest(7500, 4, 2));
		assertEquals(824.3215999999993,sc1.cal_CompoundInterest(10000, 2, 4));
	}

}
