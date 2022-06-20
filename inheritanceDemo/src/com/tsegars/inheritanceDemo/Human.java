package com.tsegars.inheritanceDemo;

public class Human {
// Member Variables
	protected String name;
	protected int strength;
	protected int health;
	protected int intelelligence;
//	constructor methods
	public Human(String name, int strength, int intelelligence) {
		super();
		this.name = name;
		this.strength = strength;
		this.intelelligence = intelelligence;
	}
public Human() {
	super();
}

// getter/ setters
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStrength() {
	return strength;
}
public void setStrength(int strength) {
	this.strength = strength;
}
public int getIntelelligence() {
	return intelelligence;
}
public void setIntelelligence(int intelelligence) {
	this.intelelligence = intelelligence;
}
	
	
	
}
