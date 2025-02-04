package com.fezda.javanotes;

import java.io.IOException;
import java.util.Scanner;

public class L3Intermediate {
	
	public static void main (String [] args) {
		advancedMath();
		stringFormatting();
		
		//input();					// Only run this if ready to type into console to end it
	}
	
	
	public static void advancedMath () {
		
		double num2;
		num2 = Math.sqrt(4);		// Square root 
		num2 = Math.pow(4,3);		// Exponent (e.g. 4 to the power of 3)
		
		
		// Rounding
		num2 = Math.round(3.123);	// Rounds to the nearest whole number (e.g. 3)
		num2 = Math.floor(3.123);	// Rounds down (e.g. 3)
		num2 = Math.ceil(3.123);	// Rounds up (e.g. 4)
		
		
		// Trig
		num2 = Math.PI;						// Pi: 3.14159...
		
		num2 = Math.toRadians(90);			// Converts from degrees to radians, (e.g. 1.571)
		num2 = Math.toDegrees(Math.PI/2);	// Converts from radians to degrees, (e.g. 90)

		num2 = Math.sin(Math.PI/4);			// Calculates the sine of an angle in radians (e.g. 0.707)
		num2 = Math.cos(Math.PI/4);			// Cosine
		num2 = Math.tan(Math.PI/4);			// Tangent

		num2 = Math.asin(1/2);				// Calculates the arc sine, giving the angle in radians (e.g. 0.524)
		num2 = Math.acos(1/2);				// Arc cosine
		num2 = Math.atan(1/2);				// Arc tangent

		num2 = Math.hypot(1,2);				// Calculates hypotenuse length, given length of other legs of right triangle
		
		
		// Logarithms
		num2 = Math.E;				// Euler's number, e: 2.718...
		num2 = Math.log(Math.E);	// Natural log (e.g. 1)
		num2 = Math.log10(100);		// Log base 10 (e.g. 2)
		
		
		// Other
		num2 = Math.max(209,123);	// Gets the greatest of two numbers (e.g. 209)
		num2 = Math.min(209,123);	// Gets the least of two numbers (e.g. 123)
		num2 = Math.random();		// Generates a random number between 0 and 1, including 0
	}
	

	public static void stringFormatting () {
		System.out.println(String.format("%.2f", 12f) );					// Display numbers with specified decimal precision
		
		System.out.print(String.format("%-23s", "blah blah blah") );		// Set minimum display length (add spaces after if too short)
		System.out.println(".");
		
		System.out.println(String.format("%.8s", "blah blah blah") );		// Set max display length (shorten if too long)
		
		System.out.print(String.format("%-3.8s", "blah blah blah") );		// Set max and min line length
		System.out.println(".");
	}

	
	
	public static void input () {
		Scanner myInReader = new Scanner (System.in);		// Initialize a scanner (import java.util.Scanner near top of file, above class)
		
		System.out.println("Type in text: ");				// Display a prompt
		String myTypedContent = myInReader.nextLine();		// Receive input typed into console before pressing Enter/Return key
		
		System.out.println("Type a number: ");
		int myTypedValue = myInReader.nextInt();			// Receives the next integer typed before pressing Enter
		
		System.out.println("You typed \"" + myTypedContent + "\"and " + myTypedValue);
	}
	
	
}
