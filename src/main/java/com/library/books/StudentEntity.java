package com.library.books;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_entity")
public class StudentEntity {
	@Id
	int id;
	String book_Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_Name() {
		return book_Name;
	}
	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}
	public StudentEntity(int id, String book_Name) {
		super();
		this.id = id;
		this.book_Name = book_Name;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", book_Name=" + book_Name + "]";
	}
	
	public StudentEntity() {
		
	}

}
