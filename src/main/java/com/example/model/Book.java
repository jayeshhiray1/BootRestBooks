package com.example.model;

public class Book {
	
	private int id;
	private String title;
	private String auther;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String title, String auther) {
		super();
		this.id = id;
		this.title = title;
		this.auther = auther;
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
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	

}
