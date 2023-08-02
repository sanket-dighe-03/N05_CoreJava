package org.tnsif.SuperKeyword;
class Nationality

{
	String Nationname="Germany";

	public Nationality(String nationname) {
		Nationname = nationname;
		System.out.println("Nation name: "+Nationname);
	}
}
class Person extends Nationality
{
	String language;

	public Person(String nationname, String language) {
		super(nationname);
		this.language = language;
		System.out.println("Language is: "+language);
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
Person P=new Person("germany","german");
	}

}
