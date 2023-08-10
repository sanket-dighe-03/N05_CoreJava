package org.tnsif.singledimensionalArray;
//program to demonstate on array using compile time input value

public class ArrayExample {

	public static void main(String[] args) {
		//initialization of an array at compile time
		int arr[]= {44,33,66,2,38};
		System.out.println("The array of 2nd index is :"+arr[2]);
		for(int i:arr)
			//to print all the values of an array
		{
			System.out.println(i+"");
		}
		

	}

}
