/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 4       Summer 2019  *
 *                                                          *
 *  Class Name:  ParkingGarage                              *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     Calculates a bill for number of hrs parked *
 ************************************************************/ 
import java.text.DecimalFormat;
import java.util.Scanner;


public class ParkingGarage
{
  public static double calculateCharges(String customer, double hrs)
  {
    if (hrs <= 3.00)
      return 2;
    else 
      return 2 + ((hrs - 3) * .5);
  }
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    DecimalFormat billFormat = new DecimalFormat("$#0.00");
    
    double totalCharge;
    String name;
    double numHrsParked;
    
    System.out.print("\nEnter Name of person: ");
    name = sc.nextLine();
    System.out.print("\nEnter number of hours parked: ");
    numHrsParked = sc.nextDouble();
    totalCharge = calculateCharges(name, numHrsParked);
    
    if(totalCharge > 10.00)
      totalCharge = 10.00;
    
    System.out.printf("Total = %5s", billFormat.format(totalCharge));
  }
}