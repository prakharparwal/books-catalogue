package com.prakhar.parwal.data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "USER_CREDENTIAL_ID")
	private UserCredentials userCredential;
	
	public User() {
		super();
	}
	
	public User(int id, String name, UserCredentials userCredential) {
		super();
		this.id = id;
		this.name = name;
		this.userCredential = userCredential;
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

	public UserCredentials getUserCredential() {
		return userCredential;
	}

	public void setUserCredential(UserCredentials userCredential) {
		this.userCredential = userCredential;
	}
	
}
