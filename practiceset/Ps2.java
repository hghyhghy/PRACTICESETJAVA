
//write a code tto swap two numbers using the thitd variable
import java.util.*;

public class Ps2
{

  public static void main(String [] args)
  {
     
   //declaring the integers

    int x,y,temp=0;

    // creating a sc object in class scanner

    Scanner sc= new Scanner(System.in);

    System.out.println("enter your number x:");

     x=sc.nextInt();

     System.out.println("enter your number y:");

     y=sc.nextInt();

     System.out.println("before sapping"+x+y);

     temp=x;

     x=y;

     y=temp;

     System.out.println("after swapping " +x+y);

  }
}