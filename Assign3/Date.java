/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2       Assignment 3        Summer 2019  *
 *                                                          *
 *  Class Name:  Date                                       *
 *                                                          *
 *  Programmer:  CORY STOJAN                                *
 *                                                          *
 *  Purpose:  A Date class, designed to display current     *
 *             date and calculate days since January 1st    *
 *                                                          *
 ************************************************************/
public class Date
{
 // Class Variables
 private int day, month, year;
 
 /************************************************************
 *                                                          *
 *  Method Name:  Date                                      *
 *                                                          *
 *  Purpose:  Constructor for the Date class. Requires      *
 *              3 inputs (int, int int)                     *
 *                                                          *
 ************************************************************/
 public Date(int day, int month, int year){
  
   this.setDay(day);
   this.setMonth(month);
   this.setYear(year);
 }
 
 /************************************************************
 *                                                          *
 *  Method Name:  setDay                                    *
 *                                                          *
 *  Purpose:  Sets the objects day (int)                    *
 *                                                          *
 ************************************************************/
 public void setDay(int day){
   this.day = day;
 }
 
 /************************************************************
 *                                                          *
 *  Method Name:  getDay                                    *
 *                                                          *
 *  Purpose:  gets objects day (int)                        *
 *                                                          *
 ************************************************************/
 public int getDay(){
   return this.day;
 }
 
 /************************************************************
 *                                                          *
 *  Method Name:  setMonth                                  *
 *                                                          *
 *  Purpose:  Sets the objects month as an int              *
 *                                                          *
 ************************************************************/
 public void setMonth(int month){
   this.month = month;
 }
 
 /************************************************************
 *                                                          *
 *  Method Name:  getMonth                                  *
 *                                                          *
 *  Purpose:  returns the objects month as a string         *
 *                                                          *
 ************************************************************/
 public String getMonth(){
   String result;
   switch(this.month){
     case 1:
       result = "January";
       break;
     case 2:
       result = "Febuary";
       break;
     case 3:
       result = "March";
       break;
     case 4:
       result = "April";
       break;
     case 5:
       result = "May";
       break;
     case 6:
       result = "June";
       break;
     case 7:
       result = "July";
       break;
     case 8:
       result = "August";
       break;
     case 9:
       result = "September";
       break;
     case 10:
       result = "October";
       break;
     case 11:
       result = "November";
       break;
     case 12:
       result = "December";
       break;
     default:
       result = "January";
       break;
   }
   return result;
 }
 
 /************************************************************
 *                                                          *
 *  Method Name:  setYear                                   *
 *                                                          *
 *  Purpose:  sets the objects year (int)                   *
 *                                                          *
 ************************************************************/
 public void setYear(int year){
   this.year = year;
 }
 
 /************************************************************
 *                                                          *
 *  Method Name:  getYear                                   *
 *                                                          *
 *  Purpose:  returns the objects year                      *
 *                                                          *
 ************************************************************/
 public int getYear(){
   return this.year;
 }
 
 /************************************************************
 *                                                          *
 *  Method Name:  daysSinceJan1                             *
 *                                                          *
 *  Purpose:  Calculates the days from January 1st to the   *
 *               current day of that year                   *
 *                                                          *
 ************************************************************/
 public int daysSinceJan1(){
   // Local Variables
   int result = this.day; // result = the day of the current month
   
   // Add days of months other than current to result
   if(this.month > 1){
     for(int i = this.month - 1; i >= 1; i--){
       // between jan and jun
       if( i >= 1 && i <= 7){
         // jan, mar, may, jul
         if((i % 2) == 1){
           result += 31;
         }
     
         // feb, apr, jun
         else{
           // account for feb lear year
           if(i == 2){
             // account for leap year
             if((this.year % 4) == 0){
               result += 29;
               // weird century years
               if((this.year % 100) == 0){
                 if((this.year % 400) != 0)
                   result -= 1;
               }
             }
             // feb non leap year
             else{
               result += 28;
             }
           }
           // apr and jun
           else{
             result += 30;
           }
         }
       }
       // between aug and dec
       else if(i >=8 && i <= 11){
         // aug oct
         if((i % 2) == 0){
           result += 31;
         }
         // sep and nov
         else{
           result += 30;
         }
       }
     }
   }
   // return number of days
   return result;
 }

 // End Of Class
}
 