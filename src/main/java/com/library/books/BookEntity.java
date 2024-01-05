package com.library.books;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book_entity")
public class BookEntity {
	@Id
	String book_name;
	int book_id;
	int book_count;
	String book_author;
	
	public BookEntity() {}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getBook_count() {
		return book_count;
	}
	public void setBook_count(int book_count) {
		this.book_count = book_count;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public BookEntity(int book_id, int book_count, String book_name, String book_author) {
		super();
		this.book_id = book_id;
		this.book_count = book_count;
		this.book_name = book_name;
		this.book_author = book_author;
	}
	@Override
	public String toString() {
		return "BookEntity [book_id=" + book_id + ", book_count=" + book_count + ", book_name=" + book_name
				+ ", book_author=" + book_author + "]";
	}
	
	
	

}
