/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeCourse
{
    private String CourseID;
    //private int CreditHours;
    private char Grade;
    private int Credits;

    public String getCourseID()
    {
        return this.CourseID;
    }

   
    public int getCredits()
    {
        return this.Credits;
    }

    public char getGrade()
    {
        return this.Grade;
    }

    public void setCourseID(String idNum)
    {
        this.CourseID = idNum;
    }

    public void setCredits(int cr)
    {
        this.Credits = cr;
    }

    public void setGrade(char gr)
    {
        this.Grade = gr;
    }
}
