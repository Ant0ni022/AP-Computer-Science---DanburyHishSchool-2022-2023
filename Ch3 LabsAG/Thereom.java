
/**
 * Calculate the perimeter of the Thereom
 * 
 * Antonio Goncalves 
 * Nov 28, 2022
 */
import java.util.Scanner;
public class Thereom
{
    public static void main (String args[])
    {
       Scanner scan = new Scanner(System.in);
       int a,b;
       double c;
        System.out.println("Type the value of A and B to find the value of C: ");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("A is: " +a+ " B is: " +b);
        c = (Math.pow(a,2)) + (Math.pow(b,2));
        c = (Math.sqrt(c));
        System.out.println("The perimeter of the Triangle is: " +c);
        
        
    }
}
