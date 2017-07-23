import java.util.Scanner;
class twoD_sum
{
	public static void main(String args[])
	{
		Scanner l=new Scanner(System.in);
		int i,j;
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		System.out.println("FIRST MATRIX: ");
		for(i=0;i<3;i++)
		{
			System.out.println("Enter value of row " +(i+1) +": ");
			for(j=0;j<3;j++)
			{
				System.out.println("Enter value of column " +(j+1) +": ");
				a[i][j]=l.nextInt();
			}
		}	
		
		System.out.println("SECOND MATRIX: ");
		for(i=0;i<3;i++)
		{
			System.out.println("Enter value of row " +(i+1) +": ");
			for(j=0;j<3;j++)
			{
				System.out.println("Enter value of column " +(j+1) +": ");
				b[i][j]=l.nextInt();
			}
		}	
		
		
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			   c[i][j]=0;
		}
		
		System.out.println("FIRST MATRIX: ");
		for(i=0;i<3;i++)
		{
			
			for(j=0;j<3;j++)
			{
				System.out.print(" "+a[i][j]);
				
			}
			System.out.println();
		}	
		
		System.out.println("SECOND MATRIX: ");
		for(i=0;i<3;i++)
		{
			
			for(j=0;j<3;j++)
			{
				System.out.println(" "+b[i][j]);
				
			}
			System.out.println();
		}	
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println();
		System.out.println(" SUM: ");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(" "+c[i][j]);
				
			System.out.println();	
		}
	}
}