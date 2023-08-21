//java program to show minutes in year

import java.util.*;

public class Ps11
{

  public static void main(String[] args)
  {

    Scanner my_minutes= new Scanner(System.in);


    System.out.println("ENTER YOUR user_MINUTES ");

   double  user_minutes = my_minutes.nextDouble();

    double minutes_in_year= 60*24*365;


    long year= (long)(user_minutes/minutes_in_year);

    int days= (int)(user_minutes/60/24)% 365;

    System.out.println((int) user_minutes+ "minutes approximately" + " " +  year + " " + "years" + " " +  days+ " " + "days");

    // 


    
    
  }
}