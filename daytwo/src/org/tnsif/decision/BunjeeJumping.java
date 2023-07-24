package org.tnsif.decision;
import java.util.Scanner;

public class BunjeeJumping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S= new Scanner(System.in);
		System.out.println("Enter age and weight");
		int age=S.nextInt();
		int Weight=S.nextInt();
		if(age>=12 )
		{
			if(Weight>=40)
				
			{
				System.out.println("eligible for jump");
				if(Weight>110)
				{
					System.out.println("Extra ropes will be added");
				}
				else 
				{
					System.out.println("not eligible");
				}
					
				}
				
				
			}
		


