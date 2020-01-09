/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 4       Summer 2019  *
 *                                                          *
 *  Class Name:  ParkingGarage                              *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     creates a square of astricsks              *
 ************************************************************/ 
import java.util.Scanner;
public class squareOfAsterisks
{
    static void line(int numOfLines){
    for(int lineNum = 0; lineNum <= numOfLines; lineNum++){
      if(lineNum == numOfLines)
        System.out.print("\n");
      else{
        for(int linePos = 0; linePos <= numOfLines; linePos++){
          if(linePos == numOfLines)
            System.out.print("\n");
          else
            System.out.print("*");
       }
      }
    }
  }
  public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    int numberLines;
    System.out.print("\nEnter The Number Of Sides: ");
    numberLines = sc.nextInt();
    System.out.print("\n");  
    line(numberLines);
    
    
        
      
      
      
  }
}