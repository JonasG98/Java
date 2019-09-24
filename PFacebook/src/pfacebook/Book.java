package pfacebook;

public class Book implements Comparable<Book> {
	
	public String title;
	public String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		
		return title;
	}

	public void setTitle(String title) {
		
		this.title = title;
	}

	public String getAuthor() {
		
		return author;
	}

	public void setAuthor(String author) {
		
		this.author = author;
	}

	@Override
	public String toString() {
		return  title + ", Author: " + author;
	}

	@Override
	public int compareTo(Book f1) {
		
		return this.title.compareTo(f1.getTitle());
	}
	
	
	

}
