package psteam;

import java.sql.Date;

public class Game {
	
	private String name;
	private String releaseDate;
	private int achievments;
	private int positiveRatings;
	private int negativeRatings;
	private int averagePlaytime;
	private int medianPlaytime;
	private String owners;
	private double price;
	
	
	public Game(String name, String releaseDate, int achievments, int positiveRatings, int negativeRatings,
			int averagePlaytime, int medianPlaytime, String owners, double price) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.achievments = achievments;
		this.positiveRatings = positiveRatings;
		this.negativeRatings = negativeRatings;
		this.averagePlaytime = averagePlaytime;
		this.medianPlaytime = medianPlaytime;
		this.owners = owners;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
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


	public String getOwners() {
		return owners;
	}


	public void setOwners(String owners) {
		this.owners = owners;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	
	

}
