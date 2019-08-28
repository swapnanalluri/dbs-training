package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Tweet;
import com.example.demo.model.Users;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
	
	Optional<Users> findByMessage(String message);
	Optional<Users> findByMediaUrls(List<String> urls);
	
    List<Tweet> findAll();

}
