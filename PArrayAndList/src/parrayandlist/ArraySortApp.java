package parrayandlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraySortApp {

	public static void main(String[] args) {
			File file = new File("sort04.txt");
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			
		try 
		{
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine())
			{
				
				String line = scanner.nextLine();
				numbers.add(Integer.parseInt(line));
				
				
			}
			
			int max = numbers.size();
			int[] numbers1 = new int[max];
			for (int i = 0; i < numbers1.length; i ++)
			{
				numbers1[i] = numbers.get(i);
						
			}
			scanner.close();
			ArrayAndListUtilities.bucketSort(numbers1);
			try {
				FileWriter outFile = new FileWriter("sorting.txt");
				PrintWriter out = new PrintWriter(outFile);
				for (int i = 0; i < numbers1.length; i ++)
				{
					out.println(numbers1[i]);
				}
				out.close();
				
				} 
			
			catch (IOException e)
			{
					e.printStackTrace();
			}
			
			
		} 
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		}


	
	
	File file2 = new File("threebears.txt");
	ArrayList<String> words = new ArrayList<String>();
	
	try
	{
	Scanner scanner2 = new Scanner(file2);
		while (scanner2.hasNextLine())
		{
		
			String line = scanner2.nextLine();
			words.add(line);
		
		
		}
		
		scanner2.close();
		
		
	}
	
	
		catch (IOException e)
		{
			e.printStackTrace();
		}
	String[] array = words.toArray(new String[0]);
	ArrayAndListUtilities.stringSort(array);
	
	try {
		FileWriter outFile = new FileWriter("bears.txt");
		PrintWriter out = new PrintWriter(outFile);
		
		for (int i = 0; i < array.length; i ++)
		{
			out.println(array[i]);
		}
		out.close();
		
		} 
	
	catch (IOException e)
	{
			e.printStackTrace();
	}
	System.out.println(ArrayAndListUtilities.binarySearch(array, "always"));
	
}
}


