public class ex04 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName("DilZhan");
        s1.setDitNo(1122);
        s1.setAddress("Malabe");

        System.err.println(s1.getDetails());

        s2.setName("Yapa");
        s2.setDitNo(32211);
        s2.setAddress("Battalamulla");

        System.out.println(s2.getDetails());


    }
}

class Student{
    private String name;
    private int ditno;
    private String address;

    Student(){
        this.name = "";
        this.ditno = 0;
        this.address = "";
    }

    Student(String name,int ditno,String address){
        this.name = name;
        this.ditno = ditno;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    };

    public void setDitNo(int ditno){
        this.ditno = ditno;
    };

    public void setAddress(String address){
        this.address = address;
    };

    public String getName(){
        return name;
    };

    public int getDitNo(){
        return ditno;
    };

    public String getAddress(){
        return address;
    };

    public String getDetails(){
        return "\nI am a Student. \nMy name is " + name +".\nI am from " + address + "\nMy dit no is : " + ditno;
    }
}