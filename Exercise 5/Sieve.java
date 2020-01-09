/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 5       Summer 2019  *
 *                                                          *
 *  Class Name:  ParkingGarage                              *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     caculates prime numbers and displays them  *
 ************************************************************/ 
import java.util.Arrays;
public class Sieve
{
 public static void main(String[] args)
 {
   boolean primes [] = new boolean[1000];
   Arrays.fill(primes, true);
   primes[0] = false;
   primes[1] = false;
   
   for(int i = 2; i <= 999; i++){
     
     for (int j = 2; j < i; j++){
       if( i % j == 0){
         primes[i] = false;
         j = i;
       }
     }
   }
   System.out.println("/nThe Prime Numbers Are: ");
   for(int i = 0; i <= 999; i++){
     if(primes[i] == true)
       System.out.print(i + " ");
   }  
 }
}