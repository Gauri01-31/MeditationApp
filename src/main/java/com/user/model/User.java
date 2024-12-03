package com.user.model;

public class User {
	
	private int id;
	private String username;
	private String email;
	private String country;
	private String password;
	public User(){
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String username, String email, String country, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.country = country;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", country=" + country + ", password="
				+ password + "]";
	}
	
	

}
