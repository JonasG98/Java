/* Class that creates a friend with as much information about him as possible */
package pfacebook;

import java.time.LocalDate;

public class Friend implements Comparable<Friend>
{

	private String name;
	private String lastName;
	private String homeTown;
	private String email;
	private Relationship relationshipStatus;
	private Gender gender;
	private LocalDate birthdate;
	
	
	
	public Friend(String name, String lastName)
	{
		this.name = name;
		this.lastName = lastName;

	}
	public Friend(String name, String lastName, int year, int month, int day)
	{
		this(name,lastName);
		birthdate =  LocalDate.of(year, month, day);

		
	}
	public Friend(String name, String lastName, int year, int month, int day, Gender gender, String homeTown, String email, Relationship relationshipStatus)
	{
		this(name,lastName,year,month,day);
		this.gender = gender;
		this.homeTown = homeTown;
		this.email = email;
		this.relationshipStatus = relationshipStatus;

	}
	public String getName()
	{
		return name;
	}
	public String getlastName()
	{
		return lastName;
	}
	public String getHomeTown()
	{
		return homeTown;
	}
	public String getEmail()
	{
		return email;
	}
	public Gender getGender()
	{
		return gender;
	}
	public Relationship getRelationshipStatus()
	{
		return relationshipStatus;
	}
	public LocalDate getBirthdate()
	{
		return birthdate;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setHometown(String homeTown)
	{
		this.homeTown = homeTown;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
	public void setRelationship(Relationship relationshipStatus)
	{
		this.relationshipStatus = relationshipStatus;
	}
	public void setBirthdate(LocalDate birthdate)
	{
		this.birthdate = birthdate;
	}
	
	public int calcAge()
	{
		int age;
		LocalDate currentDate = LocalDate.now();
		if(currentDate.getMonthValue() > birthdate.getMonthValue())
		{
			age = currentDate.getYear() - birthdate.getYear();
		}
		else 
		{
			if(currentDate.getDayOfMonth() < birthdate.getDayOfMonth())
			{
				age = currentDate.getYear() - birthdate.getYear() - 1;
			}
			else
			{
				age = currentDate.getYear() - birthdate.getYear() ;
			}
		}
		
		
		return age;
	}
	public boolean isTheSame(Friend person)
	{
		if (person.name.equals(name) && person.lastName.equals(lastName))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		StringBuilder result = new StringBuilder(name + " " + lastName + " ");
		if(birthdate != null)
		{
			result.append(birthdate + " " + calcAge() + " ");
		}
		if(gender != null)
		{
			result.append(gender + " ");
		}
		if(homeTown != null)
		{
			result.append(homeTown + " ");
		}
		if(email != null)
		{
			result.append(email + " ");
		}
		if(relationshipStatus != null)
		{
			result.append(relationshipStatus + " ");
		}
		
		return result.toString();
	}
	@Override
	public int compareTo(Friend f1) {
		if(this.getlastName().equals(f1.getlastName()))
		{
			return this.name.compareTo(f1.name);
		}
		else
		{
		return this.lastName.compareTo(f1.lastName);
		}
	}
}
