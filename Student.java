
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{ 
    //Course[] stud = new Course[3]; 
   Course[] course= new Course[3];
    private int StuNum;
   
    
    Student(){
        for (int i = 0; i < course.length; i++){
            //this.stud[i]=new Course();
            this.course[i]=new Course();
        }
    }

    public void setCourse(String id, int index) {this.course[index].setCourse(id);}

    public Course getcourses(int index) { return this.course[index];}

    public void setStudentNum(int stu) { this.StuNum=stu;}

    public int getStudentNum() {return this.StuNum;} 
    
    public void setCreditHours(int cr, int index){this.course[index].setCreditHours(cr);}
    
    public Course getCredit(int index) {return this.course[index];}
    
    public void setGrade(char gr,int index) {this.course[index].setGrade(gr);} 
    
    public Course getGrade(int index){return this.course[index];}
    
    
     

    // Thiago Braun 
    /*private int studentId;
    public int getStudentId() {
    return studentId;
    }

    public Student(int studentId){
    this.studentId=studentId;
    }

    public void setStudentId(int studentId) {
    this.studentId = studentId;
    // Thiago Braun

    Course[] college = {
    new Course("Computer Science", "B" , 25,4 ),
    new Course("Health Science", "A", 20 , 5),
    new Course("Teacher Education", "C", 15, 6),
    new Course("Construction","B" , 17 , 4),
    new Course("Welding", "D" , 18 , 6)
    };

    }

    public static void main(){
    int studentId = 0;
    Student st = new Student(studentId);
    st.setStudentId(1);
    }*/
}
