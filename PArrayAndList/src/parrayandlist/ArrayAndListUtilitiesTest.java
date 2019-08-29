package parrayandlist;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
		assertThrows(NullPointerException.class, ()->{ ArrayAndListUtilities.findMax(numbers);});
		
	
	}
	@Test
	void testEmptyArray1() {
		ArrayList<Integer> numbers = null;
		assertThrows(NullPointerException.class, ()->{ ArrayAndListUtilities.findMax(numbers);});
		
	
	}
	@Test
	void testEmptyArray2() {
		int[] numbers = null;
		assertThrows(NullPointerException.class, ()->{ ArrayAndListUtilities.findMin(numbers);});
		
	
	}
	@Test
	void testEmptyArray3() {
		ArrayList<Integer> numbers = null;
		assertThrows(NullPointerException.class, ()->{ ArrayAndListUtilities.findMin(numbers);});
		
	
	}
	@Test
	void testEmptyArray4() {
		ArrayList<Integer> numbers = null;
		assertThrows(NullPointerException.class, ()->{ ArrayAndListUtilities.findIt(numbers, 0);});
		
	
	}
	@Test
	void testEmptyArray5() {
		int[] numbers = null;
		assertThrows(NullPointerException.class, ()->{ ArrayAndListUtilities.findIt(numbers, 0);});
		
	
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
		numbers.add(3);
		numbers.add(532);
		numbers.add(51);
		//System.out.println(ArrayAndListUtilities.findMin(numbers));
		assertEquals(3, ArrayAndListUtilities.findMin(numbers));
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
	void bubbleSortTest() {
		int[] numbers = new int[5];
		numbers[0] = 9;
		numbers[1] = 94;
		numbers[2] = 91;
		numbers[3] = 93;
		numbers[4] = 3;
		ArrayAndListUtilities.bubbleSortv1(numbers);
		int[] expected = {3,9,91,93,94};
		assertArrayEquals(expected, numbers);
		

	
	}
	@Test
	void bubbleSortTestv2() {
		int[] numbers = new int[5];
		numbers[0] = 55;
		numbers[1] = 912;
		numbers[2] = 91;
		numbers[3] = 4;
		numbers[4] = 1;
		ArrayAndListUtilities.bubbleSortv2(numbers);
		int[] expected = {1,4,55,91,912};
		assertArrayEquals(expected, numbers);
		

	
	}
	@Test
	void bubbleSortTestv3() {
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 912;
		numbers[2] = 91;
		numbers[3] = 16;
		numbers[4] = 2;
		ArrayAndListUtilities.bubbleSortv3(numbers);
		int[] expected = {1,2,16,91,912};
		assertArrayEquals(expected, numbers);
		
		}

	
	

	@Test
	void selectionSortTest() {
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 912;
		numbers[2] = 91;
		numbers[3] = 16;
		numbers[4] = 2;
		ArrayAndListUtilities.selectionSort(numbers);;
		int[] expected = {1,2,16,91,912};
		assertArrayEquals(expected, numbers);
		
		//for (int item:numbers)
		//{
		//System.out.println(item);
		//}

	
	}
	@Test
	void bucketSortTest()
	{
		int[] numbers = {4,3,5,5,7,10,10,10,2,2};
		ArrayAndListUtilities.bucketSort(numbers);
		int[] expected = {2,2,3,4,5,5,7,10,10,10};
		assertArrayEquals(expected, numbers);
		
	}
	@Test
	void bucketSortTest1()
	{
		int[] numbers = {3,3,3,3,3,3,3,3,3,3};
		ArrayAndListUtilities.bucketSort(numbers);
		int[] expected = {3,3,3,3,3,3,3,3,3,3};
		assertArrayEquals(expected, numbers);
		
	}
	@Test
	void bucketSortTest2()
	{
		int[] numbers = {300,3,3,300,3,3,322,3,311,3};
		ArrayAndListUtilities.bucketSort(numbers);
		int[] expected = {3,3,3,3,3,3,300,300,311,322};
		assertArrayEquals(expected, numbers);
		
	}
	@Test
	void binarySearchTest()
	{
		int[] numbers = {2,6,3,7,10,4,50,76,30};
		String actual = ArrayAndListUtilities.binarySearch(numbers, 111);
		
	    assertEquals("not found", actual);
		
	} 
	@Test
	void binarySearchTest1()
	{
		int[] numbers = {2,6,3,7,10,4,50,76,30};
		String actual = ArrayAndListUtilities.binarySearch(numbers, 2);
		
	    assertEquals("found it at 0", actual);
		
	} 
	@Test
	void binarySearchTest2()
	{
		int[] numbers = {2,6,3,7,10,4,50,76,30};
		String actual = ArrayAndListUtilities.binarySearch(numbers, 76);
		
	    assertEquals("found it at 8", actual); 
		
	} 
	@Test
	void stringSortTest()
	{
		String[] words = {"hello", "my", "name", "is", "jonas"};
		String[] expected = {"hello", "is", "jonas", "my", "name"};
		ArrayAndListUtilities.stringSort(words);
		assertArrayEquals(expected, words);
		//for (String item:words)
		//		{
			//	System.out.println(item);
		//		}
		
	}
	@Test
	void binarySearchTestString()
	{
		String[] words = {"hello", "my", "name", "is", "jonas"};
		String actual = ArrayAndListUtilities.binarySearch(words, "my");
		assertEquals("found it at 3", actual);
		
		
	}
	@Test
	void binarySearchTestString1()
	{
		String[] words = {"hello", "my", "name", "is", "jonas"};
		String actual = ArrayAndListUtilities.binarySearch(words, "blob");
		assertEquals("not found", actual);
		
		
	}

}
