
/**
 * Write a description of class RandomPractice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPractice
{
    public static void main (String [] args)
    {
        int num1;
        
        double num3; 
        
        num1 = (int)(Math.random() * 10);
        num1 = (int)(Math.random() * 10) + 1;
        num1 = (int)(Math.random() * 32) + 13; // *(32 - 20 + 1)
        num1 = (int)(Math.random() * (25 +10 +1)) -10; // -10 to 25
        
        num3 = Math.random();
        num3 = (Math.random() * 6);
        
    }
}
