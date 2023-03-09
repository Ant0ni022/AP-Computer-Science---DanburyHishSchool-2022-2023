import java.util.Scanner;
public class MountainBike
{
    public MTB()
    {
        
        PreBuilts
        
        String [] Brands = {"Trek","Santa Cruz","Specialized","Cannondale"};
        String[] Parts = {"Frame","Wheels","Forks","Brakes","sandle"};
    }
    public Parts (){}
    Public Brans(){}
    public static void main(String[] args)
    {
        System.out.println("HelloWorld!");
        Scanner sc = new Scanner (System.in);

        
        /**
         * list of brands
         * list of parts
         * list of price
         * list of pre-builts (which should contain the parts + brands + pricing of each parts and total amount)
         * if built by someone ask if they wanna keep adding all parts or check out with only necessary parts
         * promt the list of that that is required to built a bike
         *
         *This custom lab is refer of one of my hobbies, Mountain Bike. 
         *
         */

        String [] brands = {"Trek","Santa Cruz","Specialized","Cannondale"};
        String[] parts = {"Frame","Wheels","Forks","Brakes","sandle"};
        double[] prices = {};
        String brand = "";
        String Choise1 = "";
        String Choise2 = "";
        String Choise3 = "";
        System.out.println("Welcmem to the best mountain bike store in the entire New England!");
        System.out.println("Let me guess you're looking for a bike to go either crusing or skyrocking downhill!");
        System.out.println("Well lets start looking for the perfect bike for you!");
        System.out.println("Would you like a pre-bult of pick some parts?");
        Choise1 = sc.next();

        if(Choise1.equalsIgnoreCase("prebuilt"))
        {
            System.out.println("This are some of the brands that we have to offer?\nWhich brand would you like");
            System.out.println("Trek\tSanta Cruz\tSpecialized\tCannondale");
            brand = sc.next();
            if (brand.equalsIgnoreCase("Trek"))
            {

            }
            if (brand.equalsIgnoreCase("Santa Cruz"))
            {

            }
            if (brand.equalsIgnoreCase("Specialized"))
            {

            }
            if (brand.equalsIgnoreCase("Cannondale"))
            {

            }

        }
        else if(Choise1.equalsIgnoreCase("parts"))
        {
            System.out.println("This are some of the parts that we have to offer!\nWhich part would you like");
            System.out.println("Frames\tWheels\tForks\tBrakes\tSandles");
            Choise2 = sc.next();
            if(choise2.equalsIgnoreCase("Frames"))
            {
                System.out.println("For Frames the price varie from the brand that you chose\nWhich one are would you like");
                System.out.println();
                Choise3 = sc.next()
                if(Choise3.equalsIgnoreCase())
                {

                }
            }
            if(choise2.equalsIgnoreCase("Wheels"))
            {

            }
            if(choise2.equalsIgnoreCase())
            {

            }
        }
    }
}