package com.dbs.movieapp.model;

import java.io.Serializable;
import java.util.Objects;

public class Movie implements Serializable, Comparable<Movie>{
	
	private long id;
	private String name;
	private String director;
	private int rating;
	
	
	public Movie(long id, String name, String director) {
        this.id = id;
        this.name = name;
        this.director = director;
    }
    
    public Movie(long id, String name, String director, int rating) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.rating=rating;
    }


    public long getId() {
        return id;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id &&
                Objects.equals(name, movie.name) &&
                Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, director);
    }


    @Override
    public int compareTo(Movie movie) {
        return (int)(this.id - movie.id);
    }

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", director=" + director + ", rating=" + rating + "]";
	}
	
	

}
