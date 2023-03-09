
/**
 * Write a description of class Dog1B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog1B
{
    //Instance Data
    private String name;
    private int numLegs;
    private double weight;
    private boolean alive;
    public Dog1B()
    {
        // initialise instance variables
        name = "";
        numLegs = 0;
        weight = 0.0;
        alive = false;
    }
    
    public Dog1B(String n, int l, double w, boolean a)
    {
        name = n;
        numLegs = l;
        weight = w;
        alive = a;
    }
    
    public void speak()
    {
        System.out.println(name + " says Woof!");
        
    }
}
