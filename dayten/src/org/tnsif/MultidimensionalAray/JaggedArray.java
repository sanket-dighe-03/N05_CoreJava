package org.tnsif.MultidimensionalAray;
/*in jagged array the outside value is fixed but the inside array is varry or not fixed*/
import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int arr[][]=new int[2][];
		//for outside index 0,storing 3 elements
		arr[0]=new int[3];
		//for outside index 1,storing 2 elements
		arr[1]=new int[2];
		for(int i=0;i<arr.length;i++)
			
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
				arr[i][j]=S.nextInt();
			}
		}
for(int i=0;i<arr.length;i++)
			
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
