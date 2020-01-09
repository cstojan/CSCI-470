/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2       Assignment 1        Summer 2019  *
 *                                                          *
 *  Class Name:  TipCalculator                              *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     Calculates a tip for a bill and divides    *
 *               it evenly between all party members.       *
 *               Displays Results at bottom on output.      *
 ************************************************************/ 
public class TipCalculator
{
  private double bill;
  private int tip;
  private int partySize;
  
  public void TipCalculator(){
   this.bill = 0;
   this.tip = 0;
   this.partySize = 0;
  }
  
  public void setBill(double bill){
    this.bill = bill;
  }
  
  public void setTip(int tip){
    this.tip = tip;
  }
  
  public void setPartySize(int partySize){
    this.partySize = partySize;
  }
  
  public double getIndividualShare(){
    return (this.getTotalBill() / this.partySize);
  }
}