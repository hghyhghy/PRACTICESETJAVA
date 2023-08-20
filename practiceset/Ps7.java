

import java.util.*;

class Flight
{

  String  flightnumber;

  String destination;

  String delaytime;

  String origin;

  String scheduledeparture ;

  String checkstatus;
  
  int time;





  public  void  getFlightnumber()

  {

    System.out.println(this.flightnumber);

    return ;

  }

  public  void  getDestination()
  {
    System.out.println(this.destination);

    return;

  }

  public void  getScheduledeparture()
  {

    System.out.println(this.scheduledeparture);

    return ;

  }


  public void  getDelaytime()
  {

    if(time==0)
    {

      System .out.println("FLIGHT IS ON TIME :" + flightnumber);
    }

    else{

      System.out.println("FLIGHT DELAYED BY :" + flightnumber);
    }

    return ;

  }

  public  void getCheckstatus()
  {

  System.out.println(this.checkstatus);

  return ;

  }

  public  void  getOrigin()
  {

    System.out.println(this.origin);

    return ;


  }

}

public class Ps7
{

  public static void main(String [] args)
  {

  

  Flight f1= new Flight();


  Flight f2= new Flight();


  

   f1.flightnumber="AIRIN-23";

   f1.origin="KOLKATA";

   f1.destination="CHENNAI";

   f1.scheduledeparture="9:30 am";

   f1.checkstatus="FLIGHT IS ON TIME ";


   


   System.out.println("ANNOUNCEMENT ! FOR FLIGHT FROM KOLKATA TO CHENNAI:");

   System.out.print("THE FLIGHT NUMBER  :" + " ");

   f1.getFlightnumber();

   System.out.print("ORIGIN AIRPORT ! TERMINAL A1-A10:" + " ");

   f1.getOrigin();

   System.out.print("TERMINATING AIRPORT ! TERMINAL B23:" + " ");

   f1.getDestination();

   System.out.print("THE FLIGHT  IS SCHEDULED FOR DEPARTURE AT  :  " + " ");
    
   f1.getScheduledeparture();

   System.out.print("THE CURRENT STATUS OF THE FLIGHT IS :" + " ");

   f1.getCheckstatus();



   f2.flightnumber="BOEING-A277";

   f2.origin="INDIRA GANDHI INTERNATIONL AIRPORT :NEW DELHI";

   f2.destination="NETAJI SUBHAS INTERNATIONAL AIRPORT : KOLKATA";

   f2.checkstatus="40 MINUTES LATE ! expected landing at 11:00 am ";

   System.out.println("ANNOUNCEMENT ! FOR FLIGHT FROM DELHI TO KOLKATA:");


   System.out.print("THE FLIGHT NUMBER  :" + " ");

   f2.getFlightnumber();

   System.out.print("ORIGIN AIRPORT ! TERMINAL A1-A10:" + " ");

   f2.getOrigin();

   System.out.print("TERMINATING AIRPORT ! TERMINAL B23:" + " ");

   f2.getDestination();

   System.out.print("THE CURRENT STATUS OF THE FLIGHT IS :" + " ");

   f2.getCheckstatus();



  
  
  }
}