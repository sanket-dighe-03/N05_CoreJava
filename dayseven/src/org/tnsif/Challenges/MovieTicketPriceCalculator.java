package org.tnsif.Challenges;
import java.util.Scanner;

public class MovieTicketPriceCalculator {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=S.nextInt();
		System.out.println("Enter the timing in 24 hours format");
		int time=S.nextInt();
		double TicketPrice;
		if(age>13)
		{
			if(time==10.15 || time==13.30)
			{
				TicketPrice=5.00;
			}
			else {
				TicketPrice=8.00;
			}
		}
			else {
				if(time==10.15||time==13.30)
				{
					TicketPrice=5.00;
				}
				else
				{
					TicketPrice=8.00;
			}
		}
		System.out.println("Ticket price"+TicketPrice);
		

	}

}
