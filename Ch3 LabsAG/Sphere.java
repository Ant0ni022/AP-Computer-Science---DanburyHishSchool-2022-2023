/**
 * Calculate the volume of an Sphere
 * 
 * Antonio Goncalves 
 * Nov 28, 2022
 */
import java.util.Scanner;
public class Sphere
{
    public static void main (String args[])
    {
       Scanner scan = new Scanner(System.in);
       int radius;
       double volume;
       double surfaceArea;
       System.out.println("Type in the radius to calculate the volume and Surface Area of an Sphere: ");
       radius = scan.nextInt();
       volume = (1.33 * Math.PI) * (Math.pow(radius,3));
       surfaceArea = (4 * Math.PI * (Math.pow(radius,2)));
       System.out.println("The volume of the Sphere with Radius " +radius+ " is: " +volume);
       System.out.println("The Surface Area of the Sphere with Radius " + radius + " is: " + surfaceArea);
       
       
    }
}
