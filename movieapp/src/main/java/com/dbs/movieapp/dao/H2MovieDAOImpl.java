package com.dbs.movieapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dbs.movieapp.model.Movie;

public class H2MovieDAOImpl implements MovieDAO{
	
	 private JdbcTemplate jdbcTemplate;

	    @Autowired
	    public H2MovieDAOImpl(JdbcTemplate jdbcTemplate){
	        this.jdbcTemplate = jdbcTemplate;
	    }

	    @Override
	    public Movie save(Movie movie) {
	        this.jdbcTemplate.execute("insert into movies values "
	        		+ "('"+movie.getId()+"','"+movie.getName()+"','"+
	        		movie.getDirector()+"','"+movie.getRating()+"')");
	        return movie;
	    }

	    @Override
	    public Movie update(long movId, Movie movie) {
	        return null;
	    }

	    @Override
	    public List<Movie> findAll() {
	        return null;
	    }

	    @Override
	    public Movie findById(long id) {
	        return null;
	    }

	    @Override
	    public void deleteMovie(long id) {

	    }

		
	    

}
