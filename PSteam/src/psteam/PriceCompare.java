package psteam;

import java.util.Comparator;

public class PriceCompare implements Comparator<Game> {

	@Override
	public int compare(Game p1, Game p2) {
		
		if (p1.getPrice() < p2.getPrice()) return -1;
        if (p1.getPrice() > p2.getPrice()) return 1;
        return 0;
	}

}
