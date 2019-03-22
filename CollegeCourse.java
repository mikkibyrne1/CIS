
public class CollegeCourse
{
    private String CourseID;
    //This is the set and get code. 
    //It makes it so when you are in my other code input it can set the grades ect.. 
    //This code also is used in input to get code, for example getGrades. 
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
