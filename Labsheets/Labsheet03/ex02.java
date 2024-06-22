public class ex02 { // Test class (in Labsheet)
    public static void main(String[] args) {

        Student s1 = new Student("DilZhan",1122,"Malabe");
        Student s2 = new Student("Yapa",2211,"Battalamulla");

        System.out.println("Student1 Name : " + s1.name);
        System.out.println("Student1 DitNo : " + s1.ditno);
        System.out.println("Student1 Address : " + s1.address + "\n\n");

        System.out.println("Student2 Name : " + s2.name);
        System.out.println("Student2 DitNo : " + s2.ditno);
        System.out.println("Student2 Address : " + s2.address);
    }
}

class Student{
    String name;
    int ditno;
    String address;

    Student(String name,int ditno,String address){
        this.name = name;
        this.ditno = ditno;
        this.address = address;
    }
}