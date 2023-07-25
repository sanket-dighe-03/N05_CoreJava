/* program to demonstate on default and paremetrize constructor */
package org.tnsif.classandobject;

public class Citizen {
String citizenType;
long AadharNo;
String City;
String Gender;
Citizen()

{
	System.out.println("Demonstation on default cunstuctor:");
}

public Citizen(String citizenType, long aadharNo, String city, String gender) {
	super();
	this.citizenType = citizenType;
	this.AadharNo = aadharNo;
	this.City = city;
	this.Gender = gender;
	System.out.println();
	
	
}

@Override
public String toString() {
	return "Citizen [citizenType=" + citizenType + ", AadharNo=" + AadharNo + ", City=" + City + ", Gender=" + Gender
			+ "]";
}
}
