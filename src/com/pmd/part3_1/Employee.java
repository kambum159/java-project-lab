package com.pmd.part3_1;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	private String position;

	public static void main(String[] args) {
		Employee[] employee = new Employee[3];
		
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee("Na " + i , "Ma " + i , 1000 * i, "Manager " + i );
		}
		
		System.out.println(employee[0].firstname);
	}
	
	public Employee(String firstnameInput, String lastnameInput, int salaryInput,String position) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
	}

	public void hello() {
		System.out.println("Hello " + this.firstname);
	}

	public int getSalary() {
		return salary;
	}
	
	public void getPosition() {
		System.out.println(this.position);
	}

}
