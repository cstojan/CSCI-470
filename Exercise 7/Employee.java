/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 7       Summer 2019  *
 *                                                          *
 *  Class Name:  Employee                                   *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:   is a super class. contains basic info for an *
 *               employee.                                  *
 ************************************************************/
public class Employee
{
  private String firstName, lastName;
  private String socialSecurityNumber;
  
  // constructor
  public Employee(String firstName, String lastName, String socialSecurityNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
  }
  
  // getFirstName
  public String getFirstName(){
    return this.firstName;
  }
  
  // getLastName
  public String getLastName(){
    return this.lastName;
  }
  
  // getSocialSecurityNumber
  public String getSocialSecurityNumber(){
    return this.socialSecurityNumber;
  }
  
  // toString
  @Override
  public String toString(){
    return String.format("%s: %s %s\n%s: %s\n", 
                         "employee", firstName, lastName,
                         "social security number", socialSecurityNumber);
  }
}