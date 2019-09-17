package panimal;

import java.util.ArrayList;

public class CreateAnimalApp {

	public static void main(String[] args) {
		Dog daisy = new Dog("Daisy");
		SeaLion slippy = new SeaLion("Slippy");
		
		//System.out.println(daisy.toString());
		//System.out.println(slippy.toString());
		//System.out.println(daisy.REGFREE);
		int count = 1;
		count = count++;
		//System.out.println(count);
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Tarzier mord = new Tarzier("Mord");
		Horse roach = new Horse("Roach");
		animals.add(daisy);
		animals.add(slippy);
		animals.add(mord);
		animals.add(roach);
		
		for (Animal item:animals)
				{
				System.out.println(item.speak());
				}
		for (Animal item:animals)
		{
			if (item instanceof Domesticated)
			{
				System.out.println(((Domesticated) item).work());
			}
			else
			{
				System.out.println(item.type + " does no useful work");
			}
		
		}
	}

}
