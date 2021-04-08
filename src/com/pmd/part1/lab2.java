package com.pmd.part1;

public class lab2 {

	public static void main(String[] args) {
		bark();
		
		float newFloat = 5.5f;
		int newInt = ( int ) newFloat; 
		System.out.println("newFloat value: "+ newFloat);
		System.out.println("newInt value: "+ newInt); 
		
		int myInt = 5;
		float myFloat = myInt;
		System.out.println("myInt value: " + myInt);
		System.out.println("myFloat value: "+myFloat);
		
		double myDouble2 = 5;
		float myFloat2 = (float) myDouble2; //Widening
		System.out.println("myDouble2 value: " + myDouble2);
		System.out.println("myFloat value: "+myFloat2);
		
		char myChar = 42;
		int myInt2 = myChar; 
		System.out.println("myChar value: " + myChar);
		System.out.println("myInt value: "+myInt2);
		

		final String hello = "Hello";
		hello = "World";
	}

	public static void bark() {
		String dogName = "Momo";
		System.out.println("The Dog name = " + dogName + " barkbark");
	}
}
