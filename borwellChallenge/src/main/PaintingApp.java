package main;
import java.util.Scanner;

import lib.CylinderRoom;

public class PaintingApp {

	public static void main(String[] args) {
		
		 Scanner scanner1 = new Scanner(System.in); 
		 Scanner scanner2 = new Scanner(System.in); 
		 Scanner scanner3 = new Scanner(System.in); 
		 Scanner scanner4 = new Scanner(System.in); 
		
		System.out.println("Hello and welcome to the paint calculator!");
		System.out.println("You can choose from 2 styles of room, Cylinder or RectangularTank.");
		System.out.println("Type: '1' for cylinder or '2' for rectangular room");
		
		int roomType = scanner1.nextInt();
		
		System.out.println("You selected: " + roomType);
		
		if(roomType == 1) {
			
			System.out.println("You selected Cylinder room.");
			
			System.out.println("Please enter the rooms radius");
			String roomRadius = scanner2.nextLine();
			System.out.println("You entered: " + roomRadius + " as the radius of the room.");
			System.out.println("---------------------");
			
			System.out.println("Pleae enter the height of the room");
			String roomHeight = scanner3.nextLine();
			System.out.println("You entered: " + roomHeight + " as the room height");
			System.out.println("---------------------");
			
			
			System.out.println("Please enter the total surface area of windows across all walls of the room");
			String roomWindowArea = scanner4.nextLine();
			System.out.println("You entered: " + roomWindowArea + " as the total surface area of windows across"
					+ " all walls of the room");
			System.out.println("---------------------");
			
			
			// make an instance of the class to represent the users room
			CylinderRoom cylinderRoom = new CylinderRoom(Integer.parseInt(roomRadius),Integer.parseInt(roomHeight), Integer.parseInt(roomWindowArea));
			
			
			System.out.println("Please see your output calculations below:");
			System.out.println("============================");
			cylinderRoom.getFloorArea();
			cylinderRoom.getReqPaintInLitres();
			cylinderRoom.getRoomVolume();
			
			
			
		} 
		else if (roomType == 2 ) {
			
		} else {
			System.out.println("Error you entered an incorrect option. Please enter with 'r' or 'c'");
		}
		
		
		
	}

}
