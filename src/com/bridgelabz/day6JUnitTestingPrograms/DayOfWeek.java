package com.bridgelabz.day6JUnitTestingPrograms;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		int y0, m0, d0, x ;
				
		String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Satureday"};
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Date : ");
		int d = scan.nextInt();
		
		System.out.print("Enter the Month : ");
		int m = scan.nextInt();
		
		System.out.print("Enter the Year : ");
		int y = scan.nextInt();

		y0 = y-(14-m)/12;
				
		x = y0+y0/4-y0/100+y0/400;

		m0 = m+12*((14-m)/12)-2;

		d0 = (d+x+31*m0/12)%7;
			
		System.out.print("\nDay on "+d +"/" +m +"/" +y +" is : " +day[d0]);
			
scan.close();
	}
}