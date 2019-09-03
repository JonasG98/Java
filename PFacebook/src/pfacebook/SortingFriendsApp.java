package pfacebook;

import java.util.Arrays;

public class SortingFriendsApp {

	public static void main(String[] args) {
		Friend p1 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.FEMALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend p2 = new Friend("Luca", "Schr", 1997,8,20,Gender.MALE,"Hofheim", "bb", Relationship.MARRIED);
		Friend p3 = new Friend("Niki", "Albers", 1998,10,22,Gender.NON_BINARY,"Hofheim", "ff", Relationship.DIVORCED);
		Friend p4 = new Friend("Schniki", "Albers", 1996,2,21,Gender.MALE,"Hofheim", "mm", Relationship.COMPLICATED);
		Friend p5 = new Friend("Jonas", "Gorman");
		Friend p6 = new Friend("Tom", "Semrau");
		Friend p7 = new Friend("Knicki", "Albers");
		
		Friend[] friends = {p1,p2,p3,p4,p5,p6,p7};
		
		//ArrayAndListUtilities.bubbleSortv1(friends);
		//Arrays.sort(friends);
		//GenderCompare gc = new GenderCompare();
		//Arrays.sort(friends,gc);
		AgeCompare ac = new AgeCompare();
		Arrays.sort(friends,ac);
		
		for(Friend item: friends)
		{
			System.out.println(item);
		}

	}

}
