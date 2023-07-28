/*  Ask a user for birth year encoded as two digits(like "62")
 * and for the current year,also encoded as two digit(like "99").
 * write a program to find users current age in year
 */
package org.tnsif.Challenges;
import java.util.Scanner;
public class AgeCalculator {
	 static void  Currentage(int b,int c)
	{
		if(c>b)
		{
			System.out.println(c-b);
		}
		else
			System.out.println((100-b)+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner A=new Scanner(System.in);
		int b=A.nextInt();
		int c=A.nextInt();
		Currentage(b,c);
		

	}

}
