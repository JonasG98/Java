package panimal;

public class Horse extends Animal implements Domesticated {

	
	public Horse(String name) {
		super(name);
		
	}
	
	public String speak()
	{
		return "wheee";
	}
	public String reward()
	{
		return "carrot";
	}
	public String work()
	{
		return "kutsche";
	}

	@Override
	public String toString() {
		return super.toString() + ", reward=" + reward() + ", work="
				+ work() + "";
	}
	

}
