public class ex05{
    public static void main(String[] args) {
        Person p1 = new Person("Kamal","Kottawa");
    
        p1.showDetails();
    }

}

public class Person{
    private String name;
    private String address;

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