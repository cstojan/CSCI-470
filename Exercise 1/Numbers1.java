import java.util.Scanner;

/********************************************************************
 *                                                                  *
 *  CSCI 470-1/502-1       In-Class Exercise 1         Summer 2019  *
 *                               Part 1                             *
 *                                                                  *
 *  Class Name:  Numbers1                                           *
 *                                                                  *
 *  Programmer:  Cory Stojan                                        *
 *                                                                  *
 *  Purpose:     A console program that displays the sum, product,  * 
 *               difference and division quotient of two numbers.   *
 *                                                                  *
 ********************************************************************/ 

public class Numbers1 
{
  public static void main(String[] args) 
  {
    int num1, num2;

    Scanner sc = new Scanner(System.in);

    // Read the first number.
    System.out.println("Enter the first number: ");
    num1 = sc.nextInt();

    // Read the second number.
    System.out.println("Enter the second number: ");
    num2 = sc.nextInt();

    // Compute and print the sum.
    System.out.println("Sum is:" + (num1 + num2));
    
    // Compute and print the product
    System.out.println("\nThe Product is: " + (num1 * num2));
    
    // Comput and print the Diffrence
    System.out.println("\nThe Diffrence is: " + (num1 - num2));
    
    // Comput and print the quotent
    System.out.println("\nThe quotient is: " + ((double)num1 / num2));
    
  }
}
