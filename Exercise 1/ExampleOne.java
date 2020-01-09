/*
 * block comments 
*/
/*
 * \t is a tab
 * if you need to print a backslash you do a double backslash
 * a double quote to get a quote
*/

import java.util.Scanner;  // importing only the scanner class
                           // be very specific with what you import

public class ExampleOne
{
  public static void main(String[] args)
  {
    
   // int firstNum;// comment
    int /*secondNum,*/ 
        sum;
    final double TAX_RATE = 0.075;
    double firstNum,
           secondNum,
           subTotal,
           salesTax,
           Total;
    //Variables
    double a,
           b,
           c;
    Scanner keyScan = new Scanner(System.in);
    
    
    // ready to prompt the user
    System.out.print("Please enter an intiger: ");
    //firstNum = keyScan.nextInt();
    firstNum = keyScan.nextDouble();
    
    // two ways to go to a new line,
    // 1) use /n
    // 2) include ln after print
    // next prompt
    System.out.print("\nPlease enter another intiger: ");
   // secondNum = keyScan.nextInt();
    secondNum = keyScan.nextDouble();
    
    subTotal = firstNum + secondNum;
    
    salesTax = subTotal * TAX_RATE;
    
    Total = subTotal + salesTax;
    // output
    //System.out.println("\n\nThe sum of " + firstNum + " and " + secondNum + " is " + sum + " \n\n");
    //System.out.println("\n\nThe subtotal is: " + Total);
    System.out.printf("The subtotal is:%.2f \n", Total);
                         
    
    //System.out.println(3 + 5 + 6  + " is the same as " + 3 + 5 + 6);
    
    
    
  }
}