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
			 String achievments;
			 String positiveRatings;
			 String negativeRatings;
			 String averagePlaytime;
			 String medianPlaytime;
			 String owners;
			 String price;
			 String line;
			// BufferedReader br = null;
			// File file = new File("steam.csv");
			// try {
				
		    //     br = new BufferedReader(new FileReader(file));
		    //     String availalbe;
		    //     while((availalbe = br.readLine()) != null) {
		   //                  
		    //     }
		   //   } catch (FileNotFoundException e) {
		    //     e.printStackTrace();
		    //  } catch (IOException e) {
		    //     e.printStackTrace();
		    //  } finally {
		    //     if (br != null) {
		     //       try {
		       //        br.close();
		     //       } catch (IOException e) {
		       //        e.printStackTrace();
		      //      }
		      //   }
		    //  }
			 try
			 {
				 BufferedReader in = new BufferedReader(new FileReader("steam.csv"));
				
				 
					while ((line = in.readLine())!= null)
					 {
						 String[] fields = line.split(",");
						 name= fields[0];
						 releaseDate= fields[1];
						 achievments= fields[2];
						 positiveRatings= fields[3];
						 negativeRatings= fields[4];
						 averagePlaytime= fields[5];
						 medianPlaytime= fields[6];
						 owners= fields[7];
						 price= fields[8];
						 games.add(new Game(name,releaseDate,achievments,positiveRatings,negativeRatings,averagePlaytime,medianPlaytime,owners,price));
					 }
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			 }
			 

}

