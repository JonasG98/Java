package psteam;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class SteamApp {
	public SteamApp() {
		
	}

	public static void main(String[] args) {
	//	 BufferedReader br = null;
		//File file = new File("steam.csv");
		//ArrayList<String> steam = new ArrayList<String>();
		
		 //try {
	         //br = new BufferedReader(new FileReader(file));
	         //String availalbe;
	         //while((availalbe = br.readLine()) != null) {
	           //  steam.add(availalbe);            
	         //}
	      //} catch (FileNotFoundException e) {
	         //e.printStackTrace();
	      //} catch (IOException e) {
	         //e.printStackTrace();
	      //} finally {
	        // if (br != null) {
	          //  try {
	            //   br.close();
	            //} catch (IOException e) {
	               //e.printStackTrace();
	            //}
	         //}
	      //}
		ArrayList<Game> games = new ArrayList<Game>();
		SteamReader.load(games);
		
		
		SteamGui gui = new SteamGui(games);
		gui.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(games.get(1000).getAchievments());
		//for(Game item: games)
		//{
		//	System.out.println(item);
		//}
			
	}

}
