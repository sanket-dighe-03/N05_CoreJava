package org.tnsif.ThisKeyword;

public class ThisKeywordDemoFour {
int x;
//default constructor
ThisKeywordDemoFour()
{//invoking current paramertrized constructor
	this(21);
	System.out.println("Default cunstructor");
	
}
ThisKeywordDemoFour(int x)
{
	this.x=x;
	System.out.println(" parametrized cunstructor " +x);
}
	public static void main(String[] args) {
		ThisKeywordDemoFour A=new ThisKeywordDemoFour();
	}

}
