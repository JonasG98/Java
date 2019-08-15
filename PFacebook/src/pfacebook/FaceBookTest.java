package pfacebook;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import pfacebook.Gender;

class FaceBookTest {

	@Test
	void testSetIdentifier() {
		FaceBook book = new FaceBook("Jonas Gorman faceBook profile");
		book.setIdentifier("Luca");
		assertEquals("Luca", book.getIdentifier());
	}

	@Test
	void testGetIdentifier() {
		FaceBook book = new FaceBook("Jonas");
		
		assertEquals("Jonas", book.getIdentifier());
	}

	@Test
	void testGetFriendNumber() {
		FaceBook book = new FaceBook("Jonas Gorman faceBook profile");
		Friend person1 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person2 = new Friend("Luca", "Schr", 1997,8,20,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person3 = new Friend("Niki", "Albers", 1998,5,22,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		book.addFriend(person1);
		book.addFriend(person2);
		book.addFriend(person3);
		assertEquals(3,book.getFriendNumber());
	}

	@Test
	void testAddFriend() {
		FaceBook book = new FaceBook("Jonas");
		Friend person1 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		book.addFriend(person1);
		assertEquals("Jonas\nFynn Semrau 1998-03-30 MALE Hofheim fynn.fynn@gmail.com SINGLE \n",book.displayFriends());

	}

	@Test
	void testDisplayFriends() {
		FaceBook book = new FaceBook("Jonas Gorman faceBook profile");
		Friend person1 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person2 = new Friend("Luca", "Schr", 1997,8,20,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person3 = new Friend("Niki", "Albers", 1998,5,22,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		book.addFriend(person1);
		book.addFriend(person2);
		book.addFriend(person3);
		
		System.out.println(book.displayFriends());
	}

	@Test
	void testDisplayYoungsters() {
		FaceBook book = new FaceBook("Jonas Gorman faceBook profile");
		Friend person1 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person2 = new Friend("Luca", "Schr", 1998,8,16,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person3 = new Friend("Niki", "Albers", 2000,5,22,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		book.addFriend(person1);
		book.addFriend(person2);
		book.addFriend(person3);
		System.out.println(book.displayYoungsters());
	}

	@Test
	void testRemoveFriend() {
		FaceBook book = new FaceBook("Jonas Gorman removing a friend");
		Friend person1 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person2 = new Friend("Luca", "Schr", 1998,8,16,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person3 = new Friend("Niki", "Albers", 2000,5,22,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		book.addFriend(person1);
		book.addFriend(person2);
		book.addFriend(person3);
		book.removeFriend(person2);
		System.out.println(book.displayFriends());
	}
	
	@Test
	void testDuplicateFriend()
	{
		FaceBook book = new FaceBook("Jonas Gorman adding friend that exists alreeady");
		Friend person1 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person2 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		book.addFriend(person1);
		book.addFriend(person2);
		System.out.println(book.displayFriends());
	}
	@Test
	void testRemoveNonFriend()
	{
		FaceBook book = new FaceBook("Jonas Gorman removing friend that does not exist");
		Friend person1 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person4 = new Friend("Niki", "Albers", 2000,5,22,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		book.addFriend(person1);
		book.removeFriend(person4);
		assertEquals(1,book.getFriendNumber());
		
	}
	@Test
	void testUnder21NoBirthdates()
	{
		FaceBook book = new FaceBook("Jonas Gorman testing U21");
		Friend person1 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person2 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person4 = new Friend("Niki", "Albers", 2000,5,22,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person3 = new Friend("Janosh", "Saul");
		book.addFriend(person1);
		book.addFriend(person2);
		book.addFriend(person3);
		book.addFriend(person4);
		System.out.println(book.displayYoungsters());
	}
	@Test
	void testEmptyList()
	{
		FaceBook book = new FaceBook("Jonas Gorman testing empty List");
		System.out.println(book.displayFriends());
		
	}

}
