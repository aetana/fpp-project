package week1.lab1.prog1;

public class ArraySearch {

	public static int search(int arr[], int target) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) return i;
		}
		return -1;
	}
}
