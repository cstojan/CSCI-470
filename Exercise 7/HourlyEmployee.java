/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 7       Summer 2019  *
 *                                                          *
 *  Class Name:  HourlyEmployee                             *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:   calculates wage for an employee paid by the  *
 *                   hour.                                  *
 ************************************************************/
public class HourlyEmployee extends Employee
{
  private double hours, wage;
  
  public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                        double wage, double hours){
    super(firstName, lastName, socialSecurityNumber);
    if (wage < 0.0) 
      throw new IllegalArgumentException(
          "Wage must be >= 0.0");
    if (hours > 168.0 || hours < 0) 
      throw new IllegalArgumentException(
          "Hours must be >= 0.0 and <= 168");
    setHours(hours);
    setWage(wage);
  }


  public double getHours(){
    return this.hours;
  }

  public double getWage(){
    return this.wage;
  }

  public void setHours(double hours){
    this.hours = hours;
  }
  public void setWage(double wage){
    this.wage = wage;
  }
  
  public double earnings(double wage, double hours){
   double overtime, overtimePay, total;
     
     // caculate overtime pay
     if(hours > 40)
     {
       overtime = (hours % 40);
       overtimePay = overtime * (wage * .5);
       total = ((hours * wage) + overtimePay);
     }
     
     // caculate regular pay
     else
       total = (hours * wage); 
     return total;
  }
  
  @Override 
   public String toString()
   {
      return String.format("%s %s \n%.2f \n%s: %.2f", 
         super.toString(), 
         "employee wage", getWage(), 
         "employee pay", earnings(this.getWage(), this.getHours()));
   } 
}