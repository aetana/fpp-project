package week2.lab5.prog3;

import java.util.Arrays;
import java.util.Comparator;


public class StringSort extends Object/* implements Comparator<String>*/{
	/*
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
	*/
	
	private Comparator<String> myComparator;
	
	public StringSort(Comparator<String> myComparator){
		this.myComparator = myComparator;
	}
	
	public String[] stringSort(String[] arr) {
		Arrays.sort(arr, myComparator);
		return arr;
	}

}
