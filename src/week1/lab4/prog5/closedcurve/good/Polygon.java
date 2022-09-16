package week1.lab4.prog5.closedcurve.good;

public interface Polygon {
	
	//returns in an array all sides of the polygon
	//example: For a rectangle, return would be [width, width,
	// length, length]
	public double[] getArrayOfSides();
	
	//returns the sum of the values in arr
	static double sum(double[] arr) {
		double sidesSum = 0;
		for(double e : arr) {
			sidesSum += e;
		}
		return sidesSum;
	}
	
	//returns the perimeter of the polygon
	default double computePerimeter() {
		return sum(getArrayOfSides());
	}
	
	//public int getNumberOfSides();
	//public double computePerimeter();

}
