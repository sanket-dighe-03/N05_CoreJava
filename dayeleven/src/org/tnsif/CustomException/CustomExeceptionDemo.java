package org.tnsif.CustomException;
//driver class
import java.util.Scanner;

public class CustomExeceptionDemo {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter email and pass");
		String email=S.nextLine();
		String Pass=S.nextLine();
		try {
			if(email.equals("Sanketndighe@gmail.com")&&Pass.equals("Pass@123"))
		
		{
			System.out.println("Credentitials matched");
		}
		else
		{
			throw new LogingCredential("invalid credential");
		}
	}
		catch(LogingCredential e)
		{
			System.out.println(e);
		}

	}

}
