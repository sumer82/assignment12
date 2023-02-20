package org.antwalk.model;

public class Movie
{
	private String title;
	private int releaseYear;
	private String ratings;
	private int duration;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Movie(String title, int releaseYear, String ratings, int duration) {
		super();
		this.title = title;
		this.releaseYear = releaseYear;
		this.ratings = ratings;
		this.duration = duration;
	}
	public Movie() {
		super();
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", releaseYear=" + releaseYear + ", ratings=" + ratings + ", duration="
				+ duration + "]";
	}


}
