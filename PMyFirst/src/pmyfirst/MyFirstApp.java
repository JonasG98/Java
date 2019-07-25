package pmyfirst;

import java.util.Random;

public class MyFirstApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("my first line");
		System.out.println(Math.PI);
		// print out 5 more methods from the Math class
		Random generator = new Random();
		int dice = (generator.nextInt(6) + 1);
		System.out.println(dice);
		System.out.println("Number is a static class variable");
		int number = 5;
		// declare a local method variable called number2
		int number2 = 7;
		System.out.println(number + number2);
	}

}
