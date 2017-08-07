import java.util.*;

class arraylist2
{
	public static void main(String... arg)
	{
		ArrayList  a=new ArrayList();				// it means that all data types can be stored in the object 'a'
		
		a.add("hi");
		a.add("Hello");
		a.add(5);
		
		// with iterator
		/*
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		*/
		
		//with for each loop
		
		for(Object o:a)
		{
			System.out.println(o);
		}
		
		
	}

}