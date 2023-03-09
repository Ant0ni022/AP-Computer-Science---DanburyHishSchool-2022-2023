/**
 * Programmer: Antonio G.
 *Date: November 26, 2022
 * StringMutation works with string methods, printing length, 1st half, 2nd half, middle 3
 * characters, switch 1st & 2nd halfs, replace a character, use compareTo & equals
 *Strings are immutable so need new variables to store modified versions of strings
 */
public class StringMutation
{
    public static void main(String[] args)
    {
        String myString = new String("This is a test String.");
        String myString2 = "This is a second test String.";
        int phraseLength, middleIndex;
        String firstHalf, secondHalf, switchPhrase, middle3;

        //manipulation of myString (If you would like more practice, repeat for myString2)
        
        //determine and store length
        phraseLength = myString.length();
        
        //find and store middleIndex
        middleIndex = phraseLength / 2;
        
        //store first half
        firstHalf = myString.substring(0,middleIndex);
        
        //store second half (can be done 2 ways)
        secondHalf = myString.substring(middleIndex,phraseLength);
        
        //place first half at end of second half
        switchPhrase = secondHalf.concat(firstHalf);
        
        //find the middle 3 characters
        
        //print the following:
        System.out.println(myString);
        
        System.out.println("The length of the Phrase is: " + phraseLength);
        
        System.out.println("The middle index of the phrase is: " + middleIndex);
        
        System.out.println("The character locate at the middle of the phrase is: " + 
        myString.charAt(middleIndex));
        
        System.out.println("Replacing all spaces with @ would be like: " + myString.replace(' ','@'));
        
        System.out.println("Lets switch the first half of the phrase with the second phrase: " + 
        (secondHalf + firstHalf));
        
        System.out.println("By using .equals we determine the equality of the string phrases: " + 
        myString.equals(myString2));
        
        System.out.println("Last but not least we'll compare the two Strings: " +
        myString.compareTo(myString2));
        
        //original phrase
        //length of phrase
        //middle index
        //character at middle index
        //replace all spaces with @
        //switched string (secondHalf firstHalf)

        //use equals( ) to determine equality of string phrases
        //use compareTo( ) to determine which comes first alphabetically
    }
}
