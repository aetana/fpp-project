package week1.lab4.prog5.closedcurve.good;

import week1.lab4.prog5.closedcurve.good.ClosedCurve;
import week1.lab4.prog5.closedcurve.good.Polygon;

public final class Square extends ClosedCurve implements Polygon{
	private final double side;
	private static final int NUM_SIDES = 4;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	
	public double computePerimeter() {
		return side * NUM_SIDES;
	}

	public double[] getArrayOfSides() {
		double [] arrSides = new double[NUM_SIDES];
		for(double e:arrSides) {
			e = side;
		}
		return arrSides;
		
	}
}
