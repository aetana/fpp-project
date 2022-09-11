package day3.prog4;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Triangle triangle = new Triangle(8, 2);
		Rectangle rectangle = new Rectangle(3, 2);
		
		System.out.println("Area of Circle is	: "+ String.format("%.2f",circle.computeArea()));
		System.out.println("Area of Triangle is	: "+ triangle.computeArea());
		System.out.println("Area of Rectangle is	: "+ rectangle.computeArea());
		
	}

}
