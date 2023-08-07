package org.tnsif.Interfacedemo;
//this is implementable class

public class SBIDebitCard implements DebitCard{

	@Override
	public void displayCardDetails() {
		// TODO Auto-generated method stub
		System.out.println("card no is:"+cardno);
	}

}
