import java.util.Scanner;

abstract class A1
{
	int a,b,c;
	
	public void inp1()
	{
		System.out.println(" Hello ");
	}
	
	public abstract void div(int x,int y); 
}

abstract class A2 extends A1
{
	public abstract void inp2();
	
	public void sum(int x,int y)
	{
		a=x;
		b=y;
		
		c=a+b;
		
		System.out.println("Sum: " + c);
	}
}

class A3 extends A2
{
	public void div(int x,int y)
	{
		a=x;
		b=y;
		
		c=a/b;
		
		System.out.println("Remainder: " + c);
	}
	
	public void inp2()
	{
		System.out.println("Hi");
	
	}
}


class abstr
{
	public static void main(String[] arg)
	{
		A3 a=new A3();
		Scanner k=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int d=k.nextInt();
		
		
		System.out.println("Enter second number: ");
		int f=k.nextInt();
		
		a.div(d,f);
		a.inp2();
		
		a.sum(d,f);
		a.inp1();
		
	
	}
	
}