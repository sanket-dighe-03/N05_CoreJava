package org.tnsif.SuperKeyword;
class State
{
	String StateName="punjab";
	
}
class Capital extends State
{
	String StateName="Haryana";
	String capital="chandigarh";
	public void display()
	{
System.out.println(super.StateName);
System.out.println(StateName);

	}
}

public class SuperKeywordVariable {

	public static void main(String[] args) {
Capital C=new Capital();
System.out.println(C.StateName);
	}

}
