// ****************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid
// @Antonio Goncalves 
// October 18, 2022      
// ****************************************************************
import java.util.Scanner;

public class Dates
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner (System.in);
    int month, day, year;   //date read in from user
    int daysInMonth;        //number of days in month read in 
    boolean monthValid, yearValid, dayValid;  //true if input from user is valid
    boolean leapYear;  //true if user's year is a leap year
    System.out.println("Type the date for today using 2 digits for month and day, and 4 digits for year ");
    System.out.println("Month: ");
    month = scan.nextInt();
    System.out.println("Day: ");
    day = scan.nextInt();
    System.out.println("Year: ");
    year = scan.nextInt();
    //Get integer month, day, and year from user
    if(year >= 1000 || year<= 1999 == true)
    {
        System.out.println("year is valid");
    }
    else
    {
        System.out.println("year is invalid");
    }
    if(month >= 1 || month<=12 ==true)
    {
        System.out.println("month is valid");
    }
    else
    {
        System.out.println("month is invalid");
    }
    if(day >=1 || day<=31 == true)
    {
        System.out.println("day is valid");
    }    
    else
    {
        System.out.println("day is invalid");
    }
    //Check to see if month is valid
    
    //Check to see if year is valid

    //Determine whether it's a leap year

    //Determine number of days in month

    //User number of days in month to check to see if day is valid

    //Determine whether date is valid and print appropriate message

    }

}

