package pfacebook;

import pfacebook.Friend;
import pfacebook.Gender;
import pfacebook.Relationship;

public class FaceBookApp {

	public static void main(String[] args) {
		FaceBook book = new FaceBook("Jonas Gorman faceBook profile");
		Friend person1 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person2 = new Friend("Luca", "Schr", 1997,8,20,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person3 = new Friend("Niki", "Albers", 1998,5,22,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		book.addFriend(person1);
		book.addFriend(person2);
		book.addFriend(person3);
		
		System.out.println(book.displayFriends());
		
	}

}
