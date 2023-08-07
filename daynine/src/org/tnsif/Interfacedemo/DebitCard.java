package org.tnsif.Interfacedemo;

public interface DebitCard {
	/* By default all the variables  inside the interface is public Static final
	 * and if it is final then we must initialize the variable 
	 */
	long cardno=132343367l;
	//we cant use concrete method in an interface
	//so it is bydefault method is abstract
	 void displayCardDetails();
	 /*default method and static method is the new feature of java8
	  * which can we use inside an inteface
	  */
	 default void display()
	 {
		 System.out.println("Default method");
	 }
	 //this is a static method
	 static void print()
	 
	 {
		System.out.println("Static method"); 
	 }
	

}
