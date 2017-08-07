//decleration of arrays
/* it is a collection of many elements of a single data type stored in adjacent memory locations . */

import java.util.Scanner;

class arrayin
{
	public static void main(String args[])
	{
		int i;
		Scanner k=new Scanner(System.in);
		
		int t[]=new int[10];
		
		for(i=0;i<10;i++)
		{
			System.out.print("Enter number: ");
			t[i]=k.nextInt();
		}
		
		System.out.println();
		
		for(i=0;i<10;i++)
		{
			System.out.println(t[i]);
		}
	}

}
