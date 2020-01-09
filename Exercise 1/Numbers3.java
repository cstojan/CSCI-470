import java.util.Scanner;

/********************************************************************
 *                                                                  *
 *  CSCI 470-1/502-1       In-Class Exercise 1         Summer 2019  *
 *                               Part 1                             *
 *                                                                  *
 *  Class Name:  Numbers3                                           *
 *                                                                  *
 *  Programmer:  Cory Stojan                                        *
 *                                                                  *
 *  Purpose:     A console program that displays the sum, product,  * 
 *               difference and division quotient of two numbers.   *
 *                                                                  *
 ********************************************************************/ 

public class Numbers3 
{
  public static void main(String[] args) 
  {
    double num1, num2, num3;

    Scanner sc = new Scanner(System.in);
    
    
    // Read Input
    // Read the first number.
    System.out.println("Enter the first number: ");
    num1 = sc.nextDouble();
    
    // Read the second number.
    System.out.println("Enter the second number: ");
    num2 = sc.nextDouble();
    
    // Read the third number
    System.out.println("Enter the third number: ");
    num3 = sc.nextDouble();
    
    
    
    // Compute and print the sum.
    System.out.printf("the Sum is: %.2f\n", (num1 + num2 + num3));
    
    // Compute and print the product.
    System.out.printf("The product is: %.2f\n", (num1 * num2 * num3));
    
    // Compute and print the average.
    System.out.printf("the Average is: %.2f\n", (((double)num1 + num2 + num3) / 3));
    
    // If all three numbers are equal
    if(num1 == num2 && num1 == num3){
     System.out.println("\nAll three numbers are equal!"); 
    }
    
    // if num1 is the largest
    if((num1 > num2) && (num1 > num3)){
     System.out.printf("\nThe largeest number is: %.2f\n", num1); 
    }
    
    // if num2 is the largest
    if((num2 > num1) && (num2 > num3)){
     System.out.printf("\nThe largeest number is: %.2f\n", num2); 
    }
       
       // if num3 is the largest
    if((num3 > num1) && (num3 > num2)){
     System.out.printf("\nThe largest number is: %.2f\n", num3); 
    }
    
    // if num1 is the smallest
    if((num1 < num2) && (num1 < num3)){
     System.out.printf("\nThe smallest number is: %.2f\n", num1); 
    }
    
    // if num2 is the smallest
    if((num2 < num1) && (num2 < num3)){
     System.out.printf("\nThe smallest number is: %.2f\n", num2); 
    }
       
       // if num2 is the smallest
    if((num3 < num1) && (num3 < num2)){
     System.out.printf("\nThe smallest number is: %.2f\n", num3); 
    }
  }
}
