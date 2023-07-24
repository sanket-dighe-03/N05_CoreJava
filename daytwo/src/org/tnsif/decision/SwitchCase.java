package org.tnsif.decision;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose the song");
		Scanner S=new Scanner(System.in);
		int Songno=S.nextInt();
		switch(Songno)
		
		{
			case 1:
				System.out.println("Perfect");
			break;
			case 2:
				System.out.print("lag ja gale");
			break;
			case 3:
				System.out.println("I found her");
			break;
			case 4:
				System.out.println("Khairiyat");
			break;
		}

	}

}
