//import javax.swing.JOptionPane;
public class Course
{

    private String Course;
    private int CreditHours;
    private char Grade;

    public String getCourse()
    {
        return this.Course;
    }

    public void setCourse(String ID){
        this.Course = ID;
    }

    public void setCreditHours(int cr){
        this.CreditHours = cr;
    }

    public int getCreditHours(){
        return this.CreditHours;
    }

    public void setGrade(char gr){
        this.Grade = gr;
    }

    public char getGrade(){
        return this.Grade;
    }

    
}

