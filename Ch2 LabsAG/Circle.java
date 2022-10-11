//**********************************************************
//  Circle.java
//  Antonio Goncalves
//  September 14, 2022
//  Print the area of a circle with two different radii
//**********************************************************
import java.util.Scanner;
public class Circle
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     
     final double PI = 3.14159;
     int radius;
     
     System.out.println("Please enter a value for the radius. ");
     radius = scan.nextInt();
     double circumference1 = 2 * PI * radius;
     double area1 = PI * radius * radius;
     
     System.out.println("The area of a circle with radius " + radius + " is " + area1);
     System.out.println ("The circumference of a circle with radius " + radius + " is " + circumference1);
     
     radius = radius * 2;
     double area2 = PI * radius * radius;
     double circumference2 = 2 * PI * radius;
     
     
     System.out.println ("The circumference of a circle with radius " + radius + " is " + circumference2);
     System.out.println("The area of a circle with radius " + radius + " is " + area2);
     
     double area3 = area2 / area1;
     double circumference3 = circumference2 / circumference1;
     
     System.out.println ("The change of area is " + area3);
     
     
    }
}
