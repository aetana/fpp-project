package day3.prog4;

public final class Triangle {
	private final double base;
	private final double height;
	
	public Triangle(double b, double h) {
		base = b;
		height = h;
	}
	
	public double computeArea() {
		return base * height * 1/2;
	};
	
	
	
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}

}
