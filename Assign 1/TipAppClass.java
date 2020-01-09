/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2       Assignment 1        Summer 2019  *
 *                                                          *
 *  Class Name:  TipAppClass                                *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     Calculates a tip for a bill and divides    *
 *               it evenly between all party members.       *
 *               Displays Results at bottom on output.      *
 ************************************************************/ 
// Imported classes used later.
import java.text.DecimalFormat;
import java.util.Scanner;

// Class TipAppClass
public class TipAppClass
{
  static void calculateTips(){

    // Step 1, Create an Instinance of the TipCalculator
    TipCalculator billTot = new TipCalculator();
    Scanner scan = new Scanner(System.in);
    DecimalFormat billFormat = new DecimalFormat("$##,##0.00");
    DecimalFormat tipFormat = new DecimalFormat("#0");
    DecimalFormat partyFormat = new DecimalFormat("##0");

    // VAriables
    double bill = 0.00;
    int partySize = 0,
        tipPercent = 0;
    boolean correct = false;

    // Step 2 Ask for Bill and store value
    while(correct == false){
      System.out.print("Enter Bill Amount: ");
      
      if(!scan.hasNextDouble()){
        scan.next();
        System.out.print("Please enter a valid bill.\n\n");
      }
      else{
        bill = scan.nextDouble();
        if(bill > 0)  
          correct = true;
        else
        {
          System.out.print("Please enter a valid bill.\n\n");
        }
      }
    }
    billTot.setBill(bill);
    System.out.print(billTot.getBill() + "\n");

    // Step 3 Ask for Tip and store value
    correct = false;
    while(correct == false){
      System.out.print("\nEnter your desired tip percentage (20 equals 20%): ");
      
      if(!scan.hasNextInt()){
        scan.next();
        System.out.print("Please enter a valid tip percentage.\n");
      }
      else{
        tipPercent = scan.nextInt();
        if(tipPercent >= 0)  
          correct = true;
        else
        {
          System.out.print("Please enter a valid tip percentage.\n");
        }
      }
    }
    billTot.setTip(tipPercent);
    System.out.print(billTot.getTip() + "\n");

    // Step 4 Ask for Party Size and store value
    correct = false;
    while(correct == false){
      System.out.print("\nEnter the size of your party: ");
      
      if(!scan.hasNextInt()){
        scan.next();
        System.out.print("Please enter a valid party size.\n");
        
      }
      else{
        partySize = scan.nextInt();
        if(partySize > 0)  
          correct = true;
        else
        {
          System.out.print("Please enter a valid party size.\n");
        }
      }
    }
    billTot.setPartySize(partySize);
    System.out.print(billTot.getPartySize() + "\n");
    
    // Output Bill
    System.out.print("\n\n*** Your Bill ***\n");
    System.out.printf("\nBill Amount: (Without Tip): %11s", billFormat.format(billTot.getBill()));
    System.out.printf("\nTip Percentage:                    %3s", tipFormat.format(billTot.getTip()));
    System.out.print("%");
    System.out.printf("\nParty Size:                         %3s", partyFormat.format(billTot.getPartySize()));
    System.out.printf("\nTotal Bill (With Tip):      %11s", billFormat.format(billTot.getTotalBill()));
    
    // Calculate and Display Individual Portion
    if(billTot.getPartySize() > 1)
      System.out.printf("\nShare for Each Individual:  %11s", billFormat.format(billTot.getIndividualShare()));
  }
  
  // Main
 public static void main(String[] args)
  {
   // main Variables
   char redo = 'n';
   
   // Title
   System.out.print("*** Tip Calculator ***\n\n");
   do{
     // scanner used for redo variable
     Scanner scan = new Scanner(System.in);
     
     // Calcualte Bill
     calculateTips();
   
     // Ask for another Bill y/n
     System.out.print("\n\nAnother bill? (y/n): ");
     redo = scan.next().charAt(0);
     scan.close(); // close scanner
   }while(redo == 'y' | redo == 'Y');
   
   // If n then exit
   System.out.print("\n\nGoodbye!\n");
 }
}