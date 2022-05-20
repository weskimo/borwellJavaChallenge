package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lib.RectangularTankRoom;

class RectangularTankRoomFloorAreaTest {

	@Test
	void RectangularTankRoomFloorAreaTest() {
		
		RectangularTankRoom testRectRoom = new RectangularTankRoom(10,10,10,5);
		
		
		double floorArea = testRectRoom.getFloorArea();
		double expectedOutcome = 10 * 10;
		
		assertEquals(floorArea, expectedOutcome);
	}

}
