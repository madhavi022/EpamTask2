package epamtask2;
/*@author madhavi*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConstructionCost {

	@Test
	void test_estimateCost() {
		ConstructionCost cc=new ConstructionCost();
		assertEquals(300000,cc.estimateCost(1, 250, 1));
		assertEquals(900000,cc.estimateCost(3, 500, 0));
		assertEquals(751250,cc.estimateCost(1, 300.5, 0));
		assertEquals(0,cc.estimateCost(4, 300.5, 0));
	}

}
