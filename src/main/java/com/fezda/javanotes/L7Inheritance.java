package com.fezda.javanotes;

import com.fezda.myclasses.ChildClass;
import com.fezda.myclasses.ParentClass;

public class L7Inheritance {
	public static void main (String [] args) {
		ChildClass myChildObject = new ChildClass();
		myChildObject.myMemberVar1 = 5;		// Can access parent public variable
		myChildObject.myMethod1();			// Can access parent function
		myChildObject.myMethod2();			// Run overriden function
		myChildObject.myChildMethod();		// Can run its own function that parent class can't
		
		
		// You can make an array containing related objects (parent types, and various child types)
		ParentClass [] objs = new ParentClass [3];
		objs[0] = new ChildClass ();
		objs[1] = new ParentClass (3);
		objs[2] = new ParentClass (2);
	}
}

