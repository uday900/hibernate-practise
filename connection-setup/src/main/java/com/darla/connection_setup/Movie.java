package com.darla.connection_setup;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	private int id;
	private String name;
	private String director;
	private int release_year;
	
	public Movie() {}
	public Movie(int id, String name, String director, int release_year) {
		super();
		this.id = id;
		this.name = name;
		this.director = director;
		this.release_year = release_year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}

	

}
