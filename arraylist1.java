import java.util.*;

//ArrayList is a predefined class
class arraylist1
{
	public static void main(String... arg)
	{
		ArrayList<String>  a=new ArrayList<String>();				//<String>: it means that only String type data can be given to the object 'a'
		
		a.add("hi");
		a.add("Hello");
		
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