
//import java.util.*;




class Rectangle 
{

  int  height;

  int  width;

  int  area;

  int  perimeter;



  public int   getArea()
  {

    area =height*width;

     
    System.out.println(area);

    return area ;


    


  }


  public  int   getPerimeter()

  {

    perimeter=2*(height+width);

    System.out.println(perimeter);

    return perimeter;


    

  }
}

class Circle  
{
 double    radius;

  double   area;

   double  perimeter;




    public double  getArea()
    {

       area= 3.14* radius* radius;

       System.out.println(area);

       return area;

    }

    public double getPerimeter()
    {

      perimeter= 2*3.14*radius;

      System.out.println(perimeter);

      return perimeter;

    }

}

class Triangle 
{

  int area;
  int s1;
  int s2;
  int s3;
  int perimeter;
  int height;



  public int getArea()
  {

    area= (height*s3)/2;

    System.out.println(area);

    return area;



  }

  public int getPerimeter()
  {

    perimeter= s1+s2+s3;

    System.out.println(perimeter);

    return perimeter;

  }




}

public class Ps8
{

  public static void main(String[] args)
  {
      
    Rectangle r1= new Rectangle();

    Circle c1= new Circle();

    Triangle t1= new Triangle();



    r1.height=5;

    r1.width=6;

    c1.radius=8;
    
    t1.s1=4;

    t1.s2=5;

    t1.s3=6;

    t1.height=8;



    System.out.print("the area of the rectangle is " + " ");

    r1.getArea();

    System.out.print("the perimeter of the rctangle is " + " ");

    r1.getPerimeter();

   

    

    System.out.print("the area of the circle is " + " ");

    c1.getArea();

    System.out.print("the perimeter of the circle is " + " ");

    c1.getPerimeter();

    System.out.print("the area of the triangle is " + " ");

    t1.getArea();

    System.out.print("the perimeter of the triangle is " + " ");

    t1.getPerimeter();


  }
}




