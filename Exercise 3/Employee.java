/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2                           Summer 2019  *
 *                       In-Class Exercise 3                *
 *                                                          *
 *  Class Name:  Employee                                   *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *                                                          *
 *  Purpose:     Creates a class for use with an employee   *
 *                calculator                                *
 *                                                          *
 ************************************************************/
public class Employee
{
  private String name;
  private double hrsWorked;
  private double payRate;
  
  public Employee(){
   this.name = "";
   this.hrsWorked = 0;
   this.payRate = 0;
  }
  
  public Employee(String name, double hrsWorked, double payRate){
   this.name = name;
   
   if(hrsWorked >= 0)
     this.hrsWorked = hrsWorked;
   else
     this.hrsWorked = 0;
   
   if(payRate >= 0)
     this.payRate = payRate;
   else
     payRate = 0;
  }
  
  public String getName(){
    return this.name;
  }
  
  public double getHrsWorked(){
   return this.hrsWorked; 
  }
  
  public double getPayRate(){
   return this.payRate; 
  }
  
  public void setName(String name){
    this.name = name; 
  }
  
  public void setHrsWorked(double hrsWorked){
    if(hrsWorked >= 0)
      this.hrsWorked = hrsWorked;
    else
      this.hrsWorked = 0;
  }
  
  public void setPayRate(double payRate){
    if(payRate >= 0)
      this.payRate = payRate;
    else
      this.payRate = 0;
  }
  public double CalcPay(){
     double overtime,
            overtimePay;
     
     // caculate overtime pay
     if(this.hrsWorked > 40)
     {
       overtime = (this.hrsWorked % 40);
       overtimePay = overtime * (this.payRate * .5);
       return ((this.hrsWorked * this.payRate) + overtimePay);
     }
     
     // caculate regular pay
     else
       return (this.hrsWorked * this.payRate);
 }
}