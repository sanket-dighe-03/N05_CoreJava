package org.tnsif.Challenges;
/* there are n people standing in circle waiting to be executed .
 *  The counting out begin at some point
 * int the cirxle and proceeds  around circlr in fix direction in each stage
 * a certain no of people are skipped and the next person is executed.
 * The elimination proceeds around a circle
 *  (which is becoming Smaller and smaller
 * as exucateed people sare removed)until only the last person remains
 *  who is given freedom.
 *  Given the total no of person n and the no. K which indiactes that k-1 person
 *   are skipped and the kth person is killed in the circle.
 *   The task is to choose the person in initial circle is servived
  
 */
import java.util.Scanner;
public class XYZ {
	
	Static int Survive(int n,int k)
	{
		if(n==1)
	return 1;
	else
		 return (Survive(n-1,k)+k-1)%n+1;
	}
	public static void main(String[] args) {
		
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int k=S.nextInt();
		System.out.println(Survive(n,k));
				

	}

}
