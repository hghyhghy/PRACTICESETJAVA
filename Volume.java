import java.util.*;
class Cube
{
       int v;
       int side;

       public void  getVolume()

       {

              v=side*side*side;

              System.out.println(this.v);

              return;

       }
}


class Circle
{
   int r;

   double circlevolume;

   public void  getCirclevolume()

   {
       circlevolume=(4*3.14*r*r*r)/3;

       System.out.println(this.circlevolume);

       return;
   }
}

class Cylinder
{

       int h;

       int r;

       double cylindervolume;

       public void  getCylindervolume()

       {
             cylindervolume=3.14*r*r*h;

             System.out.println(this.cylindervolume);

             return;

       }


}

public class Volume
{
     public static void main(String[] args )

     {

       Cube c= new Cube();


       c.side=5;

       System.out.println("the volume of cube is ");


       c.getVolume();

       Circle c1= new Circle();

       c1.r=7;

        System.out.println("the volume of the circle is ");

        c1.getCirclevolume();

        Cylinder cy= new Cylinder();

        cy.r=5;

        cy.h=6;

        System.out.println("The volume of the cylinder is ");

        cy.getCylindervolume();
        



       
     }


}