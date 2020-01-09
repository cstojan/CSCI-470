/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2                           Summer 2019  *
 *                       In-Class Exercise 2                *
 *                                                          *
 *  Class Name:  Invoice                                    *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *                                                          *
 *  Purpose:     To work with classes and methods of classes*
 *                                                          *
 ************************************************************/ 
public class Invoice
{
 private String partNum;
 private String partDis;  // part discription
 private int qty;
 private double price;
 
 public Invoice(){
   setPartNum("00000");
   setPartDis("None");
   setQty(0);
   setPrice(0); 
 }
 
 public Invoice(String partNum, String partDis, int qty, double price){
   this.partNum = partNum;
   this.partDis = partDis;
   this.qty = qty;
   this.price = price;
 }
 
 public String getPartNum(){
   return this.partNum;
 }
 
 public String getPartDis(){
  return this.partDis; 
 }
 
 public int getQty(){
  return this.qty; 
 }
 
 public double getPrice(){
  return this.price; 
 }
 
 
 // set methods
 public void setPartNum(String partNum){
   this.partNum = partNum;
 }
 
 public void setPartDis(String partDis){
   this.partDis = partDis;
 }
 
 public void setQty(int qty){
   this.qty = qty;
 }
 
 public void setPrice(double price){
  this.price = price; 
 }
 
 public double getInvoiceAmount(){
   if(this.qty <= 0)
     return 0.00;
   else if(this.price <= 0)
     return 0.00;
   else
     return (this.qty * this.price);
 }
}