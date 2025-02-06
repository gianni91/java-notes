package com.fezda.myclasses;

public class CopyableClass {
	public int myMemberVar1;
	public String myMemberVar2;
	
	public CopyableClass ( CopyableClass myObjToCopy) {		// A copy constructor takes an object of the same class type and produces a new one with the same values
		this.myMemberVar1 = myObjToCopy.myMemberVar1;
		this.myMemberVar2 = myObjToCopy.myMemberVar2;
	}
	
	// Since the above constructor was defined, the default empty constructor will not be made, so you have to define 
	// another constructor for creating an object without one to copy
	public CopyableClass (int num, String word) {		
		this.myMemberVar1 = num;
		this.myMemberVar2 = word;
	}
	
}
