package com.flexon.coreJava;

public class BankAPP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BankAccount jay = new BankAccount(123456789, 50.0, "Jay", "zijianren0918@gmail.com", "6318205239");
	}

}

class BankAccount{
	int accountNumber;
	double balance;
	String customerName;
	String email;
	String phoneNumber;
	public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void deposit(double funds) {
		this.balance = this.balance + funds;
		System.out.println("Operation succeed");
		System.out.println("Your balance is $" + this.balance);
		return;
	}
	
	public void withdraw(double funds) {
		if (funds <= this.balance) {
			this.balance = this.balance - funds;
			System.out.println("Operation succeed");
			System.out.println("Your balance is $" + this.balance);
		} else {
			System.out.println("Operation failed");
			System.out.println("Your balance is $" + this.balance);
		}
		return;
	}
	
	public void printInformation() {
		System.out.println(this.customerName);
		System.out.println(this.accountNumber);
		System.out.println(this.balance);
		System.out.println(this.email);
		System.out.println(this.phoneNumber);
		return;
	}
}