package com.calculater;

public class Calculater {
	private static double OperandOne;
	private static double OperandTwo;
	private static double Results;
	private static String Operation;
	
	public  void calculater() {
		
	}
	public static void performOperation() {
		if(getOperation()=="+")
			Results=(OperandOne+OperandTwo);
		else if (getOperation()=="-")
			Results=(OperandOne-OperandTwo);
	}

	public static String getOperation() {
		return Operation;
	}


	public static double getResults() {
		return Results;
	}

	public static void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}

	public static void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}

	public static void setOperation(String operation) {
		Operation = operation;
	}
	

}
