public class StudentApp{
    public static void main(String[] arg){
        Student[] students = new Student[5];
        students[0] = new Student("Kamal","IT","0723981921");
        students[1] = new Student("Sunil","Engineering","0923374732");
        students[2] = new Student("Chathura","Engineering","028387268");
        students[3] = new Student("Dilshan","IT","0782732138");
        students[4] = new Student("Amal","IT","01878342231");

        for(Student s : students){
            s.print();
        }
    }
}
public class Student{
    private int studentID;
    private String name;
    private String degree;
    private String mobile;
    private static int max = 100;

    public Student(String name, String degree, String mobile){
        studentID = Student.getNextStudentID();
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDegree(String degree){
        this.degree = degree;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    public String getName(){
        return name;
    }

    public String getDegree(){
        return degree;
    }

    public String getMobile(){
        return mobile;
    }

    public void print(){
        System.out.println("Student ID : " + studentID );
        System.out.println("Name : " + name );
        System.out.println("Degree : " + degree );
        System.out.println("Mobile : " + mobile );
        System.out.println("\n-----------------------------------\n");
    }

    public static int getNextStudentID(){
        return max++; 
    }
}
 