package com.fezda.myclasses;

public class EncapsulatedClass {
	private int myMemberVar = 3;		// Private variables can't be accessed outside of the class, except through its methods (class functions)

	public int getMyMemberVar () {		// It is common to have a function called set<variable name> to set the variable value in code outside the class
		return myMemberVar;
	}
	
	public void setMyMemberVar (int myParam1) {	// It is common to have a function called get<variable name> to get the variable value in code outside the class
		myMemberVar = myParam1;
	}
}
