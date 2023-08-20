
import java.util.*;



public class Ps9
{

  public static void main(String[] args)
  {

    ArrayList<String> list= new ArrayList<String>();

    list.add("I");
    list.add("am");
    list.add("subham");
    list.add("sarkar");

    System.out.println(list);

    for(int i=0;i<list.size();i++)
    {
      System.out.println(list);
    }

    for(String element : list)
    {
      System.out.println(element);
    }


    ArrayList<String> s2= new ArrayList<String>();

    s2.add("MY");

    s2.add("ÇOMPANY");

    s2.add("NAME ");

    s2.add("IS");

    s2.add("SUBHAM EXPORTS AND IMPORTS :");

    System.out.println(s2);

    System.out.println("is the list empty" +  " " + s2.isEmpty());

    s2.removeAll(s2);

    System.out.println(s2);


    System.out.println("is the list empty" + " " +  s2.isEmpty());



    List<String> s0= new ArrayList<String>();


    s0.add("A");

    s0.add("B");

    s0.add("c");

    s0.add("D");


    System.out.println("the list is " + " " + s0);


    List<String> s3= new ArrayList<String>();

    s3.add("3");

    s3.add("4");

    s3.add("10");

    s3.add("5");

   
    System.out.println("after copying the items are " + " " + s0);

    System.out.println("the list is " + " " + s3);

    System.out.println("the list before copy is " + " " + s0 + " " + s3);

    //copy element from one list to another 

    Collections.copy(s0,s3);

    System.out.println("after copying the items are " + " " + s0 + " " + s3);

    System.out.println("after copying the items are " + " " + s3);

    System.out.println("the list is " + " " + s0);


    //remove the third element from the list 

    List<String> L1= new ArrayList<String >();

    L1.add("0");

    L1.add("8");

    L1.add("5");

    L1.add("7");

   for(String elements: L1)
   {

    System.out.println(elements);
   }

   L1.remove(2);

   System.out.println("AFTER REMOVING THE THIRD ELEMENT FROM THE LIST THE LIST WILL BE :");

   for(String elements: L1)
   {

    System.out.println(elements);
   }

    L1.add("HELLO");

    L1.add("MYSELF");

    L1.add("SUBHAM");

    L1.add("SARKAR");


    //sorting a list

    Collections.sort(L1);

    System.out.println("the sorted list is as follows" + " " + L1);

    //reverse a list

    Collections.reverse(s3);

    System.out.println("the reversed list is " + " " + s3) ;


    // to extract a portion from a arraylist



    System.out.println("the extracted part is " + " " + s3.subList(0, 2));

    //to swap two elements of an arraylist

    System.out.println("before swapping the list is ");

    for(String element :s3)
    {

        System.out.println(element);
    }

    Collections.swap(s3, 0, 2);




    System.out.println("after swapping the swapped list is");

      for(String element :s3)
    {

        System.out.println(element);
    }


    












    


  }
}