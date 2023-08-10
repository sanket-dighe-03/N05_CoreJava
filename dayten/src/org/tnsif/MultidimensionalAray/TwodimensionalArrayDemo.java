package org.tnsif.MultidimensionalAray;
//program to demonstrate on 2-D array
import java.util.Arrays;

import java.util.Scanner;
public class TwodimensionalArrayDemo {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int arr[] []=new int[3] [2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=S.nextInt();
			}
			
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
		System.out.println();
		

	}
	}
}
