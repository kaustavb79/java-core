import java.util.*;  

class ArrayList4
{  
 public static void main(String args[])
 {  
  ArrayList<String> a1=new ArrayList<String>();  
 
  a1.add("gaurav");  					// 0th  position 
  a1.add("parveen");  					// 1st 	position
  a1.add("ashu");  						// 2nd position	
    
  ArrayList<String> a2=new ArrayList<String>();
  
  a2.add("koko");  							// 3rd position
  a2.add("arvind");  						//4th position
    
  
  a1.addAll(a2); 	//in this all the data of object of class ArrayList 'a2' is add to object of class ArrayList 'a1' using " object.addAll(object); " function
 
  a1.set(2,"amar");					//it will set the object 'a1' in 2nd position and will print the name amar and will shift the rest of the data downwards
	  
     
  
//we can store more than object of arraylist

  Iterator itr=a1.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
  
 }
 
}  