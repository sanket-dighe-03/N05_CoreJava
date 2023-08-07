package org.tnsif.Interfacedemo;

public class Person implements ColdDrink,Alcohol{

	@Override
	public void ShowDrinkName() {
		System.out.println(Brand+""+Alcohol+""+name);
		
		
	}
	

}
