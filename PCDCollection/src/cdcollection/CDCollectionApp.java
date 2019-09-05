package cdcollection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;




public class CDCollectionApp {

	public static void main(String[] args) {
		String name;
		String line;
		ArrayList<Artist> artists = new ArrayList<Artist>();
		
		File text = new File("data.csv");
		
		try {
			Scanner scanner = new Scanner(text);
			while(scanner.hasNextLine())
			{
				ArrayList<Song> songs = new ArrayList<Song>();
				name = scanner.nextLine();
				
				for (int i = 0; i < 3; i ++)
				{
					line = scanner.nextLine();
					songs.add(new Song(line));
					
				}
				Collections.sort(songs);
				artists.add(new Artist(name, songs));
				
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
		Collections.sort(artists);
		CDCollection cd = new CDCollection(artists);
		
		System.out.println(cd.toString());

	}

}
