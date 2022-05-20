package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lib.RectangularTankRoom;

class RectangularTankRoomVolumeTest {

	@Test
	void RectangularTankRoomVolumeTest() {
		
		RectangularTankRoom testRectRoom = new RectangularTankRoom(10,10,10,5);
		
		double result = testRectRoom.getRoomVolume();
		
		double outcome = 10 * 10 * 10;
		
		assertEquals(outcome, result);
	}

}
