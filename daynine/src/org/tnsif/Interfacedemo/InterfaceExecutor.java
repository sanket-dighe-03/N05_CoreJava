package org.tnsif.Interfacedemo;
//driver class
//program to demonstate on an interfece

public class InterfaceExecutor {

	public static void main(String[] args) {
		
		//DemoCard d=new DebitCard();
		//we cant instantiate interface
		SBIDebitCard S=new SBIDebitCard();
		S.displayCardDetails();
		S.display();
		//we can call default method of inetrface using obj of implemented class
		/*print() is a static method inside an interface ,
		 * to call print method,we have to use inetrface name.method name
		 */
		DebitCard.print();
		Person P=new Person();
		P.ShowDrinkName();

	}

}
