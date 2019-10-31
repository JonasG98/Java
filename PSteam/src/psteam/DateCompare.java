package psteam;

import java.util.Comparator;

public class DateCompare implements Comparator<Game> {

	@Override
	public int compare(Game f1, Game f2) {
		
		return f1.getReleaseDate().compareTo(f2.getReleaseDate());
	}
	
	

}
