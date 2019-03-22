
import java.util.Scanner;

public class Input
{

    public static void main(String[] args){
        Scanner cc =  new Scanner(System.in);
        Scanner sg =  new Scanner(System.in);
        Scanner ccred = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Student[] stud = new Student[3];
        for (int i=0; i < stud.length; i++) {
            //Asks user to put in the student ID
            System.out.println ("-----Enter a StudentID-----");
            stud[i]= new Student();
            stud[i].setStudentNum(cc.nextInt());
            System.out.println(stud[i].getStudentNum());
            for (int d=0; d < 2; d++){
                //Asks user to put in a course. 
                System.out.println ("-----Enter a Course-----");
                stud[i].setCourseID(sg.nextLine(),d);
                System.out.println(stud[i].getCourse(d).getCourseID());
//prompts user to enter a credit number fot that class.
                System.out.println ("-----Enter a Credit-----");
                stud[i].setCredits(ccred.nextInt(),d);
                System.out.println(stud[i].getCourseCredits(d).getCredits());
//prompts user to enter their grade in that class. 
                System.out.println ("-----Enter a Grade for class-----");
                stud[i].setGrades(y.next().charAt(0),d);
                System.out.println(stud[i].getGrade(d).getGrade());

            }

        }
        //This is the Print out This shows what the code savs. Then prints out the usersinput starting with 0 aka the very first thing. 
        for (int i=0; i<stud.length; i++){
            System.out.println("Student #" + stud[i].getStudentNum());
            System.out.println("Course ID # \tCredit hour \t Grade");
            for (int c = 0; c<2; c++){
                System.out.println((c+1)+ "--" + "\t" +
                    stud[i].getCourse(c).getCourseID() + "\t"+
                    stud[i].getCourseCredits(c).getCredits() + "\t" +
                    stud[i].getGrade(c).getGrade());
                  
                }
        }
    }
}
