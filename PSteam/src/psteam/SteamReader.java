package psteam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class SteamReader {
	
	public SteamReader() {
		
	}
	
	public static void load(ArrayList<Game> games)
	{
			 String name;
			 LocalDate releaseDate;
			 int achievments;
			 int positiveRatings;
			 int negativeRatings;
			 int averagePlaytime;
			 int medianPlaytime;
			 int minOwners;
			 int maxOwners;
			 double price;
			 String line;
			
			 try
			 {
				 BufferedReader in = new BufferedReader(new FileReader("steam.csv"));
				 
				
			
					while ((line = in.readLine())!= null)
					 {						
						 String[] fields = line.split(",");
						 name= fields[0];
						 String[] parts = fields[1].split("/");
						 int part1 = Integer.parseInt(parts[0]); 
						 int part2 = Integer.parseInt(parts[1]); 
						 int part3 = Integer.parseInt(parts[2]);
						 
						 releaseDate= LocalDate.of(part3, part2, part1);
						 achievments= Integer.parseInt(fields[2]);
						 positiveRatings= Integer.parseInt(fields[3]);
						 negativeRatings= Integer.parseInt(fields[4]);
						 averagePlaytime= Integer.parseInt(fields[5]);
						 medianPlaytime= Integer.parseInt(fields[6]);
						 String[] parts1 = fields[7].split("-");
						 int minOwners1 = Integer.parseInt(parts1[0]);
						 int maxOwners1 = Integer.parseInt(parts1[1]);
						 minOwners= minOwners1;
						 maxOwners = maxOwners1;
						 price= Double.parseDouble(fields[8]);
						 games.add(new Game(name,releaseDate,achievments,positiveRatings,negativeRatings,averagePlaytime,medianPlaytime,minOwners,maxOwners,price));
					 }
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			 }
			 

}

