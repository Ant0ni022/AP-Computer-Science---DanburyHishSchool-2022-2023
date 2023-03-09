//Antonio G.
//October 4, 2022
//Calculate the Area and Perimeter of a Parallelgram

public class Parallel
{
    public static void main (String args[])
    {
        int base = (int)(Math.random()*20)+10;
        int height = (int)(Math.random()*20)+10;
        int side = (int)(Math.random()*20)+10;
        int Area = base * height;
        int Perimeter = 2 * (base + side);
        System.out.println("Base is: " + base);
        System.out.println("Height is: " + height);
        System.out.println("Side is: " + side);
        System.out.println("The Area of the parallel is: " + Area);
        System.out.println("The Perimeter of the parallel is: " +Perimeter);
    }
}