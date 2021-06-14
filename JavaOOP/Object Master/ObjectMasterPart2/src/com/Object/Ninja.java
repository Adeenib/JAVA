package com.Object;

public class Ninja extends ObjectMaster{
	
	int stealth=10;
	public void steal(ObjectMaster Human) {
		if(Human.health<11) {
			Human.health=0;
			
		}else {
			Human.health-=this.stealth;
		}
	
			this.health+=this.stealth;
		
		
	}
	public void runAway() {
		if(this.health>=10) {
			System.out.print("you will lose you life");
			
		}else {
			this.health-=10;
		}
	}
	

}
