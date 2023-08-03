package org.tnsif.AbstractKeyword;
//driver class
public class AbstractExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Operator O=new Operator();
//we cant create an object for abstarct class
		Addition A=new Addition();
		A.print(1, 4);
		A.operation();
	}

}
