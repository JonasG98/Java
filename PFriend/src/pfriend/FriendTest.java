package pfriend;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class FriendTest {

	@Test
	void testGetName() {
		Friend person1 = new Friend("Jonas", "Gorman");
		assertEquals("Jonas", person1.getName());
	}

	@Test
	void testGetlastName() {
		Friend person1 = new Friend("Jonas", "Gorman");
		assertEquals("Gorman", person1.getlastName());
	}

	@Test
	void testGetHomeTown() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		assertEquals("Hofheim", person3.getHomeTown());
	}

	@Test
	void testGetEmail() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		assertEquals("fynn.fynn@gmail.com", person3.getEmail());
	}

	@Test
	void testGetGender() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		assertEquals(Gender.MALE, person3.getGender());
	}

	@Test
	void testGetRelationshipStatus() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		assertEquals(Relationship.SINGLE, person3.getRelationshipStatus());
	}

	@Test
	void testGetBirthdate() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		LocalDate test = LocalDate.of(1998, 3, 30);
		assertEquals(test, person3.getBirthdate());
	}


	@Test
	void testSetName() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		person3.setName("Paul");
		assertEquals("Paul", person3.getName());
	}

	@Test
	void testSetLastName() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		person3.setLastName("Paul");
		assertEquals("Paul", person3.getlastName());
	}

	@Test
	void testSetHometown() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		person3.setHometown("Paul");
		assertEquals("Paul", person3.getHomeTown());
	}

	@Test
	void testSetEmail() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		person3.setEmail("Paul");
		assertEquals("Paul", person3.getEmail());
	}

	@Test
	void testSetGender() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		person3.setGender(Gender.FEMALE);
		assertEquals(Gender.FEMALE, person3.getGender());
	}

	@Test
	void testSetRelationship() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		person3.setRelationship(Relationship.MARRIED);
		assertEquals(Relationship.MARRIED, person3.getRelationshipStatus());
	}

	@Test
	void testSetBirthdate() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		LocalDate test = LocalDate.of(1998, 3, 30);
		person3.setBirthdate(test);
		assertEquals(test, person3.getBirthdate());
	}


	@Test
	void testCalcAge() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		assertEquals(21,person3.calcAge());
	}
	@Test
	void testCalcAge1() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,8,8,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		assertEquals(21,person3.calcAge());
	}
	@Test
	void testCalcAge2() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,8,7,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		assertEquals(21,person3.calcAge());
	}
	@Test
	void testCalcAge3() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,8,14,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		assertEquals(20,person3.calcAge());
	}

	@Test
	void testIsTheSame() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person2 = new Friend("Luca", "Schroeder", 1997, 8, 02);
		
		assertEquals(false,person3.isTheSame(person2));
	}
	@Test
	void testIsTheSame1() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		Friend person2 = new Friend("Fynn", "Semrau", 1997, 8, 02);
		
		assertEquals(true,person3.isTheSame(person2));
	}

	@Test
	void testToString() {
		Friend person3 = new Friend("Fynn", "Semrau", 1998,3,30,Gender.MALE,"Hofheim", "fynn.fynn@gmail.com", Relationship.SINGLE);
		assertEquals("Fynn Semrau 1998-03-30 MALE Hofheim fynn.fynn@gmail.com SINGLE ",person3.toString());
	}

}
