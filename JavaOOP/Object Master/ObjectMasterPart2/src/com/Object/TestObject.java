package com.Object;

public class TestObject {
	public static void main(String[] args) {
		ObjectMaster Human1= new ObjectMaster();
		ObjectMaster Human2= new ObjectMaster();
		Human1.attack(Human2);
		Human1.attack(Human2);
		Ninja n1=new Ninja();
		n1.runAway();
		System.out.print(Human2.health);
		n1.steal(Human2);
		System.out.print(Human2.health);
		
		
	}
}
