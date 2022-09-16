package week1.lab3.prog4;

public  final class Rectangle {
	private final double width;
	private  final double length;
	public Rectangle(double wid, double len) {
		width = wid;
		length = len;
	}
	public double getWidth() {
		return width;
	}
	
	public double computeArea() {
		return length * width;
	};
	
	public double getLength() {
		return length;
	}

}
