package week1.lab4.prog5.closedcurve.good;

import week1.lab4.prog5.closedcurve.good.Polygon;

public class Test3 {
	
	public static void main(String[] args) {
		
		Polygon[] objects = { new Square(3), new Triangle(4, 5, 6), new Rectangle(3, 4) };
		// compute areas
		for (Polygon cc : objects) {
			System.out.println("For this " + cc.getClass().getSimpleName() + 
								"\n  Number of sides = " + cc.getArrayOfSides().length + 
								"\n  Perimeter = " + cc.computePerimeter());

		}

	}

}