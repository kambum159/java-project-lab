package com.pmd.day10;

import com.pmd.part3_1.Employee;

public class Day10 {

    public static void main(String[] args) {
    	CEO ceo = new CEO("Man","Lan", 100);
    	Employee employee = new Employee("Mu","Sa", 100, "Lo");
    	Programmer programmer = new Programmer("Maa","Saa", 100);
    	programmer.getSalary();
    }
}   