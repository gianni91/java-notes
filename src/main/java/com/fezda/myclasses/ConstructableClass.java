package com.fezda.myclasses;

public class ConstructableClass {
	public int myMemberVar;

	public ConstructableClass () {		// A method that shares the name of the class is a constructor, it is used with 'new' to create an object of this class type
		this.myMemberVar = 3;
	}
	
	public ConstructableClass (int myParam) {		// This one takes a parameter, this will only be used if the instantiation call includes a parameter
		this.myMemberVar = myParam;
	}
	
	// If you don't define any constructors, a plain constructor will be made that does nothing more than create the object
}
