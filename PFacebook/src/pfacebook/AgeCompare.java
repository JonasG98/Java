package pfacebook;

import java.util.Comparator;

public class AgeCompare implements Comparator<Friend>{

	@Override
	public int compare(Friend f1, Friend f2) {
		if(f1.getBirthdate()==null && f2.getBirthdate()==null)
		{
			return 0;
		}
		if(f1.getBirthdate()==null)
		{
			return 1;
		}
		if(f2.getBirthdate()==null)
		{
			return -1;
		}
		return f1.calcAge() - f2.calcAge();
	}

}
