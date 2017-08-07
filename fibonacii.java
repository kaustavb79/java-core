import java.util.Scanner;

class A1
{
	public void fib(int x)
	{
		int n1,n2;
		
		n1=1;
		n2=-1;
		
		for(int i=0;i<=x;i++)
		{
		n1=n1+n2;
		n2=n1-n2;
		}
		
		System.out.print(" "+n1);
	}
	
}

class fibonacii
{
	public static void main(String args[])
	{
		A1 w=new A1();
		
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the number till you want to print the fibonacii series: ");
		int t=k.nextInt();
		
		for(int i=0;i<t;i++)
		{
			w.fib(i);
		}
	}
}
