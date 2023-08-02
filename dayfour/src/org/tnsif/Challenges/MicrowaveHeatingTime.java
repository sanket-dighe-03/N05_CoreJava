package org.tnsif.Challenges;
import java.util.Scanner;

public class MicrowaveHeatingTime {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int item =S.nextInt();
		float ht=S.nextFloat();
		switch(item)
		{
		case 1:
			System.out.println("Heating time is"+ht);
			break;
		case 2:
			System.out.println("Heating time is"+(ht/2)+ht);
			break;
		case 3:
			System.out.println("heating time is"+2*ht);
			break;
			default:
				System.out.println("heating more than three items "+" not recommended");
		}
		

	}

}
