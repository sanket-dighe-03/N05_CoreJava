/*
 * write a program to calculate hotel tarrif
 *the room rent is 12% high during peak season(April to june And nov to dec)
 *note: use the switch cases.
 *Sample input A=1,month=3,rent,Day.
 */
package org.tnsif.Challenges;
import java.util.Scanner;
public class Xy {

	public static void main(String[] args) {
		int days;
		int month;
		Scanner s=new Scanner(System.in);
		System.out.println();
		month= s.nextInt();
		days=s.nextInt();
		float rent=s.nextFloat();
		switch(month)
		{
		case 4:
		case 5:
		case 6:
	
		case 11:
		case 12:System.out.println("Hotel tarrif is"+(rent+rent*0.20)*days);
		break;
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:System.out.println("hotel tarrif is"+rent*days);
		break;
		default:
			System.out.println("entered wrong month");
		

			
		}
		
		// TODO Auto-generated method stub

	}

}
