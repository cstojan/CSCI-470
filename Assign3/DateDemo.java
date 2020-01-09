/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2       Assignment 3        Summer 2019  *
 *                                                          *
 *  Class Name:  DateDemo                                   *
 *                                                          *
 *  Programmer:  CORY STOJAN                                *
 *                                                          *
 *  Purpose:  Tests the Date class                          *
 *                                                          *
 ************************************************************/
import java.util.Scanner;

public class DateDemo
{
  public static void main(String[] args)
  {
    int day, month, year;
    day = 0;
    month = 0;
    year = 0;
    char agian = 'y';
    Scanner scan = new Scanner(System.in);
    
    while(agian == 'y' || agian == 'Y'){
      System.out.println("Current Day Of The Year App!");
      System.out.print("Enter the Day of the year (1-31): ");
      day = scan.nextInt();
      System.out.print("\nEnter the month of the year (1-12): ");
      month = scan.nextInt();
      System.out.print("\nEnter the year number (####): ");
      year = scan.nextInt();
      
      // Date Object
      Date date1 = new Date(day, month, year);
      
      // Test the Constructor
      System.out.println("The day is: " + date1.getMonth() + " " + date1.getDay() + 
                         ", " + date1.getYear());
      // Test the daysSinceJan1 method
      System.out.println("Days between January 1st and now = " + date1.daysSinceJan1() + " day(s)!");
      System.out.println("\nAgian? (y/n)");
      agian = scan.next().charAt(0);
      System.out.println("\n");
    }
    System.out.println("Goodbye!");
  }
}