package com.flexon.coreJava;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double input = 20;
		FirstProgram res = new FirstProgram();
	//	System.out.println(res.convert(input));
		char fruit = 'A';
		switch(fruit) {
		case 'A':
			System.out.println("apple");
			break;
		case 'B':
			System.out.println("banana");
			break;
		case 'C':
			System.out.println("cherries");
			break;
		case 'D':
			System.out.println("dragon fruit");
			break;
		case 'E':
			System.out.println("ElderBerry");
			break;
		default:
			System.out.println("not in fruit basket");
			break;
		}
		
	}
	
	public double convert(double input) {
		return input * 0.4535;
	}
	
 
}

