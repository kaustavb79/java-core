import java.util.Scanner;

class min_oneD
{
   public static void main(String args[])
   {
		Scanner m=new Scanner(System.in);
		int i,j,min;
		
		int a[]=new int[10];
			
		for(i=0;i<10;i++)
		{
			System.out.print("Enter number: ");
			a[i]=m.nextInt();
		}
			min=a[0];
			
		for(i=0;i<10;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println();
		
		System.out.println("MIN = " + min);
   }
}