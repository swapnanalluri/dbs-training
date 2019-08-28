package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Builder;

@Entity
@Data
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empid;

	@NotBlank(message = "Name cannot be null")
	private String username;
	private String password;

	/*
	 * @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch =
	 * FetchType.LAZY) private Set<Customer> tweets = new HashSet<>();
	 */

	public Bank() {
	}

	public Bank(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/*
	 * public void addTweets(Tweet tweet) { this.tweets.add(tweet);
	 * tweet.setUser(this); }
	 */

}
