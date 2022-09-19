package week2.lab5.prog3;

import java.util.Arrays;
import java.util.Comparator;

public class MainLambda {

	public static void main(String[] args) {
		
		String[] arr = {	
				new String("Alice"), 
				new String("Bill"), 
				new String("Sue"), 
				new String("Joe")
			};
		
		StringSort sort = new StringSort( (s1, s2) -> s1.length() - s2.length() );
		System.out.println(Arrays.toString(sort.stringSort(arr)));
	}

}
