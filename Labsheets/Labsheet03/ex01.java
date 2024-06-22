public class ex01 { // Test class (in Labsheet)
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dilzhan";
        s1.ditno = 1122;
        s1.address = "Malabe";

        Student s2 = new Student();
        s1.name = "Yapa";
        s1.ditno = 2211;
        s1.address = "Battalamulla";

        System.out.println("Student1 Name : " + s1.name);
        System.out.println("Student1 DitNo : " + s1.ditno);
        System.out.println("Student1 Address : " + s1.address + "\n\n");

        System.out.println("Student2 Name : " + s2.name);
        System.out.println("Student2 DitNo : " + s2.ditno);
        System.out.println("Student2 Address : " + s2.address);
    }
}

class Student{
    public String name;
    public int ditno;
    public String address;
}