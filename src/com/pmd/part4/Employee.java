package com.pmd.part4;

public class Employee implements IWebsiteCreator {
    public   String firstname;
    public   String lastname;
    private  int salary;
   
    public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
        this.firstname = firstnameInput;
        this.lastname = lastnameInput;
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
	@Override
	public void createWebsite(String template, String titleName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void orderWebsite(Employee dang) {
		// TODO Auto-generated method stub
		
	}
}
   
   