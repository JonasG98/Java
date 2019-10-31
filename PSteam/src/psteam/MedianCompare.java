package psteam;

import java.util.Comparator;

public class MedianCompare implements Comparator<Game> {

	@Override
	public int compare(Game p1, Game p2) {
		
		if (p1.getMedianPlaytime() < p2.getMedianPlaytime()) return 1;
        if (p1.getMedianPlaytime() > p2.getMedianPlaytime()) return -1;
        return 0;
	}

}
