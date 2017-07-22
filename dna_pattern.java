import java.util.Scanner;

class dna_pattern
{
	public static void main(String args[])
	{
		int i,l,j,k;
		for(l=1;l<3;)
	  {
		for(i=1;i<=5;i++)
		{
						
			for(j=1;j<=i;j++)
			{
			if(i==j)
			System.out.print("*");
			else
			System.out.print(" ");
			}
			
			for(k=4;k>=i;k--)
			{
				System.out.print(" ");
				if(i==k)
				System.out.print("*");
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
			System.out.print("*");
			else
			System.out.print(" ");
			}
			
			for(k=4;k>=i;k--)
			{
				System.out.print(" ");
				if(i==k)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
	  }	
	}

}