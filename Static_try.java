import java.util.Scanner;

class first
{
	static int a=10;
	static String b;
}

class Static_try
{
	public static void main(String args[])
	{
		first a1=new first();
		first b2=new first();
		first c3=new first();
		
		a1.a=45;
		c3.a=55;
		b2.a=34;
		
		
		a1.b="hi";
		b2.b="Hello";
		c3.b="now";
		
		System.out.println("integer value: "+a1.a);
		System.out.println("String value: "+b2.b);
	}
}