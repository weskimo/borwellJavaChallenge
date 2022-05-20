package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lib.CylinderRoom;

class cylinderReqPaintTest {

	@Test
	void cylinderReqPaintTest() {
		CylinderRoom testCylinder = new CylinderRoom(10,10,5);
		
		double result = testCylinder.getReqPaintInLitres();
		
		double wallArea = (2 * Math.PI * 10 * 10) + 
				  (2*Math.PI * 10 * 10); 

		double totalMinusWindows = (wallArea - 5) / 6;
		
		assertEquals(totalMinusWindows, result);
		
	}

}
