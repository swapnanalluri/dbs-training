package com.example.demo.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Builder;


@Entity
@Table
@Data
public class Users {

    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private long id;

    @NotBlank(message = "Name cannot be null")
    @Column(name="user_name",nullable=false)
    private String name;
    private String password;

    private String email;
    private String city;
    private String street;
    private String state;
    private int pin;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Tweet> tweets = new HashSet<>();
    
    public Users(){}
   
    public Users(long id, String name,String password,String email,String city,String street,String state,int pin){
        this.id = id;
        this.name = name;
        this.password=password;
        this.city=city;
        this.email=email;
        this.street=street;
        this.state=state;
        this.pin=pin;
    }
 
    
    public void addTweets(Tweet tweet) {
    	this.tweets.add(tweet);
    	tweet.setUser(this);
    }

  
}