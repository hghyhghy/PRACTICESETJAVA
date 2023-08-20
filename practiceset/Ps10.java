//java program to iterate through a linked list in a reversed order 


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;



public class Ps10
{

  public static void main(String [] args)

{

     LinkedList<String> L1= new LinkedList<String> ();


     L1.add("HELLO");

     L1.add("I");

     L1.add("AM");

     L1.add("SUBHAM");

     L1.add("SARKAR");

    System.out.println("the printed list is ");

    for(String element : L1)
    {

      System.out.println(element) ; 
    
    }

    System.out.println("now the linkedlist in reversed order is ");

  System.out.print(  L1.descendingIterator());

  //concatenate two strings 


  String str1="HELLO MYSELF SUBHAM SARKAR";

  String str2= "I CAN HACK YOUR SYSTEM ";

  System.out.println("the two strings are as follows");

  String str3= str1.concat(str2);

  System.out.println(str3);

  //compare a string with a specific string buffer

  String st1= "Example.com";

  String st2="example.com";

  StringBuffer strbuf= new StringBuffer(str1);


  System.out.println("Comparing "+str1+" and "+strbuf+": " + str1.contentEquals(strbuf));
    
    System.out.println("Comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));
    




    // program to print current date and time 

    LocalDate date= LocalDate.now();

    System.out.println("THE CURRENT DATE IS " + " " + date);

    LocalTime time= LocalTime.now();

    System.out.println("the current time is " + " " + time );

    //hascode for a string 

    String password= "AbeDDF";

    int hash_code= password.hashCode();

    System.out.println("the hashcode of the password is " + " " + hash_code);








    


      
 }

  







   

 }  

