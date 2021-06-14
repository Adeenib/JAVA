package com.calculater;

public class CalculaterTest {
	public static void main(String[] args) {
		Calculater.setOperandOne(10.5);
		Calculater.setOperation("+");
		Calculater.setOperandTwo(5.2);
		Calculater.performOperation();
		System.out.println(Calculater.getResults());
		
		
	}

}
