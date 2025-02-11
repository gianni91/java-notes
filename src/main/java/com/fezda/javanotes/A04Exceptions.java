package com.fezda.javanotes;

import java.io.IOException;

public class A04Exceptions {

	public static void main (String[] args) {
		
		/*********************************************************************************
		 * Handling code that could throw an exception
		 *********************************************************************************/
		try {									// Must use a 'try block' when calling a 
			funcThatThrows(3);					//	 function that could throw an exception
		}
		catch (Exception e) {					// Use a 'catch block' for handling an exception
			
			// Code to be executed if Exception is thrown
			
			e.printStackTrace();				// This will show the failed line of code and 
												// 	a chain of function calls 
		}
		
		
		
		/*********************************************************************************
		 * Handling code that could throw one of multiple types of exceptions
		 *********************************************************************************/
		try {
			funcThatThrowsMultExceptions(65);
		}
		catch (IllegalArgumentException myIAException) {
			// Code to respond if it fails
		}
		catch (IOException myException) {
			// Code to respond if it fails
		}
		
		
		/*********************************************************************************
		 * Finally block
		 *********************************************************************************/
		try {	 
			funcThatThrows(3);
		}
		catch (Exception e) {
		}
		finally {
			// Code to be run, whether it is successful or not
		}
	}
	
	
	public static void funcThatThrows (int x) throws Exception {	// Indicate throw at top
		if (  x < 12  ) {
			throw new Exception ("Error, blah");					// Put throw (or throwable func) in code
		}
	}
	
	
	public static void funcThatThrowsMultExceptions (int x) throws IllegalArgumentException, IOException {
		if (  x < 12  ) {
			throw new IllegalArgumentException ("Error, x < 12");
		}
		else if (  x > 21  ) {
			throw new IOException ("Error x > 21");
		}

	}
	
	
}


