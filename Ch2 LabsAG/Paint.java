//***************************************************************
//File: Paint.java
//  Antonio Goncalves
//  September 14, 2022
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     final int COVERAGE = 350;  //paint covers 350 sq ft/gal
     int length;
     int width;
     int height;
     int window;
     int door;
     System.out.println("Please enter a value for ");
     System.out.println("Length");
     length = scan.nextInt();
     System.out.println("Width");
     width = scan.nextInt();
     System.out.println("height");
     height = scan.nextInt();
     System.out.println ("Windows");
     window = scan.nextInt();
     System.out.println ("Doors");
     door = scan.nextInt();
     double totalSqFt = (double)(length * height * 2 + width * height * 2 - (window * 15 + door * 20)) / COVERAGE  ;
     double paintNeeded = totalSqFt;
     System.out.println("The total paint needed is " + paintNeeded);
        //declare integers length, width, and height;
        //declare double totalSqFt;
        //declare double paintNeeded;

        //Prompt for and read in the length of the room

        //Prompt for and read in the width of the room

        //Prompt for and read in the height of the room

        //Compute the total square feet to be painted--think
        //about the dimensions of each wall

        //Compute the amount of paint needed

        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.

    }
}
