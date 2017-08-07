import java.util.Scanner;

class Q
{
	public void pattern_name()
	{
		for(int i=1;i<5;i++)				//first loop
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
			}
			
			//System.out.print("\t\t");
			
			
			
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
				if(i==k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
			}
			
			
		
		
		
			
			System.out.println();
		}
		
		
		
		for(int y=5;y>=1;y--)							// second loop
		{
			for(int j=1;j<=y;j++)									
			{
				if(y==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
			}
			
			
			for(int k=5;k>=y;k--)
			{
				System.out.print(" ");
				if(y==k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
			}
			
			for(int s=1;s<=y;s++)										//	loop to print A
			{
				System.out.print(" ");
				if(y==s)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			
			
			for(int l=4;l>=y;l--)											//	loop to print A
			{	//System.out.print(" ");
				if(y==l)
				{
					System.out.print(" * ");
				}
				else if(y==3)
				{System.out.print(" *");}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=1;j<=y+1;j++)
			{
				System.out.print(" ");
			}
			
			for(int r=1;r<=5;r++)										// loop to print U
			{
				if(r==1)
				{
				System.out.print("*");
				}
				
				/*for(int e=1;e<=5;e++)
				{
					
					if(r==5)
					{
						System.out.print("_*");
					}
					else if(e==1||e==5)
					{
					System.out.print("*");
					}
					else
					{
					System.out.print("_");
					}
					*/
					
				
				
			}
			
			
			System.out.println();
			
		}
				
	}
}


class name_pattern
{
	public static void main(String args[])
	{
		Q m=new Q();
		m.pattern_name();
	}
}