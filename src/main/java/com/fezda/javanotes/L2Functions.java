package com.fezda.javanotes;

public class L2Functions {
	public static void main (String [] args) {
		basicFunction();				// This runs a block of code defined below, named basicFunction
										// 		running a function this way is known as a function "call"
		
		parameterFunction(3);			// This calls a function below named parameterFunction
										//		providing a value for it to use
		
		multParamFunction(3,5,"hi");	// L2Functions can have multiple parameters, separated by commas
		
		int num = returnFunction();		// When a functions returns a value, it will replace the function call 
										//		with the value it returns
		
	}
	
	public static void basicFunction () {		// basicFunction is the name of this function, call/run it with "basicFunction()"
		System.out.println("testing");			// Any code between the parenthesis will be run when called
	}
	
	public static void parameterFunction (int myIntParam) {		// In parenthesis, specify the type of parameter, followed by the name
		System.out.println(myIntParam);
	}
	
	public static void multParamFunction (int num1, int num2, String word) {
		System.out.println(num1 + num2);
		System.out.println(word);
	}
	
	public static int returnFunction () {	// Replace "void" with a data type that will be returned (e.g. "int")
		return 12;							// This value (12) will be given when the function is called by name "returnFunction()"
	}

}
