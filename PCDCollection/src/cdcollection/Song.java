package cdcollection;



/**
 *
 * @author dale
 */
public class Song implements Comparable<Song> {

    private String title;

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return getTitle();
    }

	@Override
	public int compareTo(Song p1) {
		
		return this.title.compareTo(p1.title);
	}

}
