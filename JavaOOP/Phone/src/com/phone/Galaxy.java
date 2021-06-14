package com.phone;

public class Galaxy extends Phone implements Ringable{

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		String r="Galaxy ";
		r+=this.getVersionNumber();
		r+=" says ";
		r+=this.getRingTone();
		
				
		return r ;
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlock via finger print";
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		String v=this.getVersionNumber();
		String c=this.getCarrier();
		System.out.println("Galaxy "+v+" from "+c);
		
	}

}
