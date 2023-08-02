package org.tnsif.StaticKeyword;

public class StaticKeywordwithBlock {
	static float Sallery=6767.89f;
	String componyname;
	/*static block is used to initialized the static variable
	 * we cant assign a value for non static
	 *  */

	
static {
	//componyname="Accenture";
	Sallery=8488.99f;
	
}
static void print()



{
	
	System.out.println(Sallery);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}

}
