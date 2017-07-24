import java.util.Scanner;

class palin
{
	public static void main(String args[])
	{
		int i,r,k;
		
		Scanner f=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int m=f.nextInt();
		
		k=m;
		r=0;
		
		for(;k>0;)
		{
			i=k%10;
			r=r*10+i;
			k=k/10;
		}
		
		if(m==r)
		{
			System.out.println("--- Palindrome ---");
			
		}
		else
		{
			System.out.println("--- Not Palindrome ---");
		}
	}
	

}