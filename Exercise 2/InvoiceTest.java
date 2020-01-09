/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2                           Summer 2019  *
 *                       In-Class Exercise 2                *
 *                                                          *
 *  Class Name:  InvoiceTest                                *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *                                                          *
 *  Purpose:     To work with classes and methods of classes*
 *                                                          *
 ************************************************************/ 
import java.text.DecimalFormat;
public class InvoiceTest 
{
  public static void main(String[] args)
  {
    DecimalFormat dollars = new DecimalFormat("$##,###,##0.00");
  
    Invoice hammer = new Invoice();
    Invoice phillips = new Invoice("01", "Phillips Screwdriver", 10, 3.75);
    Invoice lightSwitch = new Invoice("02", "Light Switch", 15, 3.57);
    Invoice cordlessDrill = new Invoice("03", "Cordless Drill", 3, 45.63);
    Invoice carpenterSquare = new Invoice("04","Carpenter's Square", 12, 8.75);
 
    System.out.print("Invoice #1");
    System.out.printf("\n\n          Part Number:    %s", hammer.getPartNum());
    System.out.printf("\n\n     Part Discription:    %s", hammer.getPartDis());
    System.out.printf("\n\n             Quantity:       %d", hammer.getQty());
    System.out.printf("\n\n                Price:          %s", dollars.format(hammer.getPrice()));
    System.out.printf("\n\n     Invoice Subtotal:   %s", dollars.format(hammer.getInvoiceAmount()));
    System.out.print("\n\n\n\n");
    
    
    hammer.setPartNum("05");
    hammer.setPartDis("Hammer");
    hammer.setQty(12);
    hammer.setPrice(3.86);
    System.out.print("Invoice #2");
    System.out.printf("\n\n          Part Number:    %s", hammer.getPartNum());
    System.out.printf("\n\n     Part Discription:    %s", hammer.getPartDis());
    System.out.printf("\n\n             Quantity:       %d", hammer.getQty());
    System.out.printf("\n\n                Price:          %s", dollars.format(hammer.getPrice()));
    System.out.printf("\n\n     Invoice Subtotal:   %s", dollars.format(hammer.getInvoiceAmount()));
    System.out.print("\n\n\n\n");
    
    System.out.print("Invoice #2");
    System.out.printf("\n\n          Part Number:    %s", phillips.getPartNum());
    System.out.printf("\n\n     Part Discription:    %s", phillips.getPartDis());
    System.out.printf("\n\n             Quantity:       %d", phillips.getQty());
    System.out.printf("\n\n                Price:          %s", dollars.format(phillips.getPrice()));
    System.out.printf("\n\n     Invoice Subtotal:   %s", dollars.format(phillips.getInvoiceAmount()));
    System.out.print("\n\n\n\n");
    
    System.out.print("Invoice #2");
    System.out.printf("\n\n          Part Number:    %s", lightSwitch.getPartNum());
    System.out.printf("\n\n     Part Discription:    %s", lightSwitch.getPartDis());
    System.out.printf("\n\n             Quantity:       %d", lightSwitch.getQty());
    System.out.printf("\n\n                Price:          %s", dollars.format(lightSwitch.getPrice()));
    System.out.printf("\n\n     Invoice Subtotal:   %s", dollars.format(lightSwitch.getInvoiceAmount()));
    System.out.print("\n\n\n\n");
    
    System.out.print("Invoice #2");
    System.out.printf("\n\n          Part Number:    %s", cordlessDrill.getPartNum());
    System.out.printf("\n\n     Part Discription:    %s", cordlessDrill.getPartDis());
    System.out.printf("\n\n             Quantity:       %d", cordlessDrill.getQty());
    System.out.printf("\n\n                Price:          %s", dollars.format(cordlessDrill.getPrice()));
    System.out.printf("\n\n     Invoice Subtotal:   %s", dollars.format(cordlessDrill.getInvoiceAmount()));
    System.out.print("\n\n\n\n");
    
    System.out.print("Invoice #2");
    System.out.printf("\n\n          Part Number:    %s", carpenterSquare.getPartNum());
    System.out.printf("\n\n     Part Discription:    %s", carpenterSquare.getPartDis());
    System.out.printf("\n\n             Quantity:       %d", carpenterSquare.getQty());
    System.out.printf("\n\n                Price:          %s", dollars.format(carpenterSquare.getPrice()));
    System.out.printf("\n\n     Invoice Subtotal:   %s", dollars.format(carpenterSquare.getInvoiceAmount()));
    System.out.print("\n\n\n\n");
  }
}