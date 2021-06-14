package com.Object;

public class ObjectMaster {
	int strength=3;
	int stealth=3;
	int intelligence=3;
	int health=100;
	public  void attack(ObjectMaster Human) {
		Human.health -= this.strength;
		System.out.println(Human.health);
	}
}
