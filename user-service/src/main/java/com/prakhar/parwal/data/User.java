package com.prakhar.parwal.data;

public class User {

	private int id;
	private String name;
	private UserCredentials userCredentials;
	
	public User() {
		super();
	}
	
	public User(int id, String name, UserCredentials userCredentials) {
		super();
		this.id = id;
		this.name = name;
		this.userCredentials = userCredentials;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}
	
}
