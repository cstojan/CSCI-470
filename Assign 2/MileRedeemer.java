/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2       Assignment 2        Summer 2019  *
 *                                                          *
 *  Class Name:  MileRedeemer                          *
 *                                                          *
 *  Programmer:  CORY STOJAN                                *
 *                                                          *
 *  Purpose:  Workhorse of the MileRedemptionApp class.     *
 *                                                          *
 ************************************************************/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MileRedeemer
{
  Destination[] dest = new Destination[10];
  private int milesRemaining = 0;
  
  /************************************************************
 *                                                          *
 *  Method Name:  readDestinationInfo                       *
 *                                                          *
 *  Purpose:  Reads a file and stores input                 *
 *                into a Destination class                  *
 *                                                          *
 ************************************************************/
  public void readDestinationInfo(Scanner fileScanner) {
    // local variables
    int low = 0;
    String newDest = "";

    Destination newDestination = new Destination();
    ArrayList<Destination> destinationList = new ArrayList<Destination>();
    // create an instance of a MileageComparator
    MileageComparator lowest = new MileageComparator();

    // read file and store values
    while(fileScanner.hasNext()){

      // read file line and split up data
      newDest = fileScanner.nextLine();

      // split data
      String[] splitData = newDest.split(";");
      String[] splitDates = splitData[4].split("-");

      // store data
      newDestination.setDestinationCity(splitData[0]);
      newDestination.setMilesReq(Integer.parseInt(splitData[1]));
      newDestination.setFreqFlyMiles(Integer.parseInt(splitData[2]));
      newDestination.setUpgrageMiles(Integer.parseInt(splitData[3]));
      newDestination.setStartMonth(Integer.parseInt(splitDates[0]));
      newDestination.setEndMonth(Integer.parseInt(splitDates[1]));

      // add destionation to the list
     destinationList.add(new Destination(newDestination));
    }

    // sort the list
    Collections.sort(destinationList, new MileageComparator());

    // formant list to an array
    Destination[] destinationArray = (Destination[]) destinationList.toArray(new 
           Destination[destinationList.size()]);
    
    
    dest = destinationArray;
    
  }
  
  /************************************************************
 *                                                          *
 *  Method Name:  getDestinationNames                       *
 *                                                          *
 *  Purpose:  Gets destination names and sorts them in      *
 *              acending order                              *
 *                                                          *
 ************************************************************/
  public String[] getDestinationNames(){
    // local variables
    ArrayList<String> cityNames = new ArrayList<String>();
    
   
    
    // get city names in a string
    for(int i = 0; i < dest.length; i++){
      
      cityNames.add(new String(dest[i].getDestinationCity()));
    }
    // convert to an array
    String[] cityNamesArray = (String[]) cityNames.toArray(new 
           String[cityNames.size()]);
    // sort city names
    Arrays.sort(cityNamesArray);

    return cityNamesArray;
  }
  
  /************************************************************
 *                                                          *
 *  Method Name:  redeemCustomerMiles                       *
 *                                                          *
 *  Purpose:  Redeems a customers miles                     *
 *                                                          *
 ************************************************************/
  public String[] redeemCustomerMiles(int miles, int month){
    
    
    // array used for end result
    ArrayList<String> custMiles = new ArrayList<String>();

    // Temporary list for moving data
    ArrayList<Destination> temps = new ArrayList<Destination>();

    // Get all ticket possible starting with farthest
    for(int i = 0; i < this.dest.length; i ++) {
      int cost = 0;
      // If leaving in a month where getUpgrageMiles applies, apply discount
      if(month >= dest[i].getStartMonth() && month <= dest[i].getEndMonth()){
        cost = dest[i].getFreqFlyMiles();
      }
      else
        cost = dest[i].getMilesReq();

      // Add flight to temps if miles apply
      if(miles >= cost) {
        miles -= cost;
        temps.add(dest[i]);
        
      }
      
    }

    // Check for upgrades and format output
    for(int i = 0; i < temps.size(); i++) {
      // If can upgrade, do it
      if(miles > temps.get(i).getUpgrageMiles()) {
        miles -= temps.get(i).getUpgrageMiles();
        custMiles.add("* A trip to " + temps.get(i).getDestinationCity() + ", first class");
      }

      // Else here is a normal economy ticket
      else {
        custMiles.add("* A trip to " + temps.get(i).getDestinationCity() + ", economy class");
      }
    }

    // Set internal miles left
    this.milesRemaining = miles;
    
    // convert arraylist to array
    String[] result = (String[]) custMiles.toArray(new 
           String[custMiles.size()]);
    
    // return result.
    return result;
  }

  /************************************************************
 *                                                          *
 *  Method Name:  getLeftoverMiles                          *
 *                                                          *
 *  Purpose:  Returns the remaining miles                   *
 *                                                          *
 ************************************************************/
  public int getLeftoverMiles(){
    return this.milesRemaining;
  }
}