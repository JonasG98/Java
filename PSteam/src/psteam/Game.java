package psteam;

import java.sql.Date;
import java.time.LocalDate;



public class Game  implements Comparable<Game>{
	
	private String name;
	private LocalDate releaseDate;
	private int achievments;
	private int positiveRatings;
	private int negativeRatings;
	private int averagePlaytime;
	private int medianPlaytime;
	private int minOwners;
	private int maxOwners;
	private double price;
	
	
	public Game(String name, LocalDate releaseDate, int achievments, int positiveRatings, int negativeRatings,
			int averagePlaytime, int medianPlaytime, int minOwners, int maxOwners, double price) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.achievments = achievments;
		this.positiveRatings = positiveRatings;
		this.negativeRatings = negativeRatings;
		this.averagePlaytime = averagePlaytime;
		this.medianPlaytime = medianPlaytime;
		this.minOwners = minOwners;
		this.maxOwners = maxOwners;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}


	public int getAchievments() {
		return achievments;
	}


	public void setAchievments(int achievments) {
		this.achievments = achievments;
	}


	public int getPositiveRatings() {
		return positiveRatings;
	}


	public void setPositiveRatings(int positiveRatings) {
		this.positiveRatings = positiveRatings;
	}


	public int getNegativeRatings() {
		return negativeRatings;
	}


	public void setNegativeRatings(int negativeRatings) {
		this.negativeRatings = negativeRatings;
	}


	public int getAveragePlaytime() {
		return averagePlaytime;
	}


	public void setAveragePlaytime(int averagePlaytime) {
		this.averagePlaytime = averagePlaytime;
	}


	public int getMedianPlaytime() {
		return medianPlaytime;
	}


	public void setMedianPlaytime(int medianPlaytime) {
		this.medianPlaytime = medianPlaytime;
	}


	public int getMinOwners() {
		return minOwners;
	}


	public void setMinOwners(int minOwners) {
		this.minOwners = minOwners;
	}


	public int getMaxOwners() {
		return maxOwners;
	}


	public void setMaxOwners(int maxOwners) {
		this.maxOwners = maxOwners;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public int compareTo(Game f1) {
		return Integer.compare( f1.positiveRatings, this.positiveRatings);
	}




	
	

}
