package org.tnsif.decision;
import java.util.Scanner;

public class CascadedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S= new Scanner(System.in);
		int age1=S.nextInt();
		int age2=S.nextInt();
		int age3=S.nextInt();
		if(age1>age2 && age1>age3)
		{
			System.out.println("Age 1 is greater");
	
		}
		else if(age2>age1 && age2>age3)
		{
			System.out.println("age 2 is greater");
		}
		else
		{
		System.out.println("age 3 is greater");
		}

	}

}
