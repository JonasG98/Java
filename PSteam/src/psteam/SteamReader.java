package psteam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

public class SteamReader {
	
	public SteamReader() {
		
	}
	
	public static void load(ArrayList<Game> games)
	{
			 String name;
			 String releaseDate;
			 int achievments;
			 int positiveRatings;
			 int negativeRatings;
			 int averagePlaytime;
			 int medianPlaytime;
			 String owners;
			 double price;
			 String line;
			
			 try
			 {
				 BufferedReader in = new BufferedReader(new FileReader("steam.csv"));
				
				 int i = 0;
					while ((line = in.readLine())!= null)
					 {
						System.out.println(i);
						i++;
						 String[] fields = line.split(",");
						 name= fields[0];
						 releaseDate= fields[1];
						 achievments= Integer.parseInt(fields[2]);
						 positiveRatings= Integer.parseInt(fields[3]);
						 negativeRatings= Integer.parseInt(fields[4]);
						 averagePlaytime= Integer.parseInt(fields[5]);
						 medianPlaytime= Integer.parseInt(fields[6]);
						 owners= fields[7];
						 price= Double.parseDouble(fields[8]);
						 games.add(new Game(name,releaseDate,achievments,positiveRatings,negativeRatings,averagePlaytime,medianPlaytime,owners,price));
					 }
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			 }
			 

}

