//write a java program to reverse a string  using inbuilt function
import java.util.*;

public class Ps1
{


  public static void main(String[] args)
  {

    String str="SUBHAM ";

    System.out.println("the string is " + str);


    StringBuilder str1= new StringBuilder();

    str1.append(str);


    str1=str1.reverse();

    System.out.println("the reversed string is  " + str1);
    
  }
}