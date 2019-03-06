
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // Thiago Braun 
    private int studentId;
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
    }
}
