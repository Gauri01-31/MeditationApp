package com.user.model;

public class User {
	
	private int id;
	private String uname;
	private String email;
	private String country;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String uname, String email, String country, String password) {
		super();
		this.id = id;
		this.uname = uname;
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
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
		return "User [id=" + id + ", uname=" + uname + ", email=" + email + ", country=" + country + ", password="
				+ password + "]";
	}
	
	

}
