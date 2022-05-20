package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lib.RectangularTankRoom;

class RectangularTankRoomReqPaintTest {

	@Test
	void RectangularTankRoomReqPaintTest() {
		
		RectangularTankRoom testRectRoom = new RectangularTankRoom(10,10,10,5);
		
		double result = testRectRoom.getReqPaintInLitres();
		
		double wallAreaA = 10 * 10;
    	double wallAreaB = 10 * 10;
    	
    	double totalArea = (wallAreaA*2) + (wallAreaB*2);
    	
    	double totalAreaMinusWindow = totalArea - 5;
    	
    	double litresNeeded = totalAreaMinusWindow / 6;
    	
    	assertEquals(litresNeeded, result);
    	
	}

}
