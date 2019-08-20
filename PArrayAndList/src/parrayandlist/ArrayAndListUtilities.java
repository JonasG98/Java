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
		if(numbers == null)
		{
			throw new NullPointerException("array is empty");
		}
		int max = 0;
		max = numbers.get(0);
		for(int item:numbers)
		{
			if (item > max)
			{
				max = item;
			}
		}
		return max;
	}
	
	public static int findMin(int[] numbers)
	{
		if(numbers == null)
		{
			throw new NullPointerException("array is empty");
		}
		int min = 0;
		min = numbers[0];
		for(int item:numbers)
		{
			if (item < min)
			{
				min = item;
			}
		}
		return min;
	}
	
	public static int findMin(ArrayList<Integer> numbers)
	{
		if(numbers == null)
		{
			throw new NullPointerException("array is empty");
		}
		int min = 0;
		min = numbers.get(0);
		for(int item:numbers)
		{
			if (item < min)
			{
				min = item;
			}
		}
		return min;
	}
	
	public static  String findIt(int[] numbers, int wanted)
	{
		if(numbers == null)
		{
			throw new NullPointerException("array is empty");
		}
		String position;
		position = "This number is not in the array ";
		for(int i = 0; i < numbers.length; i ++)
		{
			if ( wanted == numbers[i])
			{
				position = "This number is at position " + i;
			}
		}
		return position;
	}
	
	public static String findIt(ArrayList<Integer> numbers, int wanted)
	{
		int run = 0;
		if(numbers == null)
		{
			throw new NullPointerException("array is empty");
		}
		
		StringBuilder position = new StringBuilder("This number is at position " );
		
		
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
		return position.toString();
	}
}
