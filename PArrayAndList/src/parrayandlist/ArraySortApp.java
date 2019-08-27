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


	}

}
