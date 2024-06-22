public class ex07{
    public static void main(String[] args) {
        PartTimeStudent p1 = new PartTimeStudent("Kamal", "Kottawa", "IT21212121", 9.8);
    
        p1.showDetails();
    }

}

public class Person{
    protected String name;
    protected String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void showDetails(){
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println();
    }
}

public class Student extends Person {
    protected String studentID;

    Student(String name, String address, String studentID){
        super(name,address);
        this.studentID = studentID;

    }

    public void showDetails(){
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Student ID : " + studentID);
        System.out.println();
    }
}

public class PartTimeStudent extends Student {
    private double workingHours;

    PartTimeStudent(String name, String address, String studentID, double workingHours){
        super(name, address, studentID);
        this.workingHours = workingHours;

    }

    public void showDetails(){
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Student ID : " + studentID);
        System.out.println("Working Hours : " + workingHours);
        System.out.println();
    }
}