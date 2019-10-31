package psteam;

import java.util.Comparator;

public class NegativCompare implements Comparator<Game> {

	@Override
	public int compare(Game p1, Game p2) {
		
		if (p1.getNegativeRatings() < p2.getNegativeRatings()) return 1;
        if (p1.getNegativeRatings() > p2.getNegativeRatings()) return -1;
        return 0;
	}

}
