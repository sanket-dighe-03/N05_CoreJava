package org.tnsif.Interfacedemo;

public class CheesePopcorn implements PopCorn{

	@Override
	public void displayRecipe() {
		System.out.println("take a popcorn packet"+"From the shop and cook it in high "+
	"Fire inside the cooker");
		CheesePopcorn C=new CheesePopcorn();
		C.displayRecipe();
	}

}
