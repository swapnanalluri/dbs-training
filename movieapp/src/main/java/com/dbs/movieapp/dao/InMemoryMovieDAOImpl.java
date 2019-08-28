package com.dbs.movieapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.dbs.movieapp.model.Movie;


public class InMemoryMovieDAOImpl implements MovieDAO{
	
	private static final List<Movie> movList = new ArrayList<>();

    @Override
    public Movie save(Movie movie) {
        movList.add(movie);
        System.out.println("Saved the Movies in the in Memory list "+movie);
        return movie;
    }

    @Override
    public Movie update(long movId, Movie movie) {
        Optional<Movie> optionalMov = movList.stream().filter(mov -> mov.getId() == movId).findFirst();
        optionalMov.ifPresent(employee1 -> movList.add(movList.indexOf(movie), movie));
        return movie;
    }

    @Override
    public List<Movie> findAll() {
        return movList;
    }

    @Override
    public Movie findById(long id) {
        Optional<Movie> optionalMovie =movList.stream().filter(movie -> movie.getId() == id).findFirst();
        if(optionalMovie.isPresent()){
            return optionalMovie.get();
        }
        return null;
    }

    @Override
    public void deleteMovie(long id) {
       movList.removeIf(movie -> movie.getId() == id);
    }

}
