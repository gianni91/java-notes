package com.fezda.javanotes;

import com.fezda.myclasses.MyInterface;
import com.fezda.myclasses.MyImplementation1;
import com.fezda.myclasses.MyImplementation2;

public class L8Interfaces {
	public static void main (String [] args) {
		
		// The interface requires that certain functions be defined in any class that implements it
		// That way a different class can define the function differently, but still have the same function call
		
		// Then you can group together objects of different classes that implement it
		MyInterface [] myList = new MyInterface [2];
		myList[0] = new MyImplementation1();
		myList[1] = new MyImplementation2();

		// And you can call the shared function on each of them
		for (MyInterface item : myList) {
			item.myMethod();
		}
	}
}
