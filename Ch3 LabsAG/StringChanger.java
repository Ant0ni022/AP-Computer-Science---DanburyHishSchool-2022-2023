/**
 * This is the proccess of the StringChanger and 
 * some of the strong methods
 * 
 * Antonio Goncalves 
 * November 26, 2022
 */
import java.util.Scanner;
public class StringChanger
{
    public static void main (String[] args)
    {
       Scanner scan = new Scanner(System.in);
       String Phrase;
       String Chrt1;
       String Chrt2;
       int num1;
        System.out.println("Type anything that you would like: ");
        Phrase = scan.nextLine();
        System.out.println("The Length of you phrase is: " +Phrase.length());
        System.out.println("In numerical order type what character you want to be be returned: ");
        num1 = scan.nextInt();
        char ch1 = Phrase.charAt(num1);
        System.out.println("You typed numer " +num1+ " Which is the Character: " + "\""+ch1+"\"");
        System.out.println("Type in what character you want to replace, and " + 
        " what is the character that you want to replace with: ");
        Chrt1 = scan.next();
        Chrt2 = scan.next();
        System.out.println(Phrase.replace(Chrt1,Chrt2));
        System.out.println("This is an example of subtring with one perimetter using the number 4: ");
        System.out.println(Phrase.substring(4));
        System.out.println("This is an example of subtring with two perimetter which the number are 4 and 10: ");
        System.out.println(Phrase.substring(4,10));
        System.out.println("This is an example of the whole Phrase that you've typed in Uppercase: ");
        System.out.println(Phrase.toUpperCase());
        System.out.println("This is an example of the whole Phrase that you've typed in Lowercase: ");
        System.out.println(Phrase.toLowerCase());
        
        
    }
}
