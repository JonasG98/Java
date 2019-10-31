package psteam;

import java.util.Comparator;

public class AverageCompare implements Comparator<Game> {

	@Override
	public int compare(Game p1, Game p2) {
		
		if (p1.getAveragePlaytime() < p2.getAveragePlaytime()) return 1;
        if (p1.getAveragePlaytime() > p2.getAveragePlaytime()) return -1;
        return 0;
	}

}
