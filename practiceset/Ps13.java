


import java .util.*;

//import java.util.Calendar;




//java program to enter a element at the last of the list

public class Ps13
{

  public static void main(String [] args )
  {

      LinkedList<String> my_list= new LinkedList<String> ();

      my_list.add("GREEN");

      my_list.add("YELLOW");

      my_list.add("BALCK");

      my_list.add("WHITE");


      // entering an element yellow at the last of the list


      System.out.println("THE LIST IS AS FOLLOWS");

     for(String element: my_list )
     {

      System.out.println(element);
     }


      my_list.offerLast("PINK");


      System.out.println("NOW THE UPDATED LIST IS AS FOLLOWS ");


      for(String element : my_list)
      {

        System.out.println(element);
        
      }



      // entering an element at the front of the linked list


      LinkedList<Integer> mylist= new LinkedList<Integer >();


      mylist.add(2);

      mylist.add(5);

      mylist.add(7);

      mylist.add(9);

      System.out.println(" THE NUMBERS ARE AS FOLLOWS");


       for (int  element : mylist)
       {


         System.out.println(element);
       }


       mylist.offerFirst(0);

       System.out.println("AFTER UPDATING THE LISTS ARE");

       for(int element : mylist)
       {

        System.out.println(element);
       }


       // write a program to insert an element at the first and the last of the linked list


       LinkedList<Integer> my_list1= new LinkedList<Integer>();


       my_list1.add(67);

       my_list1.add(56);

       my_list1.add(80);

       my_list1.add(90);

       my_list1.add(50);


       System.out.println("first the newly printed linked list is ");

       for(int  element : my_list1)
       {


        System.out.println(element);
       }


       my_list1.addFirst(0);
       
       my_list1.addLast(100);


       System.out.println("after updating the list becomes ");


       for(int  elements : my_list1)
       {

        System.out.println(elements);
       }



       // print the list and element number at a same time of a linkedlist



       LinkedList <String> my_list2=  new LinkedList<String>();


       my_list2.add("HELLO");

        my_list2.add("I ");


         my_list2.add("AM");

          my_list2.add("SUBHAM ");


           my_list2.add("SARKAR");


           System.out.println("my_list2");


           for(int i=0; i<my_list2.size(); i++)
           {

            System.out.println("the elements are " + i+ ":" + my_list2.get(i));
           }

           // check wheather a particular element exist or not


           LinkedList<Integer> l3= new LinkedList<>();


           l3.add(0);

           l3.add(6);

           l3.add(9);

           l3.add(78);


           if(l3.contains(80))
           {

                 System.out.println("the element (80) is present in the list:" );

           }

           else{

            System.out.println("the element  (80)  is not present in the list:");
           }



           if(l3.contains(0))
           {

                    System.out.println("the element (0) is present in the list:");
           }


           else{


            System.out.println("the element (0) is not present in the list:");
           }

                   // converting an  linkedlist into an arraylist



                   LinkedList<String> l4= new LinkedList<String>();


                   l4.add("HI");

                   l4.add("I ");

                    l4.add(" AM ");

                     l4.add("SUBHAM SARKAR");


                      System.out.println("the list is as follows " + " " + l4);


                      List <String> list = new ArrayList<>(l4);

                      for(String element :  list)
                      {


                        System.out.println(element );
                      }



                      // write a java program to empty a hashset 



                      HashSet<Integer> my_hash=  new HashSet<Integer>();


                      my_hash.add(0);

                      my_hash.add(4);

                      my_hash.add(6);

                      my_hash.add(90);

                      System.out.println("the list of the hashcode is as follows ");

                      for(int el1: my_hash)
                      {

                        System.out.println( el1);
                      }

                      my_hash.removeAll(my_hash);

                      System.out.println("now the elements are :");

                      for(int el1: my_hash)
                      {

                        System.out.println( el1);
                      }




                   // convert hasmap to array


                   HashSet<String> my_hash0= new HashSet<String> ();

                   my_hash0.add("0");

                   my_hash0.add("67");

                   my_hash0.add("7");

                   my_hash0.add("0");

                   my_hash0.add("8");

                  

                  
                   System.out.println(my_hash0);

                   String [] my_array=  new String [my_hash0.size()];


                   my_hash0.toArray(my_array);

                   System.out.println("now the elements of the array are ");

                   for(String ele: my_array)
                   {

                    System.out.println(ele);
                   }

                   // convert hashset to tree set 


                   
                   HashSet<String> my_hash1= new HashSet<String> ();

                   my_hash1.add("0");

                   my_hash1.add("67");

                   my_hash1.add("7");

                   my_hash1.add("0");

                   my_hash1.add("8");


                   System.out.println(my_hash1);


                   Set<String> tree_set= new TreeSet<>(my_hash1);


                   System.out.println("now the tree set of the hashset is as follows ");


                   for(String  ele: tree_set )
                   {

                    System.out.println(ele);
                   }


                   



 
                  




  }
}











OUTPUT:



THE LIST IS AS FOLLOWS
GREEN
YELLOW
BALCK
WHITE
NOW THE UPDATED LIST IS AS FOLLOWS
GREEN
YELLOW
BALCK
WHITE
PINK
 THE NUMBERS ARE AS FOLLOWS
2
5
7
9
AFTER UPDATING THE LISTS ARE
0
2
5
7
9
first the newly printed linked list is
7
8
[0, 67, 7, 8]
now the tree set of the hashset is as follows
0
67
7
8
