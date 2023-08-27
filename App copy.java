
import java.util.*;

import javax.sound.sampled.SourceDataLine;

class Vehicle
{
  private int speed;

  public void speedUp()
  {

    //incrementing the speed by 10

    speed+=10;

  }

  public int getSpeed()
  {
    return speed;
  }
}

class Car extends Vehicle{

  public void speedUp()
  {
    super.speedUp();
     System.out.println(" the car speed is increased by   22 units:");

  }


}


class Motorcycle extends Vehicle{

  public void speedUp()
  {

    super.speedUp();

    System.out.println("Motorcycle speed is incresed by 12 units ");

  }
}

 class Bankaccount
 {
          int initialbalance;
          String Name;

          int balance;

          int Withdraw;

          int Amount;

          int Accountnumber;

        

 }
 //  inheritance 

 class Accountnumber extends Bankaccount
 {


  public int getAccountnumber()
  {
    return Accountnumber;
  }

  
 }


 class Name extends Bankaccount
 {

      

      public String   getName()
      {
        
        

            return Name;
      

      }

      public  int  getBalance()
      {
        return balance;
      }

      
 }

 class Withdraw extends Bankaccount
 {

  

     public int getWithdraw()
     {
      
        

       return Withdraw;
     }

     
 }

 class Flight
 {

  String Flightnumber;

  String Origin;

  String Destination;

  String  Arrivaltime;

  String Delaytime;

   String Departuretime;

   String Schedulearrival;

 }
 //inheritance 

 class Flightnumber extends Flight
 {

    public  String  getFlightnumber()
    {

      return Flightnumber;

    }

 }

 class Origin extends Flight
 {

  public String getOrigin()
  {

    return Origin;
  }
 }

 class Destination extends Flight
 {

 public String getDestination()
  {
    return Destination;
  }

 }

 class Arrivaltime extends Flight
 {

  public  String  getArrivaltime()
  {
    return Arrivaltime;
  }
 }

 class Departuretime extends Flight
 {

  public  String  getDeparturetime()
  {
    return Departuretime;

  }
 }

 class Delaytime extends Flight
 {

  public  String  getDelaytime()
  {
    return Delaytime;
  }
 }

 class Schedulearrival extends Flight
 {
    public String  getSchedulearrival()
    {

      return Schedulearrival;
    }
 }




// creating the main class

public class App
{

  public static void main(String [] args )
  {


    //creating object  f in class Flightnumber

    Flightnumber f= new Flightnumber();

    f.Flightnumber="AIRIN3405";

    System.out.println("The flightnumber is " + " " + f.getFlightnumber());

    // creating object o in class origin

    Origin o= new Origin();

    o.Origin="NEW DELHI";

    System.out.println("THE ORIGIN OF THE Flightnumber" + " " + f.getFlightnumber() + " " +  "is" + " " + o.getOrigin());


    // creating object d in class destination

    Destination d= new Destination();

    d.Destination="KOLKATA";

    System.out.println("THE DESTINATION OF THE Flightnumber" + " " + f.getFlightnumber() + " " +  "is" + " " + d.getDestination());

// creating object a in class arrivaltime

Arrivaltime a= new Arrivaltime();

a.Arrivaltime="9:00 " ;

System.out.println("The arrival time of the flightnumber " + " " + f.getFlightnumber() +" " + " " + "is" + " " + a.getArrivaltime());


// creating object d1 in class departure time 

Departuretime d1= new Departuretime();

d1.Departuretime="6:00 ";

System.out.println("The Departure  time of the flightnumber " + " " + f.getFlightnumber() +" " + " is " + " " + d1.getDeparturetime());

//creating object s in class schedulearrival

Schedulearrival s= new Schedulearrival();

s.Schedulearrival="7:00";

System.out.println("The schedulearrival  time of the flightnumber " + " " + f.getFlightnumber() +" " + " is " + " " + s.getSchedulearrival());


 // creating obj d2 in class delaytime 

 
  
 //int final1_= Integer.parseInt(a.Arrivaltime)-Integer.parseInt(s.Schedulearrival);

 // System.out.println("THE DELAYTIME IS " + " " + "PRINT:" + final1_);

  // creating object name in class name

  Name n1 = new Name();


  n1.Name="SUBHAM SARKAR";


n1.balance= 145000;



  System.out.println("the name of the account holder is " + " " + n1.getName());

  System.out.println("Your   account balance is " + " " + "Rs " + ":"+ n1.getBalance());

  // creating object withdraw in class withdraw



  Withdraw w1= new Withdraw();

  w1.Withdraw=26000;

  if(n1.getBalance()>w1.getWithdraw())
  {
       
    System.out.println("PLEASE COLLECT YOUR CASH" + " " + "Rs" + ":" +  w1.getWithdraw());


  }

  else if(n1.getBalance()<w1.getWithdraw())
  {
    System.out.println("NOT SUFFICIENT BALANCE ");
  }

  // creating object a1 in class accountnumber 

  Accountnumber a1= new Accountnumber();

  a1.Accountnumber=345643890;

  System.out.println("The accountnumber is " + " " + ":" + a1.getAccountnumber());







   // creating object car in class car

   Car car= new  Car();
    
   // creating object motorcycle in class motorcycle


   Motorcycle motorcycle = new Motorcycle();

   System.out.println("Car initial speed " + " " + car.getSpeed());

   System.out.println("Motorcycle initial speed " + " " + motorcycle.getSpeed());

   car.speedUp();
   motorcycle.speedUp();

   System.out.println("Car speed after speed up" + " " + car.getSpeed());
   System.out.println("the speed of the motorcycle" + " " + motorcycle.getSpeed());
}
}


#output



The flightnumber is  AIRIN3405
THE ORIGIN OF THE Flightnumber AIRIN3405 is NEW DELHI
THE DESTINATION OF THE Flightnumber AIRIN3405 is KOLKATA
The arrival time of the flightnumber  AIRIN3405  is 9:00 
The Departure  time of the flightnumber  AIRIN3405  is  6:00 
The schedulearrival  time of the flightnumber  AIRIN3405  is  7:00
the name of the account holder is  SUBHAM SARKAR
Your   account balance is  Rs :145000
PLEASE COLLECT YOUR CASH Rs:26000
The accountnumber is  :345643890
Car initial speed  0
Motorcycle initial speed  0
 the car speed is increased by   22 units:
Motorcycle speed is incresed by 12 units 
Car speed after speed up 10
the speed of the motorcycle 10
