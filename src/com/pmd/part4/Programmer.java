package com.pmd.part4;

public class Programmer extends Employee{   
    public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
        super(firstnameInput, lastnameInput, salaryInput);
    }
    public void fixPC(String serialNumber) {
        System.out.println("I'm trying to fix PC serialNumber:" + serialNumber);
    }
    
	public void work() {
		CreateWebsite();
		FixPC();
		InstallWindows();
	}
	private void FixPC() {
		// TODO Auto-generated method stub
		
	}
	private void InstallWindows() {
		// TODO Auto-generated method stub
		
	}
	private void CreateWebsite() {
		// TODO Auto-generated method stub
		
	}
}
   
   