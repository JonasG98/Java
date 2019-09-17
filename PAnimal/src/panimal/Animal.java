package panimal;

public abstract class Animal {
	protected String name;
	protected String type;
	
	
	public Animal(String name) {
		super();
		this.name = name;
		type = this.getClass().getSimpleName();
		
	}
	
	public abstract String speak();

	@Override
	public String toString() {
		return "Animal name=" + name + ", type=" + type +" " + "speak= " +speak();
	}
	
	
}
