package phonebook;


public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private String room;
	private String title;
	private String phone;
	
	public Person(String firstName, String lastName, String room, String title, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.room = room;
		this.title = title;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return  lastName + ", " + firstName + ", " + room + ", " + title
				+ ", " + phone ;
	}

	@Override
	public int compareTo(Person p1) {
		if(this.getLastName().equals(p1.getLastName()))
		{
			return this.firstName.compareTo(p1.firstName);
		}
		else
		{
		return this.lastName.compareTo(p1.lastName);
		}
	}
	
	
	

}
