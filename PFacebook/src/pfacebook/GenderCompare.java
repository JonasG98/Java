package pfacebook;

import java.util.Comparator;

public class GenderCompare implements Comparator<Friend> {

	@Override
	public int compare(Friend f1, Friend f2) {
		if(f1.getGender()==null && f2.getGender()==null)
		{
			return 0;
		}
		if(f1.getGender()==null)
		{
			return 1;
		}
		if(f2.getGender()==null)
		{
			return -1;
		}
		return f1.getGender().compareTo(f2.getGender());
	}

	
}
