//function overriding

import java.util.Scanner;

class inherit1						//parent class
{
	public static void show()
	{
	System.out.println("Hello");
	}
	
}

class inherit2 extends inherit1		//child class
{
	public  static void show()
	{
	System.out.println("HI");
	}
	
}

class func_overr
{
	public static void main(String args[])
	{
	inherit1 y=new inherit2();
	y.show();
	}
	
}