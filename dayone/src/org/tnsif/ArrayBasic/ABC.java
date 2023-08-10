package org.tnsif.ArrayBasic;
import java.util.*;

public class ABC
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner S=new Scanner(System.in);
int Size=S.nextInt();
int arr[]=new int[Size];
for(int i=0;i<Size;i++)
{
	arr[i]=S.nextInt();
}
int x=S.nextInt();
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==x)
{
	System.out.println("We found x at index "+i);
}
}
}
}

