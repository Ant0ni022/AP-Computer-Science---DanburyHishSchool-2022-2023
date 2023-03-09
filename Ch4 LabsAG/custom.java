import java.util.Scanner;
import java.util.Arrays;

class MountainBike
{
    String brand;
    double WheelSize;
    double price;
    String color;
    String tag;
    String[] brands = {"specialized", "santa Crus", "trek", "cannondale"};
    String[] colors = {"black", "white", "grey", "red", "yellow", "sand"};
    public void printDetails()
    {
        System.out.println("\t\tDetails Info your your custom Bike!");
        System.out.println("The choosen Brand is: " + brand);
        System.out.println("The Wheel Size is: " + WheelSize);
        System.out.println("The choosen color is: " + color);
        System.out.println("Here is your custom tag written on you bike: " + tag);
        System.out.println("The total would be: " + price);

    }

    public String getBrand()
    {
        return brand;
    }

    public double getPrice()
    {
        if(brand .equalsIgnoreCase("specialized"))
        {
            price = 1300.0;
            return price;  
        }
        else if(brand .equalsIgnoreCase("santa cruz"))
        {
            price = 1700.0;
            return price;  
        }
        else if(brand .equalsIgnoreCase("trek"))
        {
            price = 2250.0;
            return price;  
        }
        else if(brand .equalsIgnoreCase("cannondale"))
        {
            price = 1700.0;
            return price;  
        }
        return 0.0;
    }

    public double getWheelSize()
    {
        return WheelSize;
    }

    public String getColor()
    {
        return color; 
    }

    public String getTag()
    {
        return tag;
    }
}
public class custom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        MountainBike mountainBike = new MountainBike();

        System.out.println("Lets build you Mountain Bike!");
        System.out.println("First from 0-3 what brand would you like");
        System.out.println("Here are the brands that we carry " + Arrays.toString(mountainBike.brands));
        System.out.println("whoch the first brand being the number 0, type 0 and there forward");
        mountainBike.brand = mountainBike.brands[sc.nextInt()];
        System.out.println("What wheel size would you likeyou bike to have?");
        System.out.println("Here are some options: 26 - 27.5 - 29");
        mountainBike.WheelSize = sc.nextDouble();
        mountainBike.price = mountainBike.getPrice();
        System.out.println("What color do you want your bike to be?");
        System.out.println("Here are the list of colors " + Arrays.toString(mountainBike.colors));
        System.out.println("whoch the first brand being the number 0, type 0 and there forward");
        mountainBike.color = mountainBike.colors[sc.nextInt()];

        System.out.println("Now add a message or tag that you want to be printed on your bike");

        mountainBike.tag = sc.next();
        System.out.println();
        mountainBike.printDetails();

    }
}
