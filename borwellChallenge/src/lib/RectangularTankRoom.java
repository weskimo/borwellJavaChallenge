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

    
	public double getFloorArea() {
		double outcome = floorLength * floorWidth;
        System.out.println(outcome + " Metres Squared");
        return outcome;
	}
}
