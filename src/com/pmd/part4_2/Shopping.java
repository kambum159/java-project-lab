package com.pmd.part4_2;

public final class Shopping extends AbstractProduct{

	final int treePrice = 50;
	enum status {
		Hold,Pending,Doing,Done
	}
	
	public void buyTree() {
		System.out.println("Price is 50");
		
	}
	
	@Override
	public void buy() {
		System.out.println("Price is 0");
		
	}

	@Override
	public void sell() {
		System.out.println("Price is 100");
		
	}

}
