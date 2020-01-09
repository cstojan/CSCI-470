/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2       Assignment 3        Summer 2019  *
 *                                                          *
 *  Class Name:  USMoneyDemo                                *
 *                                                          *
 *  Programmer:  CORY STOJAN                                *
 *                                                          *
 *  Purpose:  Tests the USMoney class                       *
 *                                                          *
 ************************************************************/
import java.util.Scanner;

public class USMoneyDemo
{
  public static void main(String[] args)
  {
    int dollars1, cents1, dollars2, cents2;
    char agian = 'y';
    Scanner scan = new Scanner(System.in);
    
    while(agian == 'y' || agian == 'Y'){
      System.out.print("Enter number of dollars for first class: ");
      dollars1 = scan.nextInt();
      System.out.print("\nEnter number of cents for first class: ");
      cents1 = scan.nextInt();
      System.out.print("Enter number of dollars for second class: ");
      dollars2 = scan.nextInt();
      System.out.print("\nEnter number of cents for second class: ");
      cents2 = scan.nextInt();
      //                       dollars, cents
      USMoney money1 = new USMoney(dollars1, cents1);
      USMoney money2 = new USMoney(dollars2, cents2);
      USMoney result = new USMoney(dollars2, cents2);
      System.out.println("Class 1 Dollars = " + money1.getDollars());
      System.out.println("Class 1 Cents = " + money1.getCents());
      System.out.println("Class 2 Dollars = " + money2.getDollars());
      System.out.println("Class 2 Cents = " + money2.getCents());
      
      System.out.print("Money1 Plus Money2 = ");
      result = money1.plus(money2);
      System.out.println(result.getDollars() + " Dollars and " + result.getCents() + " cents");
    
      System.out.println("\nAgian? (y/n)");
      agian = scan.next().charAt(0);
      
    }
    System.out.println("Goodbye!");
  }
}