
//it can be use to refer instance variable of current class
package org.tnsif.ThisKeyword;

public class ThisKeywordDemoOne {
int x,y;
 void SetData(int x,int y) 
{
	this.x=x;
	this.y=y;
	
}
 void display() {
	 System.out.println(x+""+y);
	 
 }
	public static void main(String[] args) {
		
		ThisKeywordDemoOne A=new ThisKeywordDemoOne();
		A.SetData(5, 4);
		A.display();

	}

}
