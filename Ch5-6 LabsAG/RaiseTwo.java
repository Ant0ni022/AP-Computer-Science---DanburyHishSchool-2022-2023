// ************************************************************
// RaiseTwo.java
//
// Computes the amount of a raise and the new
// salary for an employee. The current salary
// and a performance rating (a String: "Excellent",
// "Good" or "Poor") are input.
//  @Antonio Goncalves 
//  October 18, 2022 
// ************************************************************
import java.util.Scanner;
import java.text.NumberFormat;
public class RaiseTwo
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double currentSalary; // employee's current salary
        double raise; // amount of the raise
        double newSalary; // new salary for the employee
        String rating; // performance rating
        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the performance rating (Excellent, Good, Poor or Bad): ");
        rating = scan.next();
        // Compute the raise using if ...
        if(rating.equals("Excellent"))
        {
           raise =  0.06;
        }
        else if(rating.equals("Good"))
        {
           raise = 0.04;
        }
        else if (rating.equals("Poor"))
        {
           raise = 0.015;
        }
        else
        {
            raise = 0;
        }
        newSalary = currentSalary + raise;
        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println( "Your new salary: " + money. format (newSalary) );
        System.out.println();
   }
}
