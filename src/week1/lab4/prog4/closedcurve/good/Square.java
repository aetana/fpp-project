package week1.lab4.prog4.closedcurve.good;

public final class Square extends ClosedCurve implements Polygon{
	private final double side;
	private static final int NUM_SIDES = 4;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}

	public int getNumberOfSides() {
		return NUM_SIDES;
	}
	public double computePerimeter() {
		return side * NUM_SIDES;
	}

}
