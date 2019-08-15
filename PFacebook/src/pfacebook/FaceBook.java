package pfacebook;

import java.util.ArrayList;

public class FaceBook {
	
	private ArrayList<Friend> friends;
	private String identifier;
	
	public FaceBook(String identifier)
	{
		this.identifier = identifier;
		friends = new ArrayList<Friend>();
	}
	public void setIdentifier(String identifier)
	{
		this.identifier = identifier;
	}
	public String getIdentifier()
	{
		return identifier;
	}
	public int getFriendNumber()
	{
		return friends.size();
	}
	public void addFriend(Friend friend)
	{
		int i =0;
		for (Friend item:friends)
		{
			if (item.isTheSame(friend) == true)
			{
				i = 1;
			}
		}
		if (i == 0)
		{
			friends.add(friend);
		}
	}
	public String displayFriends()
	{
		StringBuilder info = new StringBuilder();
		info.append(identifier + "\n");
		for (Friend item:friends)
		{
			info.append(item.toString() + "\n");
			
		}
		return info.toString();
	}
	public String displayYoungsters()
	{
		StringBuilder info = new StringBuilder();
		info.append(identifier + " under 21" + "\n");
		
		for (Friend item:friends)
		{
			if (item.getBirthdate() != null)
			{
				if (item.calcAge() < 21)
				{
					info.append(item.toString() + "\n");
					
				}
				
			}
			
		}
		return info.toString();
	}
	public void removeFriend(Friend friend)
	{
		int remove = -1;
		for (Friend item:friends)
		{
			if(item.isTheSame(friend) == true)
			{
				remove = friends.indexOf(item);
				friends.remove(remove);
			}
			
		}
		
	}

}
