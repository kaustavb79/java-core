import java.util.Scanner;

class rev_oneD
{
    public static void main(String args[])
	{
	Scanner l=new Scanner(System.in);
	int i;
	  int a[]=new int[5];
	 
	  
	   for(i=0;i<5;i++)
	   {
			System.out.print("Enter number: ");
			a[i]=l.nextInt();
	   }
	  
	   System.out.println();
	  
		  
	   for(i=4;i>=0;i--)
	   {
			System.out.println(a[i]);
	   }
	 
	
	}
}