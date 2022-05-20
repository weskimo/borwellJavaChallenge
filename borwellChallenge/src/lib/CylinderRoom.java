package lib;

public class CylinderRoom {
	// wall paramas for input
    private double floorRadius;
    private double wallHeight;
    private double totalWindowArea;
    
    
    private double wallAreaSqMetrePerPaint;
    
    // constructor: Inputs: floor radius in metres, wall height in metres, total window area in m^2 
    public CylinderRoom(double floorRadius, double wallHeight, 
    		double totalWindowArea) {
        
    	// set the custom dimensions of the room
        this.floorRadius = floorRadius;
        this.wallHeight = wallHeight;
        this.totalWindowArea = totalWindowArea;
        
        // estimate that 1 litre of paint will cover 6 sq metres of wall
        this.wallAreaSqMetrePerPaint = 6;
    }

	public double getFloorArea() {
		double area = Math.PI * floorRadius * floorRadius;
		System.out.println(area + " metres squared is the area of the floor");
		return area;
	}

	public double getReqPaintInLitres() {
		double wallArea = (2 * Math.PI * floorRadius * wallHeight) + 
				  (2*Math.PI * floorRadius * floorRadius); 

		double totalMinusWindows = (wallArea - totalWindowArea) / wallAreaSqMetrePerPaint;

		System.out.println(totalMinusWindows);
		return totalMinusWindows;
	}
}
