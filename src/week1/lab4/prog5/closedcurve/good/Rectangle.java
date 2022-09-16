package week1.lab4.prog5.closedcurve.good;

import week1.lab4.prog5.closedcurve.good.ClosedCurve;
import week1.lab4.prog5.closedcurve.good.Polygon;

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
	
	public double[] getArrayOfSides() {
		double [] arrSides = new double[NUM_SIDES];
		arrSides[0] = width;
		arrSides[1] = width;
		arrSides[2] = length;
		arrSides[3] = length;
		return arrSides;
	}

}