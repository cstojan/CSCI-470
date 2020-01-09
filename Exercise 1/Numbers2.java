import java.util.Scanner;

/********************************************************************
 *                                                                  *
 *  CSCI 470-1/502-1       In-Class Exercise 1         Summer 2019  *
 *                               Part 1                             *
 *                                                                  *
 *  Class Name:  Numbers2                                           *
 *                                                                  *
 *  Programmer:  Cory Stojan                                        *
 *                                                                  *
 *  Purpose:     A console program that displays the sum, product,  * 
 *               difference and division quotient of two numbers.   *
 *                                                                  *
 ********************************************************************/ 

public class Numbers2 
{
  public static void main(String[] args) 
  {
    double num1, num2;

    Scanner sc = new Scanner(System.in);

    // Read the first number.
    System.out.println("Enter the first number: ");
    num1 = sc.nextDouble();

    // Read the second number
    System.out.println("Enter the second number: ");
    num2 = sc.nextDouble();
    
    // If both numbers are equal
    if(num1 == num2){
     System.out.println("\nThe two numbers are equal!"); 
    }
    
    // if num1 > num2
    if(num1 > num2){
     System.out.println("\nThe larger number is: " + num1); 
    }
    
    // if num2 > num1
    if(num2 > num1){
     System.out.println("\nThe larger number is: " + num2); 
    }
  }
}
