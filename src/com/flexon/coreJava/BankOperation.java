package com.flexon.coreJava;

import java.util.Scanner;

public class BankOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount jay = new BankAccount(123456789, 50.0, "zijian ren", "zijianren0918@gmail.com", "6318205239");
		
		while (true) {
			System.out.println("Please select your operation: 1. check your balance 2. deposit money "
					+ "3. withdraw money 4. print your information 5. exit");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			if (input == 1) {
				System.out.println("Your balance is $" + jay.balance);
			} else if (input == 2) {
				System.out.println("Please insert the amount of money you want to deposit:");
				Scanner deposit = new Scanner(System.in);
				double depositMoney = deposit.nextDouble();
				System.out.println("You have deposited $" + depositMoney);	
				jay.deposit(depositMoney);
			} else if (input == 3) {
				System.out.println("Please insert the amount of money you want to withdraw:");
				Scanner withdraw = new Scanner(System.in);
				double withdrawMoney = withdraw.nextDouble();
				System.out.println("The money you want to withdraw is $" + withdrawMoney);
				jay.withdraw(withdrawMoney);
			} else if (input == 4) {
				jay.printInformation();
			} else {
				System.out.println("Thank you!");
				break;
			}
			
		}
		return;		
	}


}
