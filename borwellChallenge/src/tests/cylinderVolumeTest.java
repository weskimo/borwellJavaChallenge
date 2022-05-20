package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lib.CylinderRoom;

class cylinderVolumeTest {

	@Test
	void cylinderVolumeTest() {
		
		CylinderRoom testCylinder = new CylinderRoom(10,10,5);
		
		double result = testCylinder.getRoomVolume();
		
		double volume = 10 * Math.PI * 10 * 10 ;
		
		assertEquals(volume, result);
		
	}

}
