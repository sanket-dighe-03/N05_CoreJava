package org.tnsif.SuperKeyword;
class Sports
{
	String sportsname="cricket";
	void display()
	

	{
		System.out.println("Sports name is:"+sportsname);
	}
}
//child class
	class Cricket extends Sports
{
	int Noofplayer=11;
	void display()
	

	{//if parent and child class methods are same then use the super keyword method
		super.display();
		System.out.println("Sports name is:"+Noofplayer);
		
	}
	
}

public class SuperkeywordWithMethod {

	public static void main(String[] args) {
Cricket c=new Cricket();
c.display();
	}

}
