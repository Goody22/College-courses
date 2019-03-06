import javax.swing.JOptionPane;
public class Course
{
    private  String title;
    private  int hours;
    private  String grade;
    private  int id;

    public Course(String title, String grade, int id, int hours){
        this.title = title;
        this.grade = grade;
        this.id = id;
        this.hours = hours;
    }

    public void setGrade(String g){
        grade = g;
    }

    public String getGrade(){
        return grade;   
    }

    public void setTitle(String t){
        title = t;   
    }

    public String getTitle() {
        return title;
    }

    public void setId(int i){
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setHours(int h){
        hours = h;
    }

    public int getHours() {
        return hours;
    }

    public static void main(String[] arg){
        String result;
        result=JOptionPane.showInputDialog(null," what is your name");
        JOptionPane.showMessageDialog(null,"Hello"+ result+"!");

    }
}

