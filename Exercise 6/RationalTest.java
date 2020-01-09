/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 6       Summer 2019  *
 *                                                          *
 *  Class Name:  RationalTest                               *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:   Calculates and displays arithmetic operation *
 *                  for two rational numbers                *
 ************************************************************/ 
import java.util.Scanner;
import java.text.DecimalFormat;

public class RationalTest
{  
  
 public static void main(String[] args)
 {
   int numerator1, denominator1, numerator2, denominator2, percision;
   int next = 1;
   double perResult;
   String format = "";
   
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter numerator for first number: ");
   numerator1 = scan.nextInt();
   System.out.println("Enter denominator for the first number");
   denominator1 = scan.nextInt();
   System.out.println("Enter numerator for second number: ");
   numerator2 = scan.nextInt();
   System.out.println("Enter denominator for the second number");
   denominator2 = scan.nextInt();
   System.out.println("Enter percision");
   percision = scan.nextInt();
   for(int i = 0; i < percision; i++){
    format = format + "0"; 
   }
   DecimalFormat percisionFormat = new DecimalFormat("##." + format);
   Rational num1 = new Rational(numerator1, denominator1);
   Rational num2 = new Rational(numerator2, denominator2);
   System.out.print("\nNumber one: " + num1.getNumerator() + "/" + num1.getDenominator() + "\n");
   System.out.print("Number two: " + num2.getNumerator() + "/" + num2.getDenominator() + "\n");
   Rational add = new Rational();
   Rational sub = new Rational();
   Rational mul = new Rational();
   Rational div = new Rational();
   do{
     System.out.println("\nEnter Choice:\n  1. Add\n  2. Subtract\n  3. Multiply\n  4. Divide\n  5. Exit");
     next = scan.nextInt();
     switch (next){
       case 1:
         add = num1.addRationals(num1,num2);
         perResult = ((double) add.getNumerator() / add.getDenominator());
         System.out.print("a + b = " + add.getNumerator() + "/" + add.getDenominator() + " = " + percisionFormat.format(perResult) + "\n");
         break;
       case 2:
         sub = num1.subRationals(num1,num2);
         perResult = ((double) sub.getNumerator() / sub.getDenominator());
         System.out.print("a - b = " + sub.getNumerator() + "/" + sub.getDenominator() + " = " + percisionFormat.format(perResult) +  "\n");
         break;
       case 3:
         mul = num1.mulRationals(num1,num2);
         perResult = ((double) mul.getNumerator() / mul.getDenominator());
         System.out.print("a * b = " + mul.getNumerator() + "/" + mul.getDenominator() + " = " + percisionFormat.format(perResult) +  "\n");
         break;
       case 4:
         div = num1.divRationals(num1,num2);
         perResult = ((double) div.getNumerator() / div.getDenominator());
         System.out.print("a / b = " + div.getNumerator() + "/" + div.getDenominator() + " = " + percisionFormat.format(perResult) +  "\n");
         break;
       case 5:
         System.out.println("Goodbye!");
         next = -1;
         break;
       default:
         next = 1;
     }
     
   }while(next > 0);
 }
}