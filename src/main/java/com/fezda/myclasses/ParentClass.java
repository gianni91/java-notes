package com.fezda.myclasses;

public class ParentClass {
	public int myMemberVar1;
	protected String myMemberVar2;
	
	public ParentClass (int num) {
		this.myMemberVar1 = 3;
		this.myMemberVar2 = "test";
	}

	public void myMethod1 () {
		System.out.println( "Var 1 is " + myMemberVar1 );
	}
	
	public void myMethod2 () {
		System.out.println( "Var 2 is " + myMemberVar2 );
	}
}
