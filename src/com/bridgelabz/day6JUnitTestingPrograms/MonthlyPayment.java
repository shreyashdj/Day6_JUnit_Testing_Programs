package com.bridgelabz.day6JUnitTestingPrograms;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {

		double Y, P, R, n, r, payment;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Principal loan amount : ");
		P = scan.nextDouble();
		
		System.out.print("Enter interest rate percent : ");
		R = scan.nextDouble();
		
		System.out.print("Enter no. of years : ");
		Y = scan.nextDouble();
		
		n = 12*Y;
		r = R/1200;
		
		payment = (P*r)/(1-Math.pow((1+r),-n));

		System.out.printf("\nMonthly payments = %.2f", payment);
		
scan.close();
	}
}