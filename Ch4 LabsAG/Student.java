// ****************************************************************
// Student.java
//
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and print the student's name.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private int test1;
    private int test2;
    //constructor
    public Student(String studentName)
    {
        name = studentName;
    }
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    public void inputGrades()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter " +name+ "'s score fot test1");
        test1 = sc.nextInt();
        System.out.println("Enter " +name+ "'s score fot test2");
        test2 = sc.nextInt();
    }
    //getAverage: compute and return the student's test average
    //add header for getAverage
    public double getAverage()
    {
         return (test1 + test2) / 2;
    }
    //getName: return the student's name
    //add header for getName
    public String getName()
    {
        return name;
    }
    //toString: return the student's name, test1 and test2
    //add a header for toString
    public String toString()
    {
        //add body of toString
        
        return "Name: " + name + " Test 1: " + test1 + "" + " Test 2: " + test2;
    }
}