package org.tnsif.UnchekedExceptionDemo;
import java.util.Scanner;


public class ArrayIndexOutOfBoundException {
	static void print(int arr[])
	{
	try
	{
	System.out.println(arr[4]);	
	}
	catch(Exception e)
	{
		System.out.println("Exception Handelled"+e);
	}
	
	finally
	{
		System.out.println("Finally block is always executed");
	}
	}
	public static void main(String[] args) {
		int arr[]= {12,3,4};
	print(arr);
		
	}

}
