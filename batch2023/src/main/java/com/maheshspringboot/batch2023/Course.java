package com.maheshspringboot.batch2023;

public class Course {
	private int id;
	private String title;
	private String trainer;
	
	
	public Course(int id, String title, String trainer) {
		super();
		this.id = id;
		this.title = title;
		this.trainer = trainer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
}
