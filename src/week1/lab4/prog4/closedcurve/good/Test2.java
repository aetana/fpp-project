package week1.lab4.prog4.closedcurve.good;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon[] objects = { new Square(3), new Triangle(4, 5, 6),  new Rectangle(3, 4)};
		//compute areas
		for (Polygon cc : objects) {
			System.out.println("For this " + cc.getClass().getSimpleName() + 
								"\n  Number of sides = " + cc.getNumberOfSides() + 
								"\n  Perimeter = " + cc.computePerimeter()); 

		}

	}

}
