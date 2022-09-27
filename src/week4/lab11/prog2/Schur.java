package week4.lab11.prog2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Schur {

	public static boolean checkForSum(List<Integer> list, Integer z) {
		HashMap<Integer, Integer> hashM = new HashMap<>();
		list.forEach(num -> hashM.put(num, z - num));

		for (Integer key : list) {
			if (hashM.containsValue(key) && hashM.get(key) != key) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Integer[] array = { 1, 2, 4, 5 };
		Integer a = 5;
		Integer b = 8;
		List<Integer> iList = new ArrayList<>();
		Collections.addAll(iList, array);

		System.out.println(checkForSum(iList, a));
		System.out.println(checkForSum(iList, b));
		
	}

}
