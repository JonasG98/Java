package pfriend;

public class FriendApp {

	public static void main(String[] args) {
		Friend person1 = new Friend("Jonas", "Gorman");
		Friend person2 = new Friend("Luca", "Schroeder", 1997, 8, 02);
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		System.out.println(person1.toString());
		System.out.println(person2.getBirthdate());
		System.out.println(person3.toString());

	}

}
