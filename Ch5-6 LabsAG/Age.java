/**
 * Create what can people do based on their age
 * 
 * Antonio Goncalves
 * October 18, 2022
 */

import java.util.Scanner;

public class Age
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int Age;
       String Ability = "";
        System.out.println("Type in your age to see what you could do base on your age: ");
        Age = scan.nextInt();

           if(Age==16)
       {
           Ability = " You can have your driver lisence";
           Ability = " You can open your own bank account";
       }
       else if (Age==15)
       {
           Ability = " You can rent and buy a 15 category film";
       }
       else if(Age>=18 && Age<21)
       {
           Ability = " You can vote";
           Ability = " You can marry without";
       }
       else if(Age==21)
       {
           Ability = " You are legally to by alcohol";
           Ability = " You can adopt a child";
       }
       else if (Age>=35 && Age<66)
       {
           Ability = " You can elect as President";
       }
       else if (Age>=66)
       {
           Ability = " You can retirer";
       }
       System.out.println("At the age of " +Age+ "" + Ability);
    }
}