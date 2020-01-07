package com.prakhar.parwal.data;

public class BookReviewData {

	private int bookId;
	private int userId;
	private int rating;
	private String comment;
	
	public BookReviewData() {
		super();
	}
	
	public BookReviewData(int bookId, int userId, int rating, String comment) {
		super();
		this.bookId = bookId;
		this.userId = userId;
		this.rating = rating;
		this.comment = comment;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
		return "BookReviewData [bookId=" + bookId + ", userId=" + userId + ", rating=" + rating + ", comment=" + comment
				+ "]";
	}
	
	
}
