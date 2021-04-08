package com.pmd.part2;

public class lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "You and Me"; 
		String string2 = "you and me";
		
		if(string1.equals(string2)) {
			System.out.println("equals");
		}
		
		System.out.println(checkContain(string1,"and"));
		System.out.println(checkContain(string1,"you"));
	
		System.out.println(string1.length());
		System.out.println(string2.length());
		
		System.out.println(string1.substring(4,10));
		System.out.println(string1.trim());
		System.out.println(string1.toUpperCase());
		System.out.println(string2.toUpperCase().trim());
	}
	
	public static String checkContain(String data,String data2) {
		if(data.contains(data2)) {
			return data2;
		}
		return "Don't found";		
	}

}
