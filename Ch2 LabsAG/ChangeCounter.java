/**
 * Antonio Goncalves
 * September 14, 2022
 */

import java.util.Scanner;
public class ChangeCounter
{
    public static void main (String[] Args)
    {
        Scanner sc = new Scanner (System.in);
    
        final double Q = .25;
        final double D = .10;
        final double N = .05;
        final double P = .01;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        
        System.out.print("Enter a number in quaters: ");
        quarters = sc.nextInt();
        System.out.print("Enter a number in dimes: ");
        dimes = sc.nextInt();
        System.out.print("Enter a number in nickles: ");
        nickels = sc.nextInt();
        System.out.print("Enter a number in pennies: ");
        pennies = sc.nextInt();
        double total = quarters * Q + dimes * D + nickels * N + pennies * P;

        System.out.print("Total Value is: " + total);
        
    }
}
