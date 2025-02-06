package com.fezda.myclasses;

public class ChildClass extends ParentClass {
	
	private String childVariable;
	
	public ChildClass () {
		super(2);					// If parent constructor takes any parameters, this must call that constructor with 'super( _ )'
		childVariable = "test";
	}

	public void myChildMethod () {
		System.out.println( "Parent class can't access this" );
		myMemberVar2 = "modified by child class";	// Protected parent variables can be accessed within a child class
	}
	
	@Override										// Put the "Override" annotation
	public void myMethod2 () {						// Define a method with the same name
		System.out.println( "Overriding method, do this instead" );
	}
}
