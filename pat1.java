import java.util.Scanner;

class pat1
{
	
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		
		int i,j,m;
		
		System.out.print("Enter a number: ");
		int t=k.nextInt();
		
		for(i=1;i<=t;i++)
		{
			for(j=t;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			
			for(int l=1;l<=1;l++)
			{
				System.out.print(" "+l);
			}	
			
			
			
			for(m=1;m<i;m++)
			{
				System.out.print(" "+i);
			}
			
			
			
			for(int y=1;y<=1;y++)
			{
				System.out.println(" "+y);
			}
			
			
			System.out.println();
		}
		
		
	}
	
	
}