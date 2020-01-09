/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2                           Summer 2019  *
 *                       In-Class Exercise 2                *
 *                                                          *
 *  Class Name:  InvoiceTest                                *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *                                                          *
 *  Purpose:     Creates a class for use with an employee   *
 *                calculator                                *
 *                                                          *
 ************************************************************/
import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeePay
{
 public static void main(String[] args)
 {
   String Name;
   Double HrsWorked,
          RatePay;
   
   Scanner sc = new Scanner(System.in);
   DecimalFormat payWeek = new DecimalFormat("$##,##0.00");
   DecimalFormat RateOfPay = new DecimalFormat("$#,##0.00");
   DecimalFormat HoursWorked = new DecimalFormat("#0.00");
   
   System.out.print("Enter First Employee Name\n");
   Name = sc.nextLine();
   System.out.print("Enter First Employee Number Of Hours Worked: \n");
   HrsWorked = sc.nextDouble();
   System.out.print("Enter First Employee Pay Rate: \n");
   RatePay = sc.nextDouble();
   Employee Marilyn = new Employee(Name, HrsWorked, RatePay);
   sc.close();
   Scanner scc = new Scanner(System.in);
   System.out.print("Enter Second Employee Name\n");
   Name = scc.nextLine();
   System.out.print("Enter Second Employee Number Of Hours Worked: \n");
   HrsWorked = scc.nextDouble();
   System.out.print("Enter Second Employee Pay Rate: \n");
   RatePay = scc.nextDouble();
   Employee John = new Employee(Name, HrsWorked, RatePay);
   scc.close();
   Scanner sac = new Scanner(System.in);
   System.out.print("Enter Third Employee Name\n");
   Name = sac.nextLine();
   System.out.print("Enter Second Employee Number Of Hours Worked: \n");
   HrsWorked = sac.nextDouble();
   System.out.print("Enter Third Employee Pay Rate: \n");
   RatePay = sac.nextDouble();
   Employee Cheryl = new Employee(Name, HrsWorked, RatePay);
   sc.close();
   
   
   System.out.print("\nEmployee Weekly Pay Report\n\n");
   System.out.print("Name                 Hours Worked                Pay Rate           Week's Pay\n");
   System.out.print("---------------      --------------              ------------    -------------\n");
   // name 1
   System.out.printf("%-15s",Marilyn.getName());
   System.out.printf("            %5s", HoursWorked.format(Marilyn.getHrsWorked()));
   System.out.printf("                 %7s", RateOfPay.format(Marilyn.getPayRate()));
   System.out.printf("          %11s", payWeek.format(Marilyn.CalcPay()));
   System.out.print("\n");
   // name 2
  /* System.out.printf("%-15s",John.getName());
   System.out.printf("            %5s", HoursWorked.format(John.getHrsWorked()));
   System.out.printf("                 %7s", RateOfPay.format(John.getPayRate()));
   System.out.printf("          %11s", payWeek.format(John.CalcPay()));
   System.out.print("\n");
   // name 3
   System.out.printf("%-15s",Cheryl.getName());
   System.out.printf("            %5s", HoursWorked.format(Cheryl.getHrsWorked()));
   System.out.printf("                 %7s", RateOfPay.format(Cheryl.getPayRate()));
   System.out.printf("          %11s", payWeek.format(Cheryl.CalcPay()));
   System.out.print("\n");
   */
 }
}