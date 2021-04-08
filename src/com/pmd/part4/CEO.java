package com.pmd.part4;

import com.pmd.part4.IWebsiteCreator;

public class CEO extends Employee {   
    public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
        super(firstnameInput, lastnameInput, salaryInput);
    }
    @Override
    public int getSalary() {
        return super.getSalary() * 2;
    }
    
    public void hello() {
        System.out.println("Hi, nice to meet you. "+this.firstname+"!");
    }

	public void work() {
		Seminar();
		Hire();
		Golf();
		Fire();
	}
	
	private void Hire() {
		// TODO Auto-generated method stub
		
	}
	private void Fire() {
		// TODO Auto-generated method stub
		
	}
	private void Golf() {
		// TODO Auto-generated method stub
		
	}
	private void Seminar() {
		// TODO Auto-generated method stub
		
	}
	public void orderWebsite(IWebsiteCreator alphaGo2) {
		// TODO Auto-generated method stub
		
	}
}
   
   