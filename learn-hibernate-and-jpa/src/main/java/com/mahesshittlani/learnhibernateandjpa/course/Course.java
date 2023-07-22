package com.mahesshittlani.learnhibernateandjpa.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "courses")
public class Course {
	@Id
	private int id;
	private String title;
	private String author;
	
	public Course() {
		
	}
	
	public Course(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
}
