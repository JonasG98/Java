package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;




public class PhoneBookApp {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		String last;
		String first;
		String room;
		String title;
		String phone;
		File text = new File("Phone.csv");
		
		try {
			Scanner scanner = new Scanner(text);
			
			while(scanner.hasNextLine())
			{
				String line = scanner.nextLine();
				String[] fields = line.split(",");
				last = fields[0];
				first = fields[1];
				room = fields[2];
				title = fields[3];
				phone = fields[4];
				people.add(new Person(first,last,room,title,phone));
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Collections.sort(people);
		for(Person item: people)
		{
			
			System.out.println(item.toString());
		}
	}

}
