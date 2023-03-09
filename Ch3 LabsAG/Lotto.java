//Antonio G.
//October 4, 2022
//Create a Lotto
public class Lotto
{
    public static void main (String args[])
    {
        int num1 = (int)(Math.random()*59)+1;
        int num2 = (int)(Math.random()*59)+1;
        int num3 = (int)(Math.random()*59)+1;
        int num4 = (int)(Math.random()*59)+1;
        int num5 = (int)(Math.random()*59)+1;
        
        int powerball = (int)(Math.random()*35)+1;
        
        
        
        System.out.println(" Your lotto numbers for today are: " +num1+ " " +num2+ " " +num3+ 
        " " +num4+ " " +num5+ " Powerball " +powerball+ " .");
        
    }
}