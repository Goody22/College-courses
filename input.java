import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 * Write a description of class input here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class input
{
    
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
        Scanner y = new Scanner(System.in);

        Student[] attempt = new Student[2];
        
       
 
    for (int i = 0; i <attempt.length; i++){
        System.out.println();
        System.out.println("==Enter ID==");

        attempt[i]=new Student();
        attempt[i].setStudentNum(c.nextInt());

        for (int z = 0; z<3;z++){
            System.out.println("==Enter Courses==");
            attempt[i].setCourse(t.nextLine(),z);
            System.out.println(attempt[i].getcourses(z).getCourse());
            System.out.println("==Enter Credit==");
            attempt[i].setCreditHours(p.nextInt(),z);
            System.out.println(attempt[i].getCredit(z).getCreditHours());
            System.out.println("==Enter Grade==");
                attempt[i].setGrade(y.next().charAt(0),z);
                System.out.println(attempt[i].getGrade(z).getGrade());

            }

        }
        for (Student a : attempt){
                System.out.println("Student"+ ": "+ a.getStudentNum());
                for (Course i : ){
                    System.out.println(i.getCourse());
                }
            }
    }
}

