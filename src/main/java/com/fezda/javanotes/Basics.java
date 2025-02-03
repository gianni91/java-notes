package com.fezda.javanotes;

public class Basics {
	
	public static void main (String [] args) {
		basic();
		variables();
		display();
		conditionals();
		loops();
	}
	
	public static void basic () {
		System.out.println("Hello world");
	}
	
	public static void variables () {
		int myVar;				// Declare variable: specify name and type without a value
		myVar = 3;				// Initialize the variable: give it a first value
		myVar = 4;				// Assign a value: changes value
		
		int myVar2 = 12;		// Can declare and initialize in same line;
		
		// Basic Data Types
		int myInt = 12;			// Range from -2147483648 to 2147483647, no decimals
		float myFloat = 1.2f;	// Numbers with decimal ('f' distinguishes from double)
		char myChar = 'q';		// Stores a character (letter/symbol/number)
		boolean myBool = true;	// Stores true/false or result of condition. Doesn't recognize 1 or number as true
		
		
		// Data Types for better size/precision/space
		long myLong = 12L;		// Large whole numbers (from -9223372036854775808 to 9223372036854775807)
		double myDouble = 1.2;	// More precise numbers with decimal
		byte myByte = 12;		// Uses least space for numbers (8 bits). Ranges from -128 to 128
		short myShort = 138;	// Balance between less space (2 bytes) and useful range (-32768 to 32767)
		
	}
	
	public static void display () {
		System.out.println("Words 123 @$%#.,");				// Print words, numbers, and symbols on a line
		
		System.out.println("Hello \t World \n Testing");	// \t is tab,  \n is new line
		
		System.out.print("my text");		// Display text on its own line
		System.out.println();				// Empty line
		
		System.out.println(123);		// Display number
		System.out.println(123 + 123);	// Display result of math
		System.out.println(2 + "" + 1);	// Display numbers without adding values
		
		int num = 34;
		System.out.println(num);		// Display variables
		
		System.out.println("txt " + 12 + " " + num + " " + (12 + 34));		// Display various
		
		System.out.println(String.format("%.2f", 12f) );					// Display numbers with specified decimal precision
		
		System.out.print(String.format("%-23s", "blah blah blah") );		// Set minimum display length (add spaces after if too short)
		System.out.println(".");
		
		System.out.println(String.format("%.8s", "blah blah blah") );		// Set max display length (shorten if too long)
		
		System.out.print(String.format("%-3.8s", "blah blah blah") );		// Set max and min line length
		System.out.println(".");
		
	}
	
	public static void conditionals () {
		int x = 12;
		if (x < 12) {
			// Do stuff
		} else if (x > 1 ) {
			// Do stuff
		}
		else {
			// Do stuff
		}
	}
	
	public static void loops() {
		
		boolean condition = true;
		while (condition) {
			// Do stuff until condition not met
			condition = false;
		}
		
		int x = 0;
		do {
			// Do stuff at least once
			x++;
		} 
		while (x < 10);
		
		for (int i = 0; i < 12; i++) {
			// Do stuff i times
		}
		
		int[] myArray = {1,2,3,4};
		for (int myArrayItem : myArray) {
			// do stuff with each value in array, referred to here as myArrayItem
		}
	}
	
}
