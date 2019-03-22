import  javax.swing.JOptionPane;
public class Student 
{ 

    CollegeCourse[] courses = new CollegeCourse[2];
    CollegeCourse[] option = new CollegeCourse[2];
    private int sNum;
    Student(){
        for (int i=0; i < courses.length; i++){
            this.courses[i] =new CollegeCourse();
            this.option[i] =new CollegeCourse();

        }
    }

    public void setCourseID(String id, int index){this.courses[index].setCourseID(id);}       

    public CollegeCourse getCourse(int index) {return this.courses[index];}

    public void setCredits(int cr, int index){this.option[index].setCredits(cr);}       

    public CollegeCourse getCourseCredits(int index) {return this.option[index];}
    
    public void setGrades(char cr, int index){this.option[index].setGrade(cr);}       

    public CollegeCourse getGrade(int index) {return this.option[index];}

    public void setStudentNum(int stu) {this.sNum = stu;}

    public int getStudentNum() {return this.sNum;}
    
    

}

