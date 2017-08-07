import java.util.Scanner;

class polymorphism
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		poly2 p=new poly2();
		System.out.println("Enter Two numbers: ");
		int x=k.nextInt();
		int y=k.nextInt();
		
		p.add(x,y);
	}
	
}

class poly2
{
	public void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("INT: "+c);
	}
	
	public void add(float a,float b)
	{
		float c;
		c=a+b;
		System.out.println("FLOAT: "+c);
	}
	public void add(double a,double b)
	{
		double c;
		c=a+b;
		System.out.println("DOUBLE: "+c);
	}
	public void add(long a,long b)
	{
		long c;
		c=a+b;
		System.out.println("LONG: "+c);
	}
	
	public void add(int a,float b)
	{
		float c;
		c=a+b;
		System.out.println("type casted float: "+c);
	}
	
	

	
}
