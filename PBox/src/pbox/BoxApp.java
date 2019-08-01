package pbox;

public class BoxApp {

	public static void main(String[] args) {
		
		Box perfect = new Box(5);
		Box square = new Box(5, 6);
		Box random = new Box(8, 3, 6);
		perfect.toString();
		square.toString();
		random.toString();

	}

}
