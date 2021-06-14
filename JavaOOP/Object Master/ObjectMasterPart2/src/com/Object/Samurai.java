package com.Object;

public class Samurai extends ObjectMaster {
	static int countSamuri=0;
	int health=200;
	 public Samurai(){
		 countSamuri++;
	    }
	public void deathBlow(ObjectMaster Human) {
		this.health+=(Human.health/2);
		Human=null;
	}
	public void meditate() {
		this.health+=(this.health/2);
	}
	public int howMany() {
		return countSamuri;
	}
}
