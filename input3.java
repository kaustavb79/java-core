import java.util.Scanner;
class input3
{
   public static void main(String args[])
   {
        Scanner k=new Scanner(System.in);
           char t;
              System.out.print("Enter a letter(upto 5 characters): ");
             t=k.next().charAt(5);
			 System.out.println("The letter(s) you entered: " + t);
   }

}