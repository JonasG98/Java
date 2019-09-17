package pcomputer;

public class Laptop extends Computer {
	private double screenSize;
	private double weight;
	private static final String DEFAULT_MAN = "Dell";
	
	
	public Laptop(String manufacture, String processor, int ramSize, int diskSize, double screenSize, double weight) {
		super(manufacture, processor, ramSize, diskSize);
		this.screenSize = screenSize;
		this.weight = weight;
	}
	public Laptop(String processor, int ramSize, int diskSize, double screenSize, double weight) {
		this(DEFAULT_MAN,processor,ramSize,diskSize,screenSize,weight);
		this.screenSize = screenSize;
		this.weight = weight;
	}


	@Override
	public String toString() {
		return super.toString() + "Laptop screenSize=" + screenSize + ", weight=" + weight + "";
	}
	

}
