/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2       Assignment 2        Summer 2019  *
 *                                                          *
 *  Class Name:  MileageComparator                          *
 *                                                          *
 *  Programmer:  CORY STOJAN                                *
 *                                                          *
 *  Purpose:  Compares two Destination objects based on     *
 *               the mileage. Returns d2-d1.                *
 *                                                          *
 ************************************************************/
import java.util.Comparator;


public class MileageComparator implements Comparator<Destination> 
{
  
  /************************************************************
 *                                                          *
 *  Method Name:  compare                                   *
 *                                                          *
 *  Purpose: Compares two Destination classes.              *
 *             Returns d2 - d1                              *
 *                                                          *
 ************************************************************/
   public int compare(Destination d1, Destination d2) 
   {
      return (d2.getMilesReq() - d1.getMilesReq());
   }
}
