package org.tnsif.cheakedException;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

public class FileNotFoundExceptionDemo {

	public static void main(String[] args) {
		try
		{
		FileInputStream f=new FileInputStream("C:\\Users\\Admin\\Documents");
		System.out.println("file has found");
		}
		catch(FileNotFoundException f)
		{
			System.out.println("Not found");
		}

	}

}
