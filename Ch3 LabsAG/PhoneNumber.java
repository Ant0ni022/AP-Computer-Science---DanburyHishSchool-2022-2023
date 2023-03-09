//Antonio G.
//October 4, 2022
//Create a Phone Number
public class PhoneNumber
{
    public static void main (String args[])
    {
        int num1 = (int)(Math.random()*8);
        int num2 = (int)(Math.random()*8);
        int num3 = (int)(Math.random()*8);
        int num4 = (int)(Math.random()*700)+100;
        int num5 = (int)(Math.random()*10);
        int num6 = (int)(Math.random()*10);
        int num7 = (int)(Math.random()*10);
        int num8 = (int)(Math.random()*10);
        System.out.println(num1+""+num2+""+num3+ "-" +num4+ "-" +num5+
        +num6+ +num7+ +num8+ "");
    }
}