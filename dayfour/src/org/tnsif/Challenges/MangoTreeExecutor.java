/*pratik is so much intrested in gardening.so he has plant more trees in garden.
//he plants trees in rectangular fashion with the order of rows and columns 
//and no. the trees in a rowise order.He planted the mango tree only in the
//first row ,first column and last column.So ,given the tree no. and rows and columns 
//your task is to find out weather the given tree is mango tree or not,int n=5;n=row and columns
//t=11,t=tree no. */
package org.tnsif.Challenges;
import java.util.Scanner;

public class MangoTreeExecutor {
	 static void ismangotree( int n,int t)
	 {
	if(t%n==0 || t%n==1 || t<=5)
	{
		System.out.println("Mango tree");
	}
	else
	{
		System.out.println("other tree");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter no of n and t");
		int n=S.nextInt();
		int t=S.nextInt();
		ismangotree(n,t);

	}

}
