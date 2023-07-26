/* Program tomdemonstrate on acces specifier*/
package org.tnsif.AccessSpecifier;

public class Bank {
	/*different access specifiers*/
public String bankname;
private int pinNo;
long AccountNo=31123121229L;
public void displayPublic()
{
	System.out.println("Bank name is:"+bankname);
}
private void displayPrivate()

{
	System.out.println("pin no is"+pinNo);
}
void displayDefault()
{
	System.out.println("Account no"+AccountNo);
}
}
