package pcomputer;

public class BuildMachineApp {

	public static void main(String[] args) {
		Computer pc1 = new Computer("Dell", "i5", 6, 500);
		Laptop lp1 = new Laptop("HP", "i7", 8, 1000, 17.5, 30);
		Laptop lp2 = new Laptop( "i7", 8, 1000, 17.5, 30);
		System.out.println(pc1.toString());
		System.out.println(lp1.toString());
		System.out.println(lp2.toString());
		System.out.println(pc1.getCount());

	}

}
