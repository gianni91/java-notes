package com.fezda.javanotes;

// A class defines a new complex variable type which can have its own variables and functions to access

// Classes defined in another package must be imported, look at files in the "myclasses" package to see the classes used here 
import com.fezda.myclasses.BasicClass;
import com.fezda.myclasses.ConstructableClass;
import com.fezda.myclasses.CopyableClass;
import com.fezda.myclasses.EncapsulatedClass;

public class L6Classes {
	
	public static void main (String[] args) {
		basicClassTest();
		encapsulatedClassTest();
		constructorTest();
		copyConstructorTest();
	}
	
	/******************************************************
	 * Basic class
	 ******************************************************/
	public static void basicClassTest() {
		// BasicClass is a custom variable type that I defined in the file by the same name (BasicClass.java) in the 'myclasses' package
		BasicClass myObject = new BasicClass();		// Creating an object is called instantiation, do this with "new " followed by the class name and "()"
													// A variable of the type defined in a class is called an object
		
		myObject.myMemberVar1 = 5;					// You can access an object's public variables with <object name>.<variable name>
		myObject.myMethod1();						// You can access an object's public functions/methods with <object name>.<method name>()
	}
	
	
	/******************************************************
	 * Class with private variables, getters and setters
	 ******************************************************/
	public static void encapsulatedClassTest() {
		EncapsulatedClass myObject1 = new EncapsulatedClass();
		myObject1.setMyMemberVar(4);									// Private member variables can only be set with a class's method such as this setter
		System.out.println( myObject1.getMyMemberVar() );				// Private member variables can only be accessed with a class's method such as this getter
	}

	
	/******************************************************
	 * Constructors
	 ******************************************************/
	public static void constructorTest() {
		ConstructableClass myObject1 = new ConstructableClass();		// Constructed with the first defined constructor (requiring no parameters)
		System.out.println(myObject1.myMemberVar);
		
		ConstructableClass myObject2 = new ConstructableClass(12);		// Constructed with the first defined constructor (requiring one parameter)
		System.out.println(myObject2.myMemberVar);
	}
	
	
	/******************************************************
	 * Copy Constructors
	 ******************************************************/
	public static void copyConstructorTest() {
		CopyableClass myObject = new CopyableClass(3,"hi");
		CopyableClass myCopy = new CopyableClass(myObject);				// An object of the same type is passed as a parameter to be copied according to instructions in the copy constructor 
		
		System.out.println( myCopy.myMemberVar1 );						// Notice that the values are the same as those in the copied object
		System.out.println( myCopy.myMemberVar2 );
	}


}

