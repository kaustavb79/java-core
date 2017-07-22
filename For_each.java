import java.util.Scanner;

class For_each
{
   public static void main(String args[])
	{
		Scanner p=new Scanner(System.in);
		int t[]=new int[5];
        
			
        for(int i=0;i<5;i++)
				{
					System.out.print("Enter a number: ");
					t[i]=p.nextInt();
				}
				
				System.out.println(" ");
		for(int k: t)
			{
				System.out.println(k);
			}
		
	
	}
}