package week1.lab4.prog4.closedcurve.good;

public class Rectangle extends ClosedCurve implements Polygon {
	private double width;
	private double length;
	private static final int NUM_SIDES = 4;
	
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public double computeArea() {
		return width * length;
	}
	
	public int getNumberOfSides() {
		return NUM_SIDES;
	}
	public double computePerimeter() {
		return width * NUM_SIDES / 2 + length * NUM_SIDES / 2;
	}

}
