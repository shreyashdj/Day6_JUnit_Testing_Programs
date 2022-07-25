package com.bridgelabz.day6JUnitTestingPrograms;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the amount : Rs.");
		int money = scan.nextInt();
		
		int [] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
		int [] returnNotes = new int[notes.length];
		
		/*
		 * 		Distribution of amount in minimum notes
		 * 		& calculating minimum no. of notes required
		 */
		
		int minNotes = 0;
		for (int i=0; i<notes.length; i++) {
			returnNotes[i] = money/notes[i];
			money = money%notes[i];
			minNotes += returnNotes[i];
		}
		
		System.out.println("\n Minimum notes required to return = " +minNotes);
		
		System.out.println("\n Notes distribution :\n");
		for (int i=0; i<notes.length; i++) {
			System.out.println(" Rs."+ notes[i] +"  notes = " +returnNotes[i]);
		}
	
scan.close();
	}
}