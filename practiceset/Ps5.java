


import java.util.*;

class Rectangle
{

       int  width;

       int  height;

       int area;

       int  perimeter;

      int tempArea;
       
      int tempPeri;



                                  public void getWidth()
                                  {

                                    System.out.println(this.width);

                                  }


                                  public void getHeight()
                                  {

                                    System.out.println(this.height);
                                  }


                                  


                                  public int  getArea()
                                  {
                                      
                                     int tempArea= width*height;


                                    System.out.println( tempArea);

                                    return tempArea;


                                  }


                                  public int getPerimeter()
                                  {
                                          
                                     int tempPeri =2*(width+height);


                                    System.out.println(tempPeri);

                                    return tempPeri;


                                  }
                                }



                            public class Ps5
                            {

                                     public static void main(String [] args)
                                     {
                                             

                                            //creating object rec1 in class rectangle

                                 

                                           Rectangle rec1= new Rectangle();


                                           rec1.width= 4;

                                           rec1.height=5;


                                         System.out.println("the area  of the rectangle is " + rec1.getArea());

                                         System.out.println( "the perimeter of the rectangle is " + rec1.getPerimeter());


                                           


                                     }

                            }      
                                  



                                


