/**
 * Resolve the Quadratic equation
 * 
 * Antonio Goncalves 
 * Nov 28, 2022
 */
public class Quadratic
{
    public static void main (String args[])
    {
       System.out.println("Resolve the quadratic with A being 2 " +
       " B being -7 and C being 9.");
       int a = -7;
       int b = 2;
       int c = 9;
       double root1, root2;
       double discriminant = Math.pow(b,2) - (4 * a * c);
       root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2*a);
       root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2*a);
        
        
        System.out.println("Root 1 is: " +root1);
        System.out.println("Root 2 is: " +root2);
    }
}
