package com.pmd.part1;

public class lab4 {

	public static void main(String[] args) {
		int score = 78;
		boolean isHandsome = true;
		if (isHandsome || (score >= 80)) {
			System.out.println("Good");
		} else if(score >= 50) {
			System.out.println("normal");
		} else {
			System.out.println("fail");
		}

	}

}
