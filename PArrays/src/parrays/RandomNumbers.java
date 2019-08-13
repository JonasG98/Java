package parrays;

import java.util.Random;

public class RandomNumbers {
	private int[] ranNums;
	
	public RandomNumbers(int number)
	{
		ranNums = new int[number];
		fillNums();
	}
	public void fillNums()
	{
		Random rand = new Random();
		for(int i = 0; i < ranNums.length; i ++)
		{
			ranNums[i] = rand.nextInt(1000);
		}
	}
	public String toString()
	{
		String sentence;
		sentence = " ";
		for(int i = 0; i < ranNums.length; i++)
		{
			sentence = sentence + " " + ranNums[i];
		}
			
		return sentence;
	}

}
