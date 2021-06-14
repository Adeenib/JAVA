package com.bankaccount;
import java.util.Random;
public class BankAccount {
	private String accountNumber;
	private double checkingBalance=0;
	private double savingsBalance=0;
	static Integer numberOfAccount=0;
	static double amountOfMoney=0;
	public  void bankAccount() {
		setAccountNamber();
		numberOfAccount++;
		
	}
	private void setAccountNamber() {
		Random r=new Random();
		this.accountNumber+=r.nextInt(10);
		
		
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void deposit(String account,double mony) {
		if(mony>0) {	
			if(account=="checking") {
				this.checkingBalance+=mony;
			}
			else if(account=="saving") {
				this.savingsBalance+=mony;
			}
			BankAccount.amountOfMoney +=mony;
			
		}
		else{
			System.out.println("your deposit should be more than Zero");
		}
	}
	public void withDraw(String account,double mony) {
		if(mony>0) {	
			if(account=="checking") {
				if(mony<=this.checkingBalance) {
					this.checkingBalance-=mony;
					BankAccount.amountOfMoney -=mony;
				}else {
					System.out.println("No enough Balance");
					
				}
			}
			else if(account=="saving") {
				if(mony<=this.savingsBalance) {
					this.savingsBalance-=mony;
					BankAccount.amountOfMoney -=mony;
				}else {
					System.out.println("No enough Balance");
				}
			}
			
			
		}
		
	}
	public void totalMoney() {
		System.out.print("the Totale Amonte in Your Account :");
		System.out.println(this.savingsBalance+this.checkingBalance);
		
	}
}
