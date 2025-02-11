package com.fezda.javanotes;

import java.util.Scanner;

public class A01Basics {
	
	public static void main (String [] args) {

	/*****************************************************************
	 * Basic
	 ****************************************************************/
		System.out.println("Hello world");
		
	
	/*****************************************************************
	 * Variables
	 ****************************************************************/
		int myVar;				// Declare variable: specify name and type without a value
		myVar = 3;				// Initialize the variable: give it a first value
		myVar = 4;				// Assign a value: changes value
		
		int myVar2 = 12;		// Can declare and initialize in same line;
		
		// Basic Data Types
		int myInt = 12;			// Range from -2147483648 to 2147483647, no decimals
		float myFloat = 1.2f;	// Numbers with decimal ('f' distinguishes from double)
		boolean myBool = true;	// Stores true/false or result of condition. Doesn't recognize 1 or number as true
		char myChar = 'q';		// Stores a character (letter/symbol/number)
		String myString = "";	// Stores multiple characters
		
		
		// Data Types for better size/precision/space
		long myLong = 12L;		// Large whole numbers (from -9223372036854775808 to 9223372036854775807)
		double myDouble = 1.2;	// More precise numbers with decimal
		byte myByte = 12;		// Uses least space for numbers (8 bits). Ranges from -128 to 128
		short myShort = 138;	// Balance between less space (2 bytes) and useful range (-32768 to 32767)
		
		
	/*****************************************************************
	 * Display (Console Output)
	 ****************************************************************/
		System.out.println("Words 123 @$%#.,");				// Print words, numbers, and symbols on a line
		
		System.out.println("Hello \t World \n Testing");	// \t is tab, \n is new line
		
		System.out.println("\" \\ \'");						// Other special characters (use '\' before it to "escape" teh character)
		
		System.out.print("my ");		// Display text without ending line
		System.out.print("text");
		System.out.println();			// Display an empty line
		
		System.out.println(123);		// Display number
		System.out.println(123 + 123);	// Display result of math
		System.out.println(2 + "" + 1);	// Display numbers without adding values
		
		int num = 34;
		System.out.println(num);		// Display a variable
		
		System.out.println("txt " + 12 + " " + num + " " + (12 + 34));		// Display various
		
		
	/*****************************************************************
	 * Conditionals
	 ****************************************************************/
		int x = 12;
		if (x < 12) {
			// Do stuff
		} else if (x > 1 ) {
			// Do stuff
		}
		else {
			// Do stuff
		}
		
		// Types of conditions
		boolean c;
		c = true;					
		c = !false;					// ! means "not"
		c = 3 == 3;					// == checks if values are equal
		c = 3 != 4;					// != checks if not equal
		c = 3 < 4;					// < checks if value on left is less than value on right
		c = 3 > 2;					// > checks if value on left is greater than value on right
		c = 3 <= 4;					// <= means less than or equal to
		c = 3 >= 2;					// >= means greater than or equal to
		c = !(3 == 4);				// !() will negate the value within parenthesis
		c = 3 == 9 || 3 < 7;		// || means OR, true if the conditions on EITHER side are true
		c = 3 > 2 && 3 < 5;			// && means AND, true if the conditions on BOTH sides of it are true
		
		c = 3 > 2 && (3 > 5 || 6 > 2 || 1 < 4);		// Complex combinations can be made
		
		
	/*****************************************************************
	 * Basic Math
	 ****************************************************************/
		int result;
		result = 3 + 2;				// Addition
		result = 3 - 2;				// Subtraction
		result = 3 * 2;				// Multiplication
		result = 3 / 2;				// Division
		result = 3 % 2;				// Modulus (remainder after division)
		
		
	/*****************************************************************
	 * Loops
	 ****************************************************************/
		// While Loop
		boolean condition = true;
		while (condition) {
			// Do stuff until condition not met
			condition = false;
		}
		
		// Do-while Loop
		int y = 0;
		do {
			// Do stuff at least once
			y++;
		} 
		while (y < 10);
		
		// For Loop
		for (int i = 0; i < 12; i++) {
			// Do stuff i times (can access the number as i)
		}
		
		// Also see Array Loops section
		
		
	/*****************************************************************
	 * Arrays
	 ****************************************************************/
		int [] myIntArray = {6,4,1,8,2,3};		// Create a new array with values
		System.out.println( myIntArray[0] );	// Access the first value (index 0)
		myIntArray[2] = 5 ;						// Modify the third value (index 2)
		
		int [] myIntArray2 = new int [7];		// Create a new array with 7 slots
		
		int myLength = myIntArray.length;		// Get the number of elements in array	
		
		
	/*****************************************************************
	 * Array Loops
	 ****************************************************************/
		int [] myArray = {4,7,2,5};
		
		// Loop through array
		for (int i = 0; i < 12; i++) {
			System.out.println( myArray[i] );		// Accesses elements myArray[0], then myArray[2], ...
		}
		
		// For-each loop
		for (int myArrayItem : myArray) {			// Refers to each element in the list one at a time,
			System.out.println( myArrayItem );		// 		calling it 'myArrayItem' in each case 
		}											
		
		
	/*****************************************************************
	 * Multi-Dimensional Arrays
	 ****************************************************************/
		int [][] myNumArray = {{6,5,8},{3,1,2},{9,9,3}};	// Create a new multi-dimensional array with values
		System.out.println( myNumArray[0][2] );				// Access the first array, third item
		myNumArray[1][0] = 5 ;								// Modify the second array, first item
		
		int [][] myEmptyNumArray = new int [5][];			// Creates an array of 5 arrays
		
		int muNumArrays = myNumArray.length;				// Get the number of arrays
		int myLengthOfFirst = myNumArray[0].length;			// Get the number of elements in the first array

	}
	

	

}
