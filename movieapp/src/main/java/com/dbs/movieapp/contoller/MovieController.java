package com.dbs.movieapp.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbs.movieapp.model.Movie;
import com.dbs.movieapp.service.MovieService;

public class MovieController {
	
	private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    public Movie saveMovie(Movie movie){
        return this.movieService.saveMovie(movie);
    }

    public List<Movie> listAll(){
        return this.movieService.listAll();
    }

    public Movie findById(long empId){
        return this.movieService.findById(empId);
    }

    public void deleteEmployee(long empId){
        this.movieService.deleteMovie(empId);
    }

}
