package pfacebook;

import java.util.ArrayList;
import java.util.Collections;

public class BookApp {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		Book b0 = new Book("Zame of the wind", "Thomas, Julie");
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
		bookList.add(b0);
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
		//Collections.sort(bookList);
		//AuthorCompare ag = new AuthorCompare();
		Collections.sort(bookList);
		for(Book item: bookList)
		{
			System.out.println(item);
		}
	}

}
