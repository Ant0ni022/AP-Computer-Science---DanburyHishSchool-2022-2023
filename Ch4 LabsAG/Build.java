public class Build
{
    private double budget;
    private String brand;
    private String parts;
    private String color;
    private int fee;
    
    
    public Build()
    {
        budget = 0.0;
        brand = "";
        parts = "";
        color = "";
        fee = 0;
    }
    public Build(double totalBudget, String brd, String prts, String clr, int f)
    {
        budget = totalBudget;
        brand = brd;
        parts = prts;
        color = clr;
        fee = f;
    }
    public void setFee()
    {
        
    }
    //   https://www.freecodecamp.org/news/java-getters-and-setters/#:~:text=The%20getter%20method%20returns%20the,assigns%20it%20to%20the%20attribute.&text=Getters%20and%20setters%20allow%20control,before%20actually%20setting%20the%20value.
}