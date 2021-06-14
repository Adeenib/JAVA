package com.Object;

public class Wizard extends ObjectMaster{
	
	int intelligence=8;
	int health=50;
	public void heal(ObjectMaster Human) {
		
			Human.health+=this.intelligence;
	
	}
	public void fireball(ObjectMaster Human) {
		if(Human.health<24) {
			Human.health=0;
		}else {
			Human.health-=(this.intelligence*3);
		}
	}

}
