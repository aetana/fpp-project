package week1.lab4.prog2.closedcurve.good;

public class Rectangle extends ClosedCurve{
	private double width;
	private double length;
	
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length; 
	}
	
	public double computeArea() {
		return width * length;
	}
	

}
