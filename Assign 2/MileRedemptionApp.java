/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2       Assignment 2        Summer 2019  *
 *                                                          *
 *  Class Name:  MileRedemptionApp                          *
 *                                                          *
 *  Programmer:  CORY STOJAN                                *
 *                                                          *
 *  Purpose: driver class fore the MileRedemption App       *
 *                                                          *
 ************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MileRedemptionApp 
{
  public static void main(String[] args) throws IOException 
  {
    // Class variables;
    char more = 'y';
    int departMon, curMiles;
    String fileName = " ";
    String[] destLocation;
    
    // mileredeemer used for later
    MileRedeemer mile = new MileRedeemer();
    
    // Find File
    System.out.print("Please enter the name of the file: ");
    Scanner scan = new Scanner(System.in);
    fileName = scan.nextLine();
    File file = new File(fileName);
    Scanner newFile = new Scanner(file);
    String[] cityNames;
    // read destionation info
    mile.readDestinationInfo(newFile);
    
    // Welcome message
    System.out.println("----------------------------------------------------------------");
    System.out.println("WELCOME TO THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP");
    System.out.println("----------------------------------------------------------------\n");
    
    // List all cities you can travel to.
    System.out.println("List of destination cities your client can travel to:\n");
    cityNames = mile.getDestinationNames();
    
    // list of destinations
    for(int i = 0; i < cityNames.length; i++){
       System.out.println(cityNames[i]);
    }
    System.out.println("\n----------------------------------------------------------------\n");
    
    // Calculate where the client can go
    while(more == 'y' || more == 'Y'){
      System.out.print("\nPlease enter your client's accumulated Frequent Flyer Miles: ");
      curMiles = scan.nextInt();
      System.out.print("\n");
      System.out.print("Please enter your client's month of departure (1-12): ");
      departMon = scan.nextInt();
      System.out.print("\n");
      destLocation = mile.redeemCustomerMiles(curMiles, departMon);
    
      // Display if they dont have enough miles
      if(destLocation.length == 0){
        System.out.println("*** Your client has not accumulated enough Frequent Flyer Miles ***");
      }
      else
      {
        for(int i = 0; i < destLocation.length; i++)
        {
          System.out.println(destLocation[i]);
        }
      }
      System.out.println("\nYour client's remaining Frequent Flyer Miles: " + mile.getLeftoverMiles());
      System.out.println("\n----------------------------------------------------------------\n");
      // ask if they want to enter diffrent miles
      System.out.print("Do you wish to continue (y/n)? ");
      more = scan.next().charAt(0);
    }
    System.out.println("\n------------------------------------------------------------------------");
    System.out.println("THANK YOU FOR USING THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP");
    System.out.println("-------------------------------------------------------------------------");
    
  }
 
}//   Destinations.txt