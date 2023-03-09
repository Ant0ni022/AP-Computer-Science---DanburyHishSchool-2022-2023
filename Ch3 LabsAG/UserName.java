
//Antonio G.
//October 4, 2022
//Generate a Username
import java.util.Scanner;
public class UserName
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        String Fname;
        String Lname;
        int num1 = (int)((Math.random()*(99-10+1))+10);
        System.out.println("Type in your first name: ");
        Fname = scan.next();
        System.out.println("Type in your last name: ");
        Lname = scan.next();
        Fname = Fname.substring(0,1);
        Lname = Lname.substring(0,5);
        System.out.println("Your user name is: " + Fname + Lname + num1);
        
    }
}