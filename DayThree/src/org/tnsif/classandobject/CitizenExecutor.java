/*Driver class for Citizen*/
package org.tnsif.classandobject;

public class CitizenExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Citizen C=new Citizen();
C.AadharNo=557469480535L;
C.citizenType="Adult";

C.City="nashik";
C.Gender="male";
Citizen C1=new Citizen("Adult",557469480535L,"NASHIK","MALE");
System.out.println(C1);
	}

}
