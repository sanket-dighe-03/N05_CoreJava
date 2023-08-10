package org.tnsif.UnchekedException;
import java.util.Scanner;

public class FinnalyBlockNotExecutedDemo {
	
	

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		// TODO Auto-generated method stub
		int X=S.nextInt();
		int Y=S.nextInt();
		//try block contain code that have exception
		try
		{
		
		System.out.println(X/Y);
		/*When we use System.exit(0)then the finally block does not Executed*/
		System.exit(0);
		}
		//catch block use to handle the Exception 
		//catch(Arithmetc Exeption || NullPointerException)
		catch(Exception e)
		
		{
			System.out.println("Exception Handeled: "+e);
			System.exit(0);
		}
		finally
		{
			//when finally block contain exception then it is not executed
			System.out.println(4/0);
			System.out.println("Finally Block is Always Executed");
		}

	}

}
