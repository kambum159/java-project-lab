package com.pmd.day10;

public class Employee {
    public   String firstname;
    public   String lastname;
    private  int salary;
    private String position;
   
    public static void main(String[] args) {
    	Employee employee = new Employee("Mu","Sa", 100,"Manager");
    	employee.checkPosition();
    }
    
    public Employee(String firstnameInput, String lastnameInput, int salaryInput,String position) {
        this.firstname = firstnameInput;
        this.lastname = lastnameInput;
        this.salary = salaryInput;
    }
    
    public Employee(String firstnameInput,String lastnameInput, int salaryInput) {
        this.firstname = firstnameInput;
        this.salary = salaryInput;
    }
    
    public void setSalary(int newSalary) {
        
    }
    public int getSalary() {
        return salary;
    }
    public void hello() {
        System.out.println("Hello "+this.firstname);
    }
    
    public void checkPosition() {
		System.out.println(this.position);
	}
}
   
   