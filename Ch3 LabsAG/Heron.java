/**
 * calculate the area of the triangle using the Heron formula
 * 
 * Antonio Goncalves 
 * Nov 28, 2022
 */
import java.util.Scanner;
public class Heron
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        double a,b,c;
        double s, area;
        System.out.println("Type the value for A, B and C: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        System.out.println("The value of A is: " +a);
        System.out.println("The value of B is: " +b);
        System.out.println("The value of C is: " +c);
        s = (a+b+c) / 2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The half of the triangles perimeter is: " +s);
        System.out.println("The area of the triangle is: " +area);
    }
}
