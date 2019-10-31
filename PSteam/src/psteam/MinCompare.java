package psteam;

import java.util.Comparator;

public class MinCompare implements Comparator<Game> {

	@Override
	public int compare(Game p1, Game p2) {
		
		if (p1.getMinOwners() < p2.getMinOwners()) return -1;
        if (p1.getMinOwners() > p2.getMinOwners()) return 1;
        return 0;
	}

}
