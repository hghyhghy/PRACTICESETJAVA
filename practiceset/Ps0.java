//write a java program to swap two number without using the third variable



import java .util.*;

// creating a class 

public class Ps0
{

   public static void main(String[] args) {
    
    // creating sc object in scanner class

    Scanner sc= new Scanner (System.in);
    

    //taking input of x

    System.out.println("enter the value of x:");

    int x= sc.nextInt();

    //taking input of y

    System.out.println("enter the value of y:");

    int y=sc.nextInt();

    System.out.println("before swapping" + x + y);

    // swapping the numbers

    x= x+y;

    y=x-y;

    x=x-y;

    System.out.println(" after swapping " + x + y);
    




  }
}
