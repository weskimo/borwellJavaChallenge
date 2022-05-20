package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lib.CylinderRoom;

class cylinderFloorAreaTest {

	@Test
	void cylinderFloorAreaTest() {
		CylinderRoom testCylinder = new CylinderRoom(10, 10, 0);
		
		double result = testCylinder.getFloorArea();
		double answer = Math.PI * 10 * 10;
		assertEquals(answer, result);
	}

}
