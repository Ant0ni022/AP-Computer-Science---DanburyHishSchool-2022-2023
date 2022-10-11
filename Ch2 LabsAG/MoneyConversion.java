/**
 * Antonio Goncalves
 * September 14, 2022
 */

import java.util.Scanner;

public class MoneyConversion
{
    public static void main(String []args)
    {
     double amount;
     int Ten; 
     int Five; 
     int One;
     int Quarter; 
     int Dime; 
     int Nickel; 
     int Penny;
     Scanner scan = new Scanner(System.in);
        
     System.out.println("Enter the amount here:");
     amount = scan.nextDouble();
        
     Ten = (int) amount / 10;
     amount = amount % 10;
     Five = (int) amount / 5;
     amount = amount % 5;
     One = (int) amount / 1;
     amount = amount % 1;
     Quarter = (int) (amount / .25);
     amount = amount%(.25);
     Dime = (int) (amount / .10);
     amount = amount%(.10);
     Nickel = (int) (amount / .05);
     amount = amount%(.05);
     Penny = (int) (amount / .01);
     amount = amount%(.01);
     
     System.out.println(Ten + " Ten dollar bills");
     System.out.println(Five + " Five dollar bills");
     System.out.println(One + " One dollar bills");
     System.out.println(Quarter + " Quarters");
     System.out.println(Dime + " Dimes");
     System.out.println(Nickel + " Nickels");
     System.out.println(Penny + " Pennies");
     
     
     
    }
}    
