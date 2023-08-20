
import java.util.*;

class Employee
{

  String nameoftheemployee;

  String postoftheemployee;

   int  salaryoftheemployee;


  public String getNameoftheemployee()
  {

  

     System.out.println(this.nameoftheemployee);

     return nameoftheemployee;

      

  }


  public String getPostoftheemployee()
  {

    System.out.println(this.postoftheemployee);

    return postoftheemployee;



  }


  public double getSalaryoftheemployee()
  {


    System.out.println(this.salaryoftheemployee);

    return salaryoftheemployee;
  }
}


  public class Ps6
  {


    public static void main(String [] args)
    {


      Employee emp1= new Employee();

      Employee emp2= new Employee();


      emp1.nameoftheemployee="SUBHAM SARKAR";

      emp1.postoftheemployee="SOFTWARE DEVELOPMENT ENGINEER";

      emp1.salaryoftheemployee=150000;


      emp2.nameoftheemployee="ATRAYEE SANYAL";

      emp2.postoftheemployee="ASISTANT SDE";

      emp2.salaryoftheemployee=90000;

    System.out.println("NAME OF THE EMPLOYEE" +  " " + emp1.getNameoftheemployee());

    System.out.println("POST OF THE EMPLOYEE" + " " +  emp1.getPostoftheemployee());

    System.out.println("SALARY " + " " +  emp1.getSalaryoftheemployee());

    System.out.println("NAME OF THE EMPLOYEE" + " " + emp2.getNameoftheemployee());

    System.out.println("POST OF THE EMPLOYEE" + " " + emp2.getPostoftheemployee());

      System.out.println("SALARY" + " " +  emp2.getSalaryoftheemployee());




      






    }
  }

     
  


