package psteam;

import java.sql.Date;

public class Game {
	
	private String name;
	private String releaseDate;
	private String achievments;
	private String positiveRatings;
	private String negativeRatings;
	private String averagePlaytime;
	private String medianPlaytime;
	private String owners;
	private String price;
	
	
	public Game(String name, String releaseDate, String achievments, String positiveRatings, String negativeRatings,
			String averagePlaytime, String medianPlaytime, String owners, String price) {
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


	public String getAchievments() {
		return achievments;
	}


	public void setAchievments(String achievments) {
		this.achievments = achievments;
	}


	public String getPositiveRatings() {
		return positiveRatings;
	}


	public void setPositiveRatings(String positiveRatings) {
		this.positiveRatings = positiveRatings;
	}


	public String getNegativeRatings() {
		return negativeRatings;
	}


	public void setNegativeRatings(String negativeRatings) {
		this.negativeRatings = negativeRatings;
	}


	public String getAveragePlaytime() {
		return averagePlaytime;
	}


	public void setAveragePlaytime(String averagePlaytime) {
		this.averagePlaytime = averagePlaytime;
	}


	public String getMedianPlaytime() {
		return medianPlaytime;
	}


	public void setMedianPlaytime(String medianPlaytime) {
		this.medianPlaytime = medianPlaytime;
	}


	public String getOwners() {
		return owners;
	}


	public void setOwners(String owners) {
		this.owners = owners;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
