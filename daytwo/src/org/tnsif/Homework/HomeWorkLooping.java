package org.tnsif.Homework;

import java.util.Scanner;
public class HomeWorkLooping {

	public static void main(String[] args) 
		// TODO Auto-generated method stub

	{
	    Scanner Sc=new Scanner(System.in);
	    int height=Sc.nextInt();
	    for(int i=1;i<=height;i++)
	    
	    {
	        for(int j=1;j<=i;j++)
	        
	        {
	            System.out.print("*");
	        }
	         System.out.println();
	    }
	}}