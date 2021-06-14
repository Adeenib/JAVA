package com.phone;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		String r="Iphon ";
		r+=this.getVersionNumber();
		r+=" says ";
		r+=this.getRingTone();
		
				
		return r ;
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via facil recognition";
	}

	@Override
	public void displayInfo() {
		String v=this.getVersionNumber();
		String c=this.getCarrier();
		System.out.println("Iphone "+v+" from "+c);
		
	}

}
