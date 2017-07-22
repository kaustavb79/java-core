import java.util.Scanner;

class twoD
{
   public static void main(String args[])
	{
		int i,j;
		
		//System.out.println("Enter row size: " );
		 //m=p.nextInt();
		 
		//System.out.println("Enter coloumn size: " );
		//n=p.nextInt();
		
		Scanner p=new Scanner(System.in);
		int t[][]=new int[3][3];
        
			
        for( i=0;i<3;i++)
				{  
				   //System.out.println(" ROW :" + i+1);
					for( j=0;j<3;j++)
					//System.out.print("Enter a element of coloumn : " + j+1);
					t[i][j]=p.nextInt();
				}
				
				System.out.println(" ");
				
		for(i=0;i<3;i++ )
			{ 
				for(j=0;j<3;j++)
				System.out.print(t[i][j]);
				
				
				System.out.println();
			}
		
	
	}
}