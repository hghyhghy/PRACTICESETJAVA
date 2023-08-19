
// write a java code for fibonacci series

import java.util.*;

public class Ps3
{

  public static void main(String [] args)
  {
  




    Scanner sc= new Scanner(System.in);

    System.out.println(" enter the value of num:");


    int num= sc.nextInt();

    int a=0;

    int b=0;

    int c=1;


    for(int i=0; i<num; i++)
    { 


      a=b;

      b=c;

      c=a+b;

      System.out.println(a+ " ");
      


    }

   




  }
}



