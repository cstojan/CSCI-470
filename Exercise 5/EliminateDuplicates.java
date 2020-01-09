/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 5       Summer 2019  *
 *                                                          *
 *  Class Name:  ParkingGarage                              *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     inputs 5 numbers and displays the list of them*
 ************************************************************/ 
import java.util.Scanner;
import java.util.Arrays;

public class EliminateDuplicates
{
  public static void main(String[] args)
  {
    int duplicate = 0;
    int numbers [] = new int[5];
    Arrays.fill(numbers, 0);
    // inputs 5 numbers between 10 and 100 inclusive
  
    // display only if not a duplicate
    Scanner scan = new Scanner(System.in);
    for(int i = 0; i < 5; i++){
      boolean found = false;
      System.out.println("Enter a number between 10 and 100: ");
      numbers[i] = scan.nextInt();
      for(int j = 0; j < i; j++){
        if(numbers[j] == numbers[i])
          found = true;
      }
      if(found == false){0
        System.out.println(numbers[i]);
        
      }
      if(numbers[i] < 10 || numbers[i] > 100){
        System.out.println("Number is not between 10 and 100. Enter a number between 10 and 100");
        numbers[i] = scan.nextInt();
      }
      
    }
      System.out.println("The Complete Set Is: ");
      for(int p = 0; p < 5; p++)
      {
        boolean founds = false;;
        for(int o = 0; o < p; o++){
          if(numbers[o] == numbers[p])
            founds = true;
        }
        if(founds == false)
          System.out.print(numbers[p] + " ");
      }
      //System.out.println(numbers[i]);
     
  }
}
                         