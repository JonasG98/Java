package parrays;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListApp {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Jonas");
		myList.add("Janic");
		myList.add("James");
		myList.add("Julius");
		myList.add("Joshua");
		System.out.println(myList);
		myList.remove(2);
		for(String item:myList)
		{
			System.out.println(item.toString());
		}
		int pos = myList.indexOf("Julius");
		System.out.println("Julius is at position " + pos);
		String three = myList.get(2);
		System.out.println("the third item is " + three);
		
		ArrayList<Balloon> balloonList = new ArrayList<Balloon>();
		
		for (int i = 0; i < 10; i ++)
		{
			balloonList.add(new Balloon());
		}
		for (Balloon item:balloonList)
		{
			item.getColour();
			System.out.println(item.writeColour());
		}
		String size = JOptionPane.showInputDialog("Size of array");
		int lenght = Integer.parseInt(size);
		RandomNumbers test = new RandomNumbers(lenght);
		System.out.println(test.toString());
	}

}
