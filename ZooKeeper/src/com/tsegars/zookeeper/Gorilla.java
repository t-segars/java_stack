package com.tsegars.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("Threw a banana peel; energy went down. Energy level now:"+ energyLevel);
	}
	
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("Ate a banana; energy went up. Energy level now:"+ energyLevel);
	}
	
	public void climb() {
		energyLevel -= 10;
		System.out.println("Climbed a tree energy went down. Energy level now:" + energyLevel);
	}
	
}