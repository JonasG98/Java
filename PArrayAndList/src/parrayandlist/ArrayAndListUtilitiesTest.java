package parrayandlist;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ArrayAndListUtilitiesTest {

	@Test
	void testFindMaxIntArray() {
		int[] numbers = new int[5];
		numbers[0] = 9;
		numbers[1] = 94;
		numbers[2] = 91;
		numbers[3] = 93;
		numbers[4] = 3;
		//System.out.println(ArrayAndListUtilities.findMax(numbers));
		assertEquals(94, ArrayAndListUtilities.findMax(numbers));
	}
	@Test
	void testEmptyArray() {
		int[] numbers = null;
		
		//System.out.println(ArrayAndListUtilities.findMax(numbers));
	}

	@Test
	void testFindMaxArrayListOfInteger() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(50);
		numbers.add(55);
		numbers.add(532);
		numbers.add(51);
		//System.out.println(ArrayAndListUtilities.findMax(numbers));
		assertEquals(532, ArrayAndListUtilities.findMax(numbers));
	}

	@Test
	void testFindMinIntArray() {
		int[] numbers = new int[5];
		numbers[0] = 9;
		numbers[1] = 94;
		numbers[2] = 91;
		numbers[3] = 93;
		numbers[4] = 3;
		//System.out.println(ArrayAndListUtilities.findMin(numbers));
		assertEquals(3, ArrayAndListUtilities.findMin(numbers));
	}

	@Test
	void testFindMinArrayListOfInteger() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(50);
		numbers.add(55);
		numbers.add(532);
		numbers.add(51);
		//System.out.println(ArrayAndListUtilities.findMin(numbers));
		assertEquals(5, ArrayAndListUtilities.findMin(numbers));
	}

	@Test
	void testFindItIntArrayInt() {
		int[] numbers = new int[5];
		numbers[0] = 9;
		numbers[1] = 94;
		numbers[2] = 91;
		numbers[3] = 93;
		numbers[4] = 3;
		//System.out.println(ArrayAndListUtilities.findIt(numbers, 93));
		assertEquals("This number is at position 3", ArrayAndListUtilities.findIt(numbers, 93));
	}

	@Test
	void testFindItArrayListOfIntegerInt() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(50);
		numbers.add(55);
		numbers.add(532);
		numbers.add(51);
		//System.out.println(ArrayAndListUtilities.findIt(numbers, 5));
		assertEquals("This number is at position 1,", ArrayAndListUtilities.findIt(numbers, 50));
	}
	@Test
	void testFindTwoNumbers() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(50);
		numbers.add(55);
		numbers.add(5);
		numbers.add(51);
		//System.out.println(ArrayAndListUtilities.findIt(numbers, 5));
		assertEquals("This number is at position 0,3,", ArrayAndListUtilities.findIt(numbers, 5));
	}
	@Test
	void testFindTwoNumbers2() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(60);
		numbers.add(70);
		numbers.add(5);
		numbers.add(52);
		numbers.add(11);
		numbers.add(12);
		numbers.add(8);
		numbers.add(19);
		numbers.add(20);
		//System.out.println(ArrayAndListUtilities.findIt(numbers, 5));
		assertEquals("This number is at position 9,", ArrayAndListUtilities.findIt(numbers, 20));
		assertEquals("This number is at position 0,3,", ArrayAndListUtilities.findIt(numbers, 5));
		assertEquals("This number is at position not found", ArrayAndListUtilities.findIt(numbers, 100));
	}
	@Test
	void readInNum() {
		BufferedReader br = new BufferedReader(new FileReader(rand.txt));

	
	}

}
