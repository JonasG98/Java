package parrayandlist;

import java.util.ArrayList;

public class ArrayAndListUtilities {

	
	public static int findMax(int[] numbers)
	{
		if(numbers == null)
		{
			throw new NullPointerException("array is empty");
		}
		int max = 0;
		max = numbers[0];
		for(int item:numbers)
		{
			if (item > max)
			{
				max = item;
			}
		}
		return max;
	}
	
	public static int findMax(ArrayList<Integer> numbers)
	{
		int max = 0;
		if(numbers == null)
		{
			throw new NullPointerException("array is empty");
		}
		else
		{
		
		max = numbers.get(0);
		for(int item:numbers)
		{
			if (item > max)
			{
				max = item;
			}
		}
		}
		return max;
	}
	
	public static int findMin(int[] numbers)
	{
		int min = 0;
		if(numbers == null)
		{
			throw new NullPointerException("array is empty");
		}
		else
		{
		
		min = numbers[0];
		for(int item:numbers)
		{
			if (item < min)
			{
				min = item;
			}
		}
		}
		return min;
	}
	
	public static int findMin(ArrayList<Integer> numbers)
	{
		int min = 0;
		if(numbers == null)
		{
			throw new NullPointerException("array is empty");
		}
		else
		{
		min = numbers.get(0);
		for(int item:numbers)
		{
			if (item < min)
			{
				min = item;
			}
		}
		}
		return min;
	}
	
	public static  String findIt(int[] numbers, int wanted)
	{
		String position;
		if(numbers == null)
		{
			throw new NullPointerException("array is empty");
		}
		
		
		else
		{
		position = "This number is not in the array ";
		for(int i = 0; i < numbers.length; i ++)
		{
			if ( wanted == numbers[i])
			{
				position = "This number is at position " + i;
			}
		}
		}
		return position;
	}
	
	public static String findIt(ArrayList<Integer> numbers, int wanted)
	{
		int run = 0;
		StringBuilder position = new StringBuilder("This number is at position " );
		if(numbers == null)
		{
			throw new NullPointerException("array is empty");
		}
		else
		{
		
		for(int i = 0; i < numbers.size();i++)
		{
			if (wanted == numbers.get(i))
			{
				run++;
				position.append(i + ",");
			}
		}
		if (run == 0)
		{
			position.append("not found");
		}
		}
		return position.toString();
	}
	public static void bubbleSortv1(int[] numbers)
	{
		for (int i = 0; i < numbers.length -1; i ++)
		{
			for (int j = 0; j < numbers.length -1; j ++)
			{
				if(numbers[j] > numbers[j+1])
				{
				int temp = numbers[j + 1];
				numbers[j+1] = numbers[j];
				numbers[j] = temp;
				}
			}
		}
	}
	public static void bubbleSortv2(int[] numbers)
	{
		
		for (int i = 0; i < numbers.length -1; i ++)
		{
			for (int j = 0; j < numbers.length - 1 - i; j ++)
			{
				if(numbers[j] > numbers[j+1])
				{
				int temp = numbers[j + 1];
				numbers[j+1] = numbers[j];
				numbers[j] = temp;
				}
			}
			
			
		}
	}
	public static void bubbleSortv3(int[] numbers)
	{
		boolean sorted = false;
		while (sorted == false)
		{
			sorted = true;
			for(int j = 0; j < numbers.length -1; j++)
			{
				if(numbers[j] > numbers[j+1])
				{
				int temp = numbers[j + 1];
				numbers[j+1] = numbers[j];
				numbers[j] = temp;
				sorted = false;
				}
			}
		}
	}
	public static void selectionSort(int[] numbers)
	{
		for (int i = 0; i < numbers.length -1; i++)
		{
			int smallestPos = i;
			for (int j = i; j < numbers.length -1 ; j ++)
			{
				if (numbers[smallestPos] > numbers[j +1])
				{
					smallestPos = j + 1;
				}
				
			}
			if (smallestPos != i)
			{
				int temp = numbers[smallestPos];
				numbers[smallestPos] = numbers[i];
				numbers[i] = temp;
			}
		}
	}
	public static void bucketSort(int[] numbers)
	{
		int max = ArrayAndListUtilities.findMax(numbers);
		int[] buckets = new int[max + 1];
		for ( int i = 0; i < numbers.length; i ++)
		{
			buckets[numbers[i]] = buckets[numbers[i]] + 1;
		}
		int i = 0;
		for (int j = 0; j < buckets.length; j++)
		{
			if (buckets[j] > 0)
			{
				for(int x = buckets[j]; x > 0; x-- )
				{
				
				numbers[i] = j;
				i ++;
			}
			}
		}
	}
}
