package panimal;

public class Dog extends Animal implements Domesticated{

	public Dog(String name) {
		super(name);
		//type = "dog";
	}
	
	public String speak()
	{
		return "woof";
	}
	public String reward()
	{
		return "treat";
	}
	public String work()
	{
		return "service dog";
	}

	@Override
	public String toString() {
		return super.toString() + ", reward=" + reward() + ", work="
				+ work() + "";
	}

	
}
