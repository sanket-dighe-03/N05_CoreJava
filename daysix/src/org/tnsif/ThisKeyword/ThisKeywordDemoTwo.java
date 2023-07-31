package org.tnsif.ThisKeyword;
//this can be passed as argument in custructor call

public class ThisKeywordDemoTwo {
	//default variable

	int x,y;
	 
	 
		public ThisKeywordDemoTwo(int x, int y) {
		this.x = x;
		this.y = y;
	}
		void display()
		{
			System.out.println(x+ " "  +y);
		}
		public static void main(String[] args) {
			
			ThisKeywordDemoTwo A=new ThisKeywordDemoTwo(7,6);
			A.display();

		}

	}
