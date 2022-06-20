package com.tsegars.zookeeper;
    
public class Bat extends Mammal {
	int energyLevel = 300;
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("flap flap; flying lowers health. Health Now:" + energyLevel);
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("one less human on the planet....Health Now:" + energyLevel);
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("one less town on the planet.... Health Now" + energyLevel);
	}
	 	
}

