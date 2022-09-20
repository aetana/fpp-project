package week2.lab5.prog3.anonymouslambda;

import java.util.Arrays;
import java.util.Comparator;


public class MainAnonymous {

	public static void main(String[] args) {
		String[] arr = {	
				new String("Alice"), 
				new String("Bill"), 
				new String("Sue"), 
				new String("Joe")
			};
		//StringLengthComparator compareUser = ;
		StringSort sort = new StringSort(new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		System.out.println(Arrays.toString(sort.stringSort(arr)));

	}

}
