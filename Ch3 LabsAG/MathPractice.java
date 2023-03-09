
/**
 * Write a description of class MathPractice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class MathPractice
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("\nEnter the value for num1: ");
        int num1 = sc.nextInt();
        
        System.out.println("\nEnter the value for num2: ");
        double num2 = sc.nextDouble();
        
        System.out.println("\nEnter the value for num3: ");
        int num3 = sc.nextInt();
        
        System.out.println("\nEnter the value for num1: ");
        
        System.out.println("\nThe int absolute value is: " + Math.abs(num1));
        
        System.out.println("\nThe double absolute value is: " + Math.abs(num2));
        
        System.out.println(Math.sqrt(Math.abs(num1)));
        
        System.out.println(Math.pow(num1,3));
        
        System.out.println(Math.PI);
        
        System.out.println(Math.max(Math.max(num1,num3),num2));
        
        System.out.println (Math.sqrt(num1 + num2));
    }
}
