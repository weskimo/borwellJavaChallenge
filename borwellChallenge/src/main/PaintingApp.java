package main;
import java.util.Scanner;

import lib.CylinderRoom;
import lib.RectangularTankRoom;

public class PaintingApp {

	public static void main(String[] args) {
		
		// scanner objs for input
		 Scanner scanner1 = new Scanner(System.in); 
		 Scanner scanner2 = new Scanner(System.in); 
		 Scanner scanner3 = new Scanner(System.in); 
		 Scanner scanner4 = new Scanner(System.in); 
		 Scanner scanner5 = new Scanner(System.in);
		 
		 //initial intro
		System.out.println("Hello and welcome to the paint calculator!");
		System.out.println("You can choose from 2 styles of room, Cylinder or RectangularTank.");
		
		// user picks the room type, 1 for cylinder, 2 for rectangular
		System.out.println("Type: '1' for cylinder or '2' for rectangular room");
		int roomType = scanner1.nextInt();
		
		System.out.println("You selected: " + roomType);
		
		// option 1 is for the cylinder room path
		if(roomType == 1) {
			
			System.out.println("You selected Cylinder room.");
			
			System.out.println("Please enter the rooms radius");
			String roomRadius = scanner2.nextLine();
			System.out.println("You entered: " + roomRadius + " as the radius of the room.");
			System.out.println("---------------------");
			if (Double.parseDouble(roomRadius) * 0 != 0) {
				System.out.println("Please start again and enter a valid number!");
			}
			
			System.out.println("Pleae enter the height of the room");
			String roomHeight = scanner3.nextLine();
			System.out.println("You entered: " + roomHeight + " as the room height");
			System.out.println("---------------------");
			if (Double.parseDouble(roomHeight) * 0 != 0) {
				System.out.println("Please start again and enter a valid number!");
			}
			
			
			System.out.println("Please enter the total surface area of windows across all walls of the room");
			String roomWindowArea = scanner4.nextLine();
			System.out.println("You entered: " + roomWindowArea + " as the total surface area of windows across"
					+ " all walls of the room");
			System.out.println("---------------------");
			if (Double.parseDouble(roomWindowArea) * 0 != 0) {
				System.out.println("Please start again and enter a valid number!");
			}
			
			
			// make an instance of the class to represent the users room
			CylinderRoom cylinderRoom = new CylinderRoom(Double.parseDouble(roomRadius),
					Double.parseDouble(roomHeight), Double.parseDouble(roomWindowArea));
			
			// results
			System.out.println("Please see your output calculations below:");
			System.out.println("============================");
			cylinderRoom.getFloorArea();
			cylinderRoom.getReqPaintInLitres();
			cylinderRoom.getRoomVolume();
			
			
			
			
			
		} 
		
		// option 2 is for a rectangular room path
		else if (roomType == 2 ) {
			
			System.out.println("You selected Rectangular Tank room.");
			
			System.out.println("Please enter the rooms length");
			String floorLength = scanner2.nextLine();
			System.out.println("You entered: " + floorLength + " as the length of the room.");
			System.out.println("---------------------");
			if (Double.parseDouble(floorLength) * 0 != 0) {
				System.out.println("Please start again and enter a valid number!");
			}
			
			System.out.println("Pleae enter the width of the room");
			String floorWidth = scanner3.nextLine();
			System.out.println("You entered: " + floorWidth + " as the room width");
			System.out.println("---------------------");
			if (Double.parseDouble(floorWidth) * 0 != 0) {
				System.out.println("Please start again and enter a valid number!");
			}
			
			System.out.println("Pleae enter the height of the room");
			String roomHeight = scanner4.nextLine();
			System.out.println("You entered: " + roomHeight + " as the room height");
			System.out.println("---------------------");
			if (Double.parseDouble(roomHeight) * 0 != 0) {
				System.out.println("Please start again and enter a valid number!");
			}
			
			
			System.out.println("Please enter the total surface area of windows across all walls of the room");
			String roomWindowArea = scanner5.nextLine();
			System.out.println("You entered: " + roomWindowArea + " as the total surface area of windows across"
					+ " all walls of the room");
			System.out.println("---------------------");
			if (Double.parseDouble(roomWindowArea) * 0 != 0) {
				System.out.println("Please start again and enter a valid number!");
			}
			
			
			// make an instance of the class to represent the users room
			RectangularTankRoom RectangularRoom = new RectangularTankRoom(Double.parseDouble(floorLength),
					Double.parseDouble(floorWidth), Double.parseDouble(roomHeight), 6);
			
			// results
			System.out.println("Please see your output calculations below:");
			System.out.println("============================");
			RectangularRoom.getFloorArea();
			RectangularRoom.getReqPaintInLitres();
			RectangularRoom.getRoomVolume();
			
		} else {
			System.out.println("Error you entered an incorrect option. "
					+ "Please start again and enter either 'r' or 'c'");
		}
		
		
		
	}

}
