package pcollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import com.sun.jdi.Value;






public class CollectionsApp {

	public static void main(String[] args) {
		ArrayList<String> myCollections = new ArrayList<String>();
		myCollections.add("i");
		myCollections.add("came");
		myCollections.add("i");
		myCollections.add("saw");
		myCollections.add("i");
		myCollections.add("conquered");
		
		System.out.println(myCollections);
		HashSet<String>myhashset = new HashSet<String>();
		myhashset.addAll(myCollections);
		System.out.println(myhashset);
		LinkedHashSet<String>linkedSet = new LinkedHashSet<String>();
		linkedSet.addAll(myCollections);
		System.out.println(linkedSet);
		TreeSet<String>treeSet = new TreeSet<String>();
		treeSet.addAll(myCollections);
		System.out.println(treeSet);
		ArrayList<String> myCollections2 = new ArrayList<String>();
		myCollections2.add("i");
		myCollections2.add("came");
		myCollections2.add("i");
		myCollections2.add("saw");
		myCollections2.add("i");
		myCollections2.add("ran");
		myCollections2.add("away");
		TreeSet<String>treeSet2 = new TreeSet<String>();
		treeSet2.addAll(myCollections2);
		System.out.println(treeSet2);
		
		
		System.out.println(myCollections.containsAll(myCollections2));
		Set<String> intersection = new TreeSet<String>(myCollections);
		intersection.retainAll(myCollections2);
		System.out.println(intersection);
		
		Set<String> union = new TreeSet<String>(myCollections);
		union.addAll(myCollections2);
		System.out.println(union);
		
		Set<String> difference = new TreeSet<String>(myCollections);
		difference.removeAll(myCollections2);
		System.out.println(difference);
		
		TreeSet<Book> bookList = new TreeSet<Book>();
		Book b1 = new Book("Rachel's Legacy", "Thomas, Julie");
		Book b2 = new Book("Bulibasha", "Ihimaera, Witi");
		Book b3 = new Book("Chappy", "Grace, Patricia");
		Book b4 = new Book("Wild Pork and Watercress", "Crump, Barry");
		Book b5 = new Book("The Invisible Mile", "Coventry, David");
		Book b6 = new Book("Dad Art", "Wilkins, Damien");
		Book b7 = new Book("The Antipodeans", "McGee, Greg");
		Book b8 = new Book("Absence", "King, Joanna");
		Book b9 = new Book("Taken", "O'Callagan, Sue");
		Book b10 = new Book("Taken", "Crais, Robert");
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		bookList.add(b6);
		bookList.add(b7);
		bookList.add(b8);
		bookList.add(b9);
		bookList.add(b10);
		
		for(Book item: bookList)
		{
			System.out.println(item);
		}
		
		
		Map<String, Integer> vehicles = new TreeMap<String, Integer>();
		vehicles.put("Datsun", 2);
		vehicles.put("Holden", 3);
		vehicles.put("Toyota", 4);
		vehicles.put("Suzuki", 1);
		
		System.out.println(vehicles);
		
		System.out.println("List of all vehicle types");
		for(String key:vehicles.keySet())
		{
			System.out.println(key);
		}
		int count = 0;
		for(int value:vehicles.values())
		{
			count = value + count;
		}
		System.out.println(count);
		
		String car = JOptionPane.showInputDialog("Which car do you want information on? Toyota, Holden, Suzuki or Datsun");
		if(vehicles.containsKey(car) == true)
		{
			System.out.println(vehicles.get(car));
		}
		else
		{
			System.out.println("this car does not exist");
		}
	}

}
