import java.util.Scanner;

class pattern2
{
	public static void main(String args[])
	{
		int i,j,k,h;
		
		Scanner g=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int m=g.nextInt();
		
		System.out.println();
			
		for(i=1;i<=m;i++)
		{
		
			for(j=m;j>=i;j--)
			{
				System.out.print(" ");
			}

			for(k=1;k<=i;k++)
			{
					System.out.print(""+k);
			}
			
			for(h=i-1;h>=1;h--)
			{
				
				System.out.print(""+h);
			}
			
			System.out.println();
		}
	}
}