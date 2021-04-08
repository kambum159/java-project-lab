package com.pmd.part1;

public class lab6 {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		sum1to10();
		findMod12();
		
		int[] myArray = {1,2,3,4,5};
		for (int count: myArray) {
			System.out.println(count);
		}
	}
	
	public static void sum1to10() {
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("sum1to10: " + sum);
	}
	
	public static void findMod12() {
		int i = 1;
		String num = "";
		while(i <= 100) {
			if (i % 12 == 0) {
				num += String.valueOf(i) + " ";
			}
			i++;
		}
		System.out.println("findMod12: " + num);
	}

}
