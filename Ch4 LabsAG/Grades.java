// ****************************************************************
// Grades.java
//
// Use Student class to get test grades for two students
// and compute averages
//
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        Student student2 = new Student ("Mike");
        student1.inputGrades();
        System.out.println("The average for " +student1.getName()+ " from both test is " + student1.getAverage());
        student2.inputGrades();
        System.out.println("The average for " +student2.getName()+ " from both test is " + student2.getAverage());
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        //create student2, "Mike"
        //input grades for Mary
        //print average for Mary
        //input grades for Mike
        //print average for Mike
        //print the student variables directly
    }
}