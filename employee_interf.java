import java.util.Scanner;

interface emp1
{
   	 int emp_id[]=new int[10];								//employee id
	 String name[]=new String[10];							//employee name
	 float sal[]=new float[10];								//employee salary
	
	public void input(int q);
	public void output(int q);
}

class emp2 implements emp1
{
	Scanner k=new Scanner(System.in);
	
	
	public  void input(int q)
	{
		System.out.print("ENTER EMPLOYEE ID (only integer): ");
		emp_id[q]=k.nextInt();
	
		System.out.print("ENTER EMPLOYEE NAME: ");
		name[q]=k.next();
		
		System.out.print("ENTER EMPLOYEE SALARY(float type): ");
		sal[q]=k.nextFloat();
	}
	
	
	public void output(int q)
	{
		System.out.print(" EMPLOYEE ID: " + emp_id[q]);
		System.out.print(" EMPLOYEE NAME: " + name[q]);
		System.out.print(" EMPLOYEE SALARY: " + sal[q]);
	}
	
}


class employee_interf
{
	public static void main(String ar[])
	{
		Scanner h=new Scanner(System.in);
		emp2 l=new emp2();
		
		System.out.print("Enter how many records you want to enter: ");
		int s=h.nextInt();
		
		for(int i=0;i<s;i++)
		{
			l.input(i);
		}
		
		System.out.println();
		
		for(int i=0;i<s;i++)
		{
			l.output(i);
			System.out.println();
		}
		
		System.out.println("Enter the employee id you want to search for: ");
		int w=h.nextInt();
		
		for(int i=0;i<s;i++)
		{
			if(l.emp_id[i]==w)
			{
				System.out.println("FOUND: ");
				l.output(i);
			}
			
			
		}
		
		
	}

}