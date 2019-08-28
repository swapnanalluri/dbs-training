package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {

	@Id
	private String email;
	private String fname;
	private String lname;
	private int phn;
	
	List<String> emails= new ArrayList<String>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setEmails(String email) {
		emails.add(email);
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getPhn() {
		return phn;
	}

	public void setPhn(int phn) {
		this.phn = phn;
	}

}
