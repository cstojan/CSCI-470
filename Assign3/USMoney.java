/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2       Assignment 3        Summer 2019  *
 *                                                          *
 *  Class Name:  USMoney                                    *
 *                                                          *
 *  Programmer:  CORY STOJAN                                *
 *                                                          *
 *  Purpose:  A USMoney class designed to calculate total   *
 *              money added together between two instinces  *
 *              of this class. Recuces to highest dollar    *
 *              amount, IE 200 cents = 2 dollars            *
 *                                                          *
 ************************************************************/
public class USMoney
{
  // Class Data Members
  private int dollars, cents;

/************************************************************
 *                                                          *
 *  Method Name:  USMoney                                   *
 *                                                          *
 *  Purpose:  Constructor for USMoney Class. Checks for     *
 *             negative values and reduces to highest       *
 *             dollar value                                 *
 *                                                          *
 ************************************************************/
  public USMoney(int dollars, int cents){
    if(dollars < 0 && cents < 0){
      System.out.println("Invalid Data");
    }
    
    
    // if dollars > 0 but cents < 0
    if(dollars > 0 && cents < 0){
      // checks to see if end result is negative
      if( cents + (dollars * 100) < 0){
        System.out.println("Invalid Data");
      }
      // reduces to highest dollar value
      else{
        for(int i = dollars; cents < 0; i--){
          dollars -= 1;
          cents += 100;
        }
      }
    }
    
    // if cents > 0 but dollars < 0
    else if(cents > 0 && dollars < 0){
      // checks to see if end result is negative
      if( dollars + (cents / 100) < 0){
        System.out.println("Invalid Data");
      }
      // reduces to highest dollar value
      else{
        for(int i = cents; dollars < 0; i++){
          cents -= 100;
          dollars += 1;
        }
      }
    }
    // if cents > 99
    if(cents > 99){
      for(int i = cents; cents > 99; i++){
       cents -= 100;
       dollars += 1;
      }
    }
    this.setCents(cents);
    this.setDollars(dollars);
  }

/************************************************************
 *                                                          *
 *  Method Name:  getDollars                                *
 *                                                          *
 *  Purpose:  Gets objects dollar value (int)               *
 *                                                          *
 ************************************************************/
  public int getDollars(){
    return this.dollars;
  }
  
/************************************************************
 *                                                          *
 *  Method Name:  getCents                                  *
 *                                                          *
 *  Purpose:  Gets objects cents value (int)                *
 *                                                          *
 ************************************************************/
  public int getCents(){
    return this.cents;
  }
  
/************************************************************
 *                                                          *
 *  Method Name:  setDollars                                *
 *                                                          *
 *  Purpose:  Sets objects dollar value (int)               *
 *                                                          *
 ************************************************************/
  public void setDollars(int dollars){
    this.dollars = dollars;
  }
  
 /************************************************************
 *                                                          *
 *  Method Name:  setCents                                  *
 *                                                          *
 *  Purpose:  Sets objects cents value (int)                *
 *                                                          *
 ************************************************************/
  public void setCents(int cents){
    this.cents = cents;
  }

/************************************************************
 *                                                          *
 *  Method Name:  plus                                      *
 *                                                          *
 *  Purpose:  Adds two USMoney objects. Reduces to          *
 *             highest dollar amount                        *
 *                                                          *
 ************************************************************/
  public USMoney plus(USMoney money2){
    USMoney result = new USMoney(0,0);
    int dollars, cents;
    
    result.setDollars(this.getDollars() + money2.getDollars());
    result.setCents(this.getCents() + money2.getCents());
    // if cents > 99
    if(result.cents > 99){
      cents = result.getCents();
      dollars = result.getDollars();
      for(int i = cents; cents > 99; i++){
       cents -= 100;
       dollars += 1;
      }
      result.setCents(cents);
      result.setDollars(dollars);
    }
    return result;
  }

  // End Of Class
}