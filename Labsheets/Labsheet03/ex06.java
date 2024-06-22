public class ex05{
    public static void main(String[] args) {
        Student p1 = new Student("Kamal","Kottawa","IT21212121");
    
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
    private String studentID;

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