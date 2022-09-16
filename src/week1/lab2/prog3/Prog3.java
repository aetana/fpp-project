package week1.lab2.prog3;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a class Prog3. Inside its main method, create float variables to store each of the following numbers:
		//	1.27, 3.881, 9.6
		//	Output to the console the following two values:
		//	1. the sum of the floats as an integer, obtained by casting the sum to type int
		//	2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer, 
		//	using the Math.round function

		float one, three, nine;
		one = 1.27f;
		three = 3.881f;
		nine = 9.6f;
		
		System.out.println("The sum of the FLOATS => "+ (one + three + nine) +" as an INTEGER => "+ (int)(one + three + nine));
		System.out.println("The sum of the FLOATS => "+ (one + three + nine) +" as an INTEGER => "+ Math.round((one + three + nine)));
	}

}
