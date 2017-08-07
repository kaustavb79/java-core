import java.util.*;

class student
{
	int rn,age;
	String name;
	
	student(int rn,String name,int age)
	{
		this.rn=rn;
		this.name=name;
		this.age=age;
	}
	
}

class arraylist3
{
	public static void main(String... arg)
	{
		student s1=new student(101,"aman",35);
		student s2=new student(102,"kaustav",23);
		student s3=new student(103,"akhil",45);
	
		ArrayList<student>  a=new ArrayList<student>();				//<student>: it means that the objects of class student containing the the data are type casted into the object of class ArrayList
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		
		// with iterator
		/*
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		*/
		
		//with for each loop
		
		for(student s:a)
		{
			System.out.println(s.rn+" "+s.name+" "+s.age);
		}
		
		
		//removing a record
		
		/*
			System.out.println("after deleting record : 2");
			a.remove(s2);
			
			for(student s:a)
		{
			System.out.println(s.rn+" "=s.name+" "+s.age);
		}
		
		*/
		
		
	}

}