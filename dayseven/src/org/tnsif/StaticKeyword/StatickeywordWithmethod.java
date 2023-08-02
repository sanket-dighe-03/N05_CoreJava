package org.tnsif.StaticKeyword;

public class StatickeywordWithmethod {
	int x=2;
	static String collegeName="MET";
	public static void print()
	{
		System.out.println(collegeName);
		//we cant use non static var inside any static method
		//System.out.println(x);
	}

	public static void main(String[] args) {
print();
	}

}
