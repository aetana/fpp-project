package day2.prog8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prog2_8Test {

	@Test
	void testMin() {
		int testData[] =  {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int result = Prog2_8.min(testData);
		int expected = -22;
		assertTrue(result == expected);
		
	}

}
