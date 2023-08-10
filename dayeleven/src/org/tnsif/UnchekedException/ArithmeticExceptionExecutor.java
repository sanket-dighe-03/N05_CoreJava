package org.tnsif.UnchekedException;
import java.util.Scanner;
//Program to demonstate on Arithmetic Exception

public class ArithmeticExceptionExecutor {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int X=S.nextInt();
		int Y=S.nextInt();
		//try block contain code that have exception
		try
		{
		
		System.out.println(X/Y);
		}
		//catch block use to handle the Exception 
		catch(Exception e)
		
		{
			System.out.println("Exception Handeled: "+e);
		}
		
	

	}

}
