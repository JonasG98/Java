package psteam;

import java.util.Comparator;

public class MaxCompare implements Comparator<Game> {

	@Override
	public int compare(Game p1, Game p2) {
		
		if (p1.getMaxOwners() < p2.getMaxOwners()) return 1;
        if (p1.getMaxOwners() > p2.getMaxOwners()) return -1;
        return 0;
	}

}
