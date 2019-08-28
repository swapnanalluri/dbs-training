package com.dbs.movieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dbs.movieapp.dao.MovieDAO;
import com.dbs.movieapp.model.Movie;

public class MovieServiceImpl implements MovieService{
	
	private MovieDAO movieDAO;

    @Autowired
    public MovieServiceImpl(@Qualifier("h2Dao") MovieDAO movieDAO){
        this.movieDAO = movieDAO;
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieDAO.save(movie);
    }

    @Override
    public List<Movie> listAll() {
        return this.movieDAO.findAll();
    }

    @Override
    public Movie findById(long movId)  {
        return this.movieDAO.findById(movId);
    }

    @Override
    public void deleteMovie(long movId) {
        this.movieDAO.deleteMovie(movId);
    }

}
