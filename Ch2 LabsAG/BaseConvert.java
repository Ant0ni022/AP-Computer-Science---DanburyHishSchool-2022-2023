// ***********************************************************************
//   BaseConvert.java
//  Antonio Goncalves
//  September 14, 2022
//   Converts base 10 numbers to another base (at most 4 digits in the other 
//   base).  The base 10 number and the base are input.
// ***********************************************************************
import java.util.Scanner;
 
public class BaseConvert
{
   public static void main (String[] args)
   {
      int base;        // the new base
      int base10Num;   // the number in base 10
      int maxNumber;   // the maximum number that will fit in 4 digits in the new base
 
      int place0;      // digit in the 1's (base^0) place
      int place1;      // digit in the base^1 place
      int place2;      // digit in the base^2 place
      int place3;      // digit in the base^3 place
      int quotient;    // quotient when dividing by the base
      
      double convert;
      
      Scanner scan = new Scanner(System.in);
 
      String baseBNum = new String (""); // the number in the new base
      
       
      System.out.println("\nBase Conversion Program\n");
      System.out.println();
      System.out.print("Please enter a base (2 - 9): ");
      base = scan.nextInt();
      maxNumber = (int) Math.pow(base , 4) - 1 ;
      System.out.println("The maximum 4-digit number in base " +base+ " is " +maxNumber);
      System.out.print("Please enter a base 10 number in the range 0 to " +maxNumber+ " to convert: ");
      base10Num = scan.nextInt();
      place0 = base10Num % base ;
		quotient = base10Num / base ;
		
		place1 = quotient % base ;
		quotient = quotient / base ;
		
		place2 = quotient % base ;
		quotient = quotient / base ;
		
		place3 = quotient % base ;
		quotient = quotient / base ;
		
		baseBNum = "" + place3 + place2 + place1 + place0 ;

      // Print the result (see notes in lab)
		System.out.println(base10Num + " (Base 10) = " +baseBNum+ " (base 8)") ;
      // read in the base 10 number and the base
     
 
      // Compute the maximum base 10 number that will fit in 4 digits 
      // in the new base and tell the user what range the number they
      // want to convert must be in
     
      // Do the conversion (see notes in lab)
     
      // Print the result (see notes in lab)
     
    }
}
