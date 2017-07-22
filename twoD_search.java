import java.util.Scanner;

class twoD_search
{
   public static void main(String args[])
	{
		int i,j;
		
		
		Scanner k=new Scanner(System.in);
		int t[][]=new int[3][3];
		
      			
			for( i=0;i<3;i++)
				{  
					for( j=0;j<3;j++)
					t[i][j]=k.nextInt();
				}
				
				System.out.println(" ");
			for( i=0;i<3;i++)
				{  
					for( j=0;j<3;j++)
					System.out.print(" "+t[i][j]);
					
					System.out.println();
				}
				
				System.out.println(" ");
				
			System.out.println("Enter the number you want to search for: ");
			int se=k.nextInt();	
		     
			
				
		for(i=0;i<3;i++ )
			{ 
				for(j=0;j<3;j++)
				{
					if(t[i][j]==se)
				System.out.print("found in row index : "+i+" and column index: "+j);
				}
				
				System.out.println();
			}
		
	
	}
}