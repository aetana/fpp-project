package week1.lab1.prog1;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraySearchTest {
	int[] testArray = {5, 2, 9, 10, 7, 3, 2, 4};
	@Test
	void firstElement() {
		
		int target = 5;
		int result = ArraySearch.search(testArray, target);
		int expected = 0;
		assertTrue(expected == result);
	}
	
	@Test
	void lastElement() {
		
		int target = 4;
		int result = ArraySearch.search(testArray, target);
		int expected = testArray.length - 1;
		assertTrue(expected == result);
	}
	
	@Test
	void middelElement() {
		
		int target = 10;
		int result = ArraySearch.search(testArray, target);
		if(testArray.length % 2 == 0) {
			int expected1 = testArray.length/2 - 1;
			int expected2 = testArray.length/2;
			assertTrue(expected1 == result || expected2 == result);
		}
		else {
			int expected = testArray.length/2;
			assertTrue(expected == result);
		}
	}
	
	@Test
	void noElement() {
		
		int target = 11;
		int result = ArraySearch.search(testArray, target);
		int expected = -1;
		assertTrue(expected == result);
	}
	
	@Test
	void moreThanOneElement() {
		
		int target = 2;
		int result1 = ArraySearch.search(testArray, target);
		int result2 = ArraySearch.search(testArray, target);
		int expected = 1;
		assertTrue(expected == result1 && result2 != -1);
	}
	
	
	@Test
	void oneNotTargetElement() {
		int testArray1[] = {5};
		int target = 2;
		int result = ArraySearch.search(testArray1, target);
		int expected = 0;
		assertTrue(expected != result && testArray1.length == 1);
	}
	
	@Test
	void oneTargetElement() {
		int testArray1[] = {5};
		int target = 5;
		int result = ArraySearch.search(testArray1, target);
		int expected = 0;
		assertTrue(expected == result && testArray1.length == 1);
	}
	
	@Test
	void emptyElement() {
		int testArray1[] = {};
		int target = 5;
		int result = ArraySearch.search(testArray1, target);
		int expected = -1;
		assertTrue(expected == result );
	}	

}
