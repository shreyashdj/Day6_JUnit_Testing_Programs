package com.bridgelabz.day6JUnitTestingPrograms;

import java.util.Scanner;

public class TemperaturConversion {

	public static void main(String[] args) {

		double tempC, tempF, choose;
		
		Scanner scan = new Scanner(System.in);

		System.out.println(" 1) Celsius to Fahrenheit \n 2) Fahrenheit to Celsius");
		
		System.out.print("Enter no. 1/2 to choose conversion : ");
		choose = scan.nextInt();
		
		while(choose<1||choose>2) {
			System.out.print("Enter no. 1/2 to choose conversion : ");
			choose = scan.nextInt();

		}
		if (choose==1) {
			System.out.print("\nEnter temperature in celsius : ");
			tempC = scan.nextInt();
			
			tempF = (tempC * 9/5) + 32;
			
			System.out.printf("%.2f degree Celsius = %.2f degree Fahrenheit", tempC, tempF);
		}
		else {
			System.out.print("\nEnter temperature in Fahrenheit : ");
			tempF = scan.nextInt();
			
			tempC = (tempF - 32) * 5/9 ;
			
			System.out.printf("%.2f degree Fahrenheit = %.2f degree Celsius", tempF, tempC);
		}
		

scan.close();
	}
}