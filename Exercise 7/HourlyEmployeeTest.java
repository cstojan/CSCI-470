/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 7       Summer 2019  *
 *                                                          *
 *  Class Name:  HourlyEmployeeTest                         *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:   test the hourEmployee class                  *
 ************************************************************/
// CommissionEmployeeTest.java
// CommissionEmployee class test program.

public class HourlyEmployeeTest 
{
   public static void main(String[] args) 
   {
      // instantiate CommissionEmployee object
      HourlyEmployee employee = new HourlyEmployee(
         "John", "Doe", "333-666-9999", 50.36, 17.65);      
      
      // get commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("\n%s %s\n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s\n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s\n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f\n", "Wage is", 
         employee.getWage());
      System.out.printf("%s %.2f\n", "Hours is",
         employee.getHours());
      System.out.printf("%s %.2f\n", "pay is",
         employee.earnings(employee.getWage(), employee.getHours()));
      employee.setWage(20.00);
      employee.setHours(10.25);
      
      System.out.printf("\n%s:\n\n%s\n",                                
         "Updated employee information obtained by toString", employee);
   } // end main
} 