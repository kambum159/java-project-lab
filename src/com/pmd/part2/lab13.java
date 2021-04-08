package com.pmd.part2;

public class lab13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoD_Array = {{1, 2, 3},{4, 5, 6, 7},{8, 9}};
		int sum = 0;
		for (int row = 0; row < twoD_Array.length; row++) {
			for (int element = 0; element < twoD_Array[row].length; element++) {
				if(element == twoD_Array[row].length -1 ) {
					sum += twoD_Array[row][element];
				}
			}
		}
		System.out.println(sum);
	}
}
