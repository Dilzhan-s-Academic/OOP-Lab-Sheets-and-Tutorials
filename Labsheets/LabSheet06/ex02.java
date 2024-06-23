import java.util.Scanner;

public class ex02 {
    public static void main (String[] arg) {
        Student[] studentList = {new Student("IT1232343","Kamal", 2.985),
                                 new Student("IT2324042", "Piyal", 3.423),
                                 new Student("IT8372874", "Saman", 3.942)};

        for (Student a : studentList) {
            System.out.println();
            System.out.println("Student ID : " + a.studentID);
            System.out.println("Student Name : " + a.studentName);
            System.out.println("Student GPA : " + a.gpa);
        }
    }
}

public class Student{
    public String studentID;
    public String studentName;
    public double gpa;

    Student(String studentID, String studentName, double gpa){
        this.studentID = studentID;
        this.studentName = studentName;
        this.gpa = gpa;
    }
}