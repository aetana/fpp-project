package day2.prog5;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String input = s.nextLine();
		s.close();
		String newString = "";
//		char[] reversed = new char[input.length()];	
		for(int j = input.length() - 1; j >= 0;j-- ) {
			newString+=input.charAt(j);
			//reversed[i] = input.charAt(j);
			//reversed[j] = input.charAt(i);
		}
		System.out.println(newString);

	}
	
	
}
