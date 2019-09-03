package pfacebook;

import java.util.Comparator;

public class AuthorCompare  implements Comparator<Book> {

	@Override
	public int compare(Book f1, Book f2) {
		if(f1.getAuthor().equals(f2.getAuthor()))
		{
			return f1.getTitle().compareTo(f2.getTitle());
		}
		else
		{
		return f1.getAuthor().compareTo(f2.getAuthor());
		}
	}

}
