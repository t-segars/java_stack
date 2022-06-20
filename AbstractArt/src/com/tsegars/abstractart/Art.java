package com.tsegars.abstractart;

public abstract class Art {
	String title;
	String author;
	String description;
//	constructor methods
	
	
public Art(String title, String author, String description) {
	super();
	this.title = title;
	this.author = author;
	this.description = description;
	}

public Art() {
	super();
}
//	getters 

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
	
	
	
	
	
	
}
