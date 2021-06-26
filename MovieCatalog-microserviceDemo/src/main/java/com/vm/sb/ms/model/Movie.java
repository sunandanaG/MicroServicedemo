package com.vm.sb.ms.model;

public class Movie {
	private String MovieId;
	private String MovieName;
	public Movie(String movieId, String movieName) {
		super();
		MovieId = movieId;
		MovieName = movieName;
	}
	public String getMovieId() {
		return MovieId;
	}
	public void setMovieId(String movieId) {
		MovieId = movieId;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	

}
