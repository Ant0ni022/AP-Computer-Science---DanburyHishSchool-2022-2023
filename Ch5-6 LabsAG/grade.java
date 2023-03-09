/**
 * Grade calculator
 * 
 * Antonio Goncalves
 * October 18, 2022
 */
import java.util.Scanner;

public class grade
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double Q1;
        double Q2;
       String Sgrade = "";
        System.out.println("Type in your grade for Quarter 1: ");
        Q1 = scan.nextDouble();
        System.out.println("Type in your grade for Quarter 2: ");
        Q2 = scan.nextDouble();
        
        double Total = (Q1 + Q2) / 2;
           if(Total>=96)
       {
           Sgrade = "A";
       }
       else if(Total>=84)
       {
           Sgrade = "B";
       }
       else if (Total>=72)
       {
           Sgrade = "C";
       }
       else if(Total>=56)
       {
           Sgrade = "D";
       }
       else if (Total<56)
       {
           Sgrade = "F";
       }
       System.out.println("Your average grade in the semester is: " + Sgrade);
    }
}