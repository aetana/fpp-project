package day3.prog4;

public final class Circle {
	
	private final double radius;
	
	public Circle(double rad) {
		radius = rad;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	};
	
	public double getRadius() {
		return radius;
	}

}
