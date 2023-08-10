package org.tnsif.UnchekedException;

import java.io.IOException;

public class ThrowExecutor {
	static void isEligible(int age,int weight) throws IOException


	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			throw new IOException("Age and weight is not satisfied");
		}
	}

	public static void main(String[] args)throws IOException {
		isEligible(12,54);

	}

}
