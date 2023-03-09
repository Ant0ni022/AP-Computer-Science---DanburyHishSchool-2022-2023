
/**
 * Write a description of class Husky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Tester
{
    public static void main (String[] args)
    {
        //default dog
        Scanner scan = new Scanner (System.in);
        Dog1B husky = new Dog1B("Bolt",4,62.3,true);
        
        husky.speak();
        
    }
}
