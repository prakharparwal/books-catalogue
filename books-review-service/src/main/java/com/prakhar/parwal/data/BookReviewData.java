package com.prakhar.parwal.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOK_REVIEW_DATA")
public class BookReviewData {

	@Id
	@Column(name="BOOK_ID")
	private int bookId;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="RATING")
	private int rating;
	
	@Column(name="COMMENTS")
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
