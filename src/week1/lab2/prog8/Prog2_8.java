package week1.lab2.prog8;

public class Prog2_8 {
	
	static int min(int[] arrayOfInts) {
		int minElement = arrayOfInts[0];
		for(int i = 0; i < arrayOfInts.length; i++) 
		{
			if(arrayOfInts[i] < minElement) minElement = arrayOfInts[i];
		}
		return minElement;
	}

}
