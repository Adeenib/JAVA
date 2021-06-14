package com.phone;

public class PhoneTest {
	
	public static void main(String[] args) {
		Galaxy s9=new Galaxy("S9",99,"Verizon","Ring Ring Ring!");
		IPhone ten=new IPhone("x",100,"AT&T","Zing");
		s9.displayInfo();
		
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		ten.displayInfo();
		System.out.println(ten.ring());
		System.out.println(ten.unlock());
	}

}
