import java.util.Scanner;

class sort_asc
{
   public static void main(String args[])
   {
		Scanner m=new Scanner(System.in);
		int i,j,temp=0;
		
		int a[]=new int[10];
			
		for(i=0;i<10;i++)
		{
			System.out.print("Enter number: ");
			a[i]=m.nextInt();
		}
						
		for(i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println();
		System.out.println("Ascending order = ");
		
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
   }
}