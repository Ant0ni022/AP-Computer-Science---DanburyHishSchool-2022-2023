/**
 * Antonio Goncalves
 * September 14, 2022
 */

import java.util.Scanner;

public class IdealWeight
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int feet;
        int inches;
        int femaleWeight;
        int maleWeight;
        int totalInches;
        float percentage1;
        float percentage2;
        float percentage3;
        float percentage4;
        float percentage5;
        float percentage6;
        System.out.println("Find your Ideal Weight");
        System.out.println("What is yout height in feet? ");
        feet = scan.nextInt();
        System.out.println("What is yout height in inches? ");
        inches = scan.nextInt();
        totalInches = feet*12 + inches; 
        femaleWeight = 100 + (totalInches - 60)*5;
        maleWeight = 106 + (totalInches - 60)*6;
        percentage1 = (femaleWeight * 15) / 100;
        percentage2 = (maleWeight * 15) / 100;
        percentage3 = percentage1 + femaleWeight;
        percentage4 = femaleWeight - percentage1;
        percentage5 = percentage2 + maleWeight;
        percentage6 = maleWeight - percentage2;
        System.out.println("The ideal weight for a " +feet+ " foot and " +inches+ " inches female is " + femaleWeight + " pounds.");
        System.out.println("The ideal weight for a " +feet+ " foot and " +inches+ " inches male is " + maleWeight + " pounds.");
        System.out.println("A weight in a range of " +percentage6+ " to " +percentage5+ " is ok for males.");
        System.out.println("A weight in a range of " +percentage4+ " to " +percentage3+ " is ok for females.");
        
    }
}