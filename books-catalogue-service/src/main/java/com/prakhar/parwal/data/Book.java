package com.prakhar.parwal.data;

import java.util.List;
import java.util.Map;

public class Book {

	private int id;
	private String name;
	private String authorName;
	private String description;
	private List<UserReviewData> userReviewData;
	
	public Book() {
		super();
	}
	
	public Book(int id, String name, String authorName, String description, List<UserReviewData> userReviewData) {
		super();
		this.id = id;
		this.name = name;
		this.authorName = authorName;
		this.description = description;
		this.userReviewData = userReviewData;
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

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public List<UserReviewData> getUserReviewData() {
		return userReviewData;
	}

	public void setUserReviewData(List<UserReviewData> userReviewData) {
		this.userReviewData = userReviewData;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authorName=" + authorName + ", description=" + description
				+ ", userReviewData=" + userReviewData + "]";
	}
	
}
