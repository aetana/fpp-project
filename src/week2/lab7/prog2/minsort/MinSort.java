package week2.lab7.prog2.minsort;

import java.util.Arrays;

public class MinSort {

	public String sort(String s) {
		char[] arr = s.toCharArray();
		int index = 0;
		if (arr == null || arr.length < 1) return null;
		char result[] = recurSort(arr, index);
		return String.valueOf(result);
	}
	
	private char[] recurSort(char []arr, int index) {
		int minIndex = index;
		minIndex = recurFindMin(arr, index);
		if(minIndex != index)  swap(arr, index, minIndex);
		//char arrReturn;
		if(index < arr.length - 1) return recurSort(arr, index + 1);
		return arr;
	}
	
	private int recurFindMin(char[] arr, int index) {
		int len = arr.length;
		char first = arr[index];
		if(index == (len - 1)) return index;
		int recFindIndex = recurFindMin(arr, index + 1);
		char recFind = arr[recFindIndex];
		if(first < recFind) return index;
		else return recFindIndex;
	}
	
	// Swaps values arr[i], arr[j]
	private void swap(char []arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String args[]) {
		MinSort ms = new MinSort();
		String s = "zwxuabfkafutbbbb";
		System.out.println(ms.sort(s));	
		
	}
}
