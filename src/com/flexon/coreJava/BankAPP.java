package com.flexon.coreJava;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

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
	double remainingDepositAmount = 1500;
	double remainingWithdrawAmount = 1000;
	int remainingDepositNumber = 3;
	LocalDate date = LocalDate.now();
	ArrayList<String> history = new ArrayList<>();
	public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void deposit(double funds) {
		getDate();
		if (funds < 50 || funds > 500) {
			System.out.println("Operation failed");
			System.out.println("Each deposit should be greater than (including) $ 50 and less than (including) $500");
			return;
		}
		
		if (remainingDepositNumber <= 0 || remainingDepositAmount < funds) {
			System.out.println("Operation failed");
			System.out.println("Exceed the daily deposit limit");
			return;
		}
		
		this.balance = this.balance + funds;
		remainingDepositAmount = remainingDepositAmount - funds;
		remainingDepositNumber = remainingDepositNumber - 1;
		history.add("Deposit: $" + funds);
		System.out.println("Operation succeed");
		System.out.println("You have deposited $" + funds);
		System.out.println("Your balance is $" + this.balance);
		return;
	}
	
	public void withdraw(double funds) {
		getDate();
		System.out.println("The money you want to withdraw is $" + funds);
		
		if (funds <= this.balance && remainingWithdrawAmount >= funds) {
			this.balance = this.balance - funds;
			remainingWithdrawAmount = remainingWithdrawAmount - funds;
			history.add("Withdraw: $" + funds);
			System.out.println("Operation succeed");

			System.out.println("Your balance is $" + this.balance);
			System.out.println("Your remaining withdrawal today is $" + remainingWithdrawAmount);
		} else {
			System.out.println("Operation failed");
			System.out.println("Your balance is $" + this.balance);
		}
		return;
	}
	
	public void printInformation() {
		System.out.println("Name: " + this.customerName);
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Email: " + this.email);
		System.out.println("Phone Number: " + this.phoneNumber);
		return;
	}
	
	public void showBalance() {
		System.out.println("Name: " + this.customerName);
		System.out.println("Your balance is: $" + this.balance);
		Date t = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(t));
	}
	
	private void getDate() {
		LocalDate today = LocalDate.now();
		if (!today.equals(date)) {
			remainingDepositAmount = 1500;
			remainingDepositNumber = 3;
			remainingWithdrawAmount = 1000;
			date = today;
			history = new ArrayList<>();
		}
		return;
	}
	
	public void transactionHistory() {
		for (String s : history) {
			System.out.println(s);
		}
		return;
	}
}