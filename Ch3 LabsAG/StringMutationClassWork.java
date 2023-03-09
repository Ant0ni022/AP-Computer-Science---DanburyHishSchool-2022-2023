public class StringMutationClassWork
{
    public static void main (String[] args)
    {
        String firstName = "Antonio";
        String middleNAme = "Coelho";
        String lastName = "Goncalves";

        String fullName = firstName + " " + middleNAme + " " + lastName;
        String secondName = "Patricia DeAlmeida";
        
        System.out.println(fullName);
        
        String up = fullName.toUpperCase();
        System.out.println(up);
        
        String low = fullName.toLowerCase();
        System.out.println(low);
        
        String rep = fullName.replace('o' , '$');
        
        System.out.println(rep);
        
        int phraseLength = fullName.length();
        System.out.println(phraseLength);
        
        int middleIndex = phraseLength / 2;
        System.out.println(middleIndex);
        
        char letter = fullName.charAt(10);
        System.out.println(letter);
        
        String sub1 = fullName.substring(16);
        System.out.println(sub1);
        
        String sub2 = fullName.substring(15,24);
        System.out.println(sub2);
    }
}