package com.prakhar.parwal.data;

public class UserReviewData {

	private int userId;
	private int rating;
	private String comment;
	
	public UserReviewData(int userId, int rating, String comment) {
		super();
		this.userId = userId;
		this.rating = rating;
		this.comment = comment;
	}

	public int getUserId() {
		return this.userId;
	}
	
	public void setUserId() {
		this.userId = userId;
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "UserReviewData [userId=" + userId + ", rating=" + rating + ", comment=" + comment + "]";
	}
	
}
