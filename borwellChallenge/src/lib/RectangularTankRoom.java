package lib;

public class RectangularTankRoom {
	// wall paramas for input
    private double floorLength;
    private double floorWidth;
    private double wallHeight;
    private double totalWindowArea;
    
    // stores the value of how much area 1 litre of paint will cover.
    private double wallAreaSqMetrePerPaint;
    
    // constructor: Inputs: floor radius in metres, wall height in metres, 
    // total window area in m^2
    public RectangularTankRoom(double floorLength, double floorWidth, double wallHeight, 
    		double totalWindowArea) {
        
    	// set the custom dimensions of the room
        this.floorLength = floorLength;
        this.floorWidth = floorWidth;
        this.wallHeight = wallHeight;
        this.totalWindowArea = totalWindowArea;
        
        // estimate that 1 litre of paint will cover 6 sq metres of wall
        this.wallAreaSqMetrePerPaint = 6;
    }

    // generic algo for finding area of flat rectangle
	public double getFloorArea() {
		double outcome = floorLength * floorWidth;
        System.out.println(outcome + " Metres Squared");
        return outcome;
	}

	// generic algo for finding the area of the walls then we divide by the amount of
	// area the paint will cover per litre. (estimate of 6 metre^2 per 1 litre paint)
	public double getReqPaintInLitres() {
		double wallAreaA = floorWidth * wallHeight;
    	double wallAreaB = floorLength * wallHeight;
    	
    	double totalArea = (wallAreaA*2) + (wallAreaB*2);
    	
    	double totalAreaMinusWindow = totalArea - totalWindowArea;
    	
    	double litresNeeded = totalAreaMinusWindow / wallAreaSqMetrePerPaint;
    	
		System.out.println(litresNeeded + " litres of paint would be required to "
				+ "paint all of the walls");
    	
    	return litresNeeded;
	}

	// generic algo to calculate the volume of the room
	public double getRoomVolume() {
		double outcome = floorLength * floorWidth * wallHeight;
    	System.out.println(outcome + " Metres Cubed");
    	return outcome;
	}
}
