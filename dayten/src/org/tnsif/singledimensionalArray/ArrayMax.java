package org.tnsif.singledimensionalArray;
import java.util.Scanner;
import java.util.Arrays;
//program to demonstate on runtime array and to findout the largest element  in given array

public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of array :");
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array elements are :");
		for(int i=0;i<n;i++)
			
		{
			System.out.println(arr[i]+" ");
		}
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The largest element in an array is:"+max);
		Arrays.sort(arr);
            for(int i=0;i<n;i++)
			
		{
			System.out.println(arr[i]+" ");
		}
		
		
		

	}

}
