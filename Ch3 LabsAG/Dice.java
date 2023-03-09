//Antonio G.
//October 4, 2022
//Create a Dice

public class Dice
{
    public static void main (String args[])
    {
        int dice1 = (int)(Math.random()*6)+1;
        int dice2 = (int)(Math.random()*6)+1;
        int dice3 = dice1 + dice2;
        System.out.println("You rolled a " + dice1 
        + " and a " + dice2 + " for a total roll of " 
        + dice3 + " .");
    }
}