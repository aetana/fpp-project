package week2.lab5.prog3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String[] arr = {	
				new String("Alice"), 
				new String("Bill"), 
				new String("Sue"), 
				new String("Joe")
			};
		//StringLengthComparator compareUser = ;
		StringSort sort = new StringSort(new StringLengthComparator());
		System.out.println(Arrays.toString(sort.stringSort(arr)));
	}

}
