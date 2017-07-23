import java.util.Scanner;

class pattern1
{
	public static void main(String args[])
	{
		int i,j,k;
		
		for(i=1;i<=5;i++)
		{
						
			for(j=1;j<=i;j++)
			{
			if(i==j)
			System.out.print(" "+i);
			else
			System.out.print(" ");
			}
			
			for(k=4;k>=i;k--)
			{
				System.out.print(" ");
				if(i==k)
				System.out.print(i);
				else
				System.out.print(" ");
			}
			System.out.println();
				
		}
		
		for(i=4;i>=1;i--)
		{
			
			
			for(j=1;j<=i;j++)
			{
			if(i==j)
			System.out.print(" "+i);
			else
			System.out.print(" ");
			}
			
			for(k=4;k>=i;k--)
			{
				System.out.print(" ");
				if(i==k)
				System.out.print(i);
				else
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
		
	}

}