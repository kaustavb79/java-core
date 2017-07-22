import java.util.Scanner;

class max_oneD
{
   public static void main(String args[])
   {
		Scanner m=new Scanner(System.in);
		int i,j,max;
		
		int a[]=new int[10];
			
		for(i=0;i<10;i++)
		{
			System.out.print("Enter number: ");
			a[i]=m.nextInt();
		}
			max=a[0];
		for(i=0;i<10;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println();
		
		System.out.println("MAX = " + max);
   }
}