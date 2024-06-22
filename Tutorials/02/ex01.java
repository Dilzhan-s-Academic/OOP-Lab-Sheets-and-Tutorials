public class ex01{
    public static void main(String[] arg){

    }
}

public class Student{
    String sid;
    String sName;
    double mark1;
    double mark2;
    double mark3;
    double avg;


    Student(){
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    public void calAvg(){
        avg = mark1 + mark2 + mark3;
    }

    public void displayMarks(){
        System.out.println("Student ID : " + sid);
        System.out.println("Student Name : " + sName);
        System.out.println("Average : " + avg);
    }
}
