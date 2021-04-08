package com.pmd.part4;

import java.util.ArrayList;

public class lab14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		Employee dang = new Employee(" Dang", " Red", 10000);
		Employee ceo = new CEO(" Captain", " Marvel", 30000);
		Programmer prog = new Programmer(" Captain", " Marvel", 20000);
		CEO ceo2 = (CEO) ceo;

		ArrayList<Employee> myList = new ArrayList<>();
		myList.add(ceo);
		myList.add(dang);
		myList.add(prog);
		CEO ceo3 = (CEO) myList.get(0);
		Employee dangdang2 = myList.get( 1);
		Programmer progprog2 = (Programmer)myList.get(2);
		ceo3.hello(); // Hi, nice to meet you.
		
		CEO ceoo = new CEO(" Captain", " Marvel", 30000);
		IWebsiteCreator dangg = new Programmer("Dang", "Red", 10000);
		Programmer dang2 = (Programmer) dangg;
		AI alphaGo = new AI(" alphaGo", " Java");
		IWebsiteCreator alphaGo2 = alphaGo;
		ceoo.orderWebsite(dang);
		ceoo.orderWebsite(dang2);
		ceoo.orderWebsite(alphaGo);
		ceoo.orderWebsite(alphaGo2);
	}

}
