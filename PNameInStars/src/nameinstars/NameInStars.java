package nameinstars;

public class NameInStars {
	private String name;

	public NameInStars(String name)
	{
		this.name = name;
	}
	public String surroundNameInStars()
	{
		name = "*****" + name + "*****\n" +  "*****" + name + "*****\n" + "*****" + name + "*****";
		return name;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}

