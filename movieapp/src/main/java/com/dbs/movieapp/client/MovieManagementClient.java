package com.dbs.movieapp.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbs.movieapp.contoller.MovieController;
import com.dbs.movieapp.model.Movie;

public class MovieManagementClient {
	
	 private static  MovieController movieController;

	    public static void main(String[] args) {
	        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
	        movieController = applicationContext.getBean(MovieController.class);
	        saveEmployees();
	       // listAllEmployees();
	        //fetchEmployeeDetailsById(12);
	    }

	    private static void fetchEmployeeDetailsById(int i) {
	        System.out.println("Employee with id "+i +" is " +movieController.findById(i));
	    }

	    private static void listAllEmployees() {
	    	movieController.listAll().forEach(System.out::println);
	    }



	    private static void saveEmployees(){
	        Movie movie = new Movie(1,"avengers","x",3);
	        movieController.saveMovie(movie);
	        movie = new Movie(2,"aveb","ne",4);
	        movieController.saveMovie(movie);
	        
	    }

}
