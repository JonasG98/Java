package psteam;

import java.util.Comparator;

public class GameCompare implements Comparator<Game> {

	@Override
	public int compare(Game f1, Game f2) {
		
		return f1.getName().compareTo(f2.getName());
	}
	
	

}
