public class ex08 { 
    public static void main(String[] args){ 
        Pet p = new Pet("Lissie","Smith",3); 
        p.showDetails(); 
        System.out.println("\n -------------------------------- \n");
        Cat c = new Cat("Kyan", "Silva", 4, 4); 
        c.showDetails(); 
        System.out.println("\n -------------------------------- \n");
        //newborn
        Pet pNew = new Pet("Rex","John"); 
        pNew.showDetails(); 
        System.out.println("\n -------------------------------- \n");

        Cat cNew = new Cat("Kity", "Cooray"); 
        cNew.showDetails(); 
        System.out.println("\n -------------------------------- \n");

        //dog
        Dog dog1 = new Dog("Tommy", "Kris", 3 , 5); 
        dog1.showDetails();
        System.out.println("\n -------------------------------- \n");

        Dog dog2 = new Dog("Cruso", "Merry"); 
        dog2.showDetails(); 
        System.out.println("\n -------------------------------- \n");
} 
}//end of the demo class

public class Pet {
    private String name;
    private String owner;
    private int age;

    public Pet(String n, String o, int a) {
        this.name = n;
        this.owner = o;
        this.age = a;
    }
    public Pet(String n, String o) {
        this.name = n;
        this.owner = o;
        this.age = 0;
    }

    public void showDetails(){
        System.out.println("I am a pet. My name is "
        +this.name+". My owner is "+this.owner);
    }
}//end of the pet class

public class Cat extends Pet{
    private int livesLeft;
    public Cat(String n, String o, int a, int l) {
        super(n, o, a);
        this.livesLeft = 0;
    }

    public Cat(String n, String o) {
        super(n, o);
        this.livesLeft = 7;
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("I am a cat. " +
        this.livesLeft + " lives remain for me.");
    }

}//end of the pet class

public class Dog extends Pet{
    private int numOfMasters;
    public Dog(String n, String o, int a, int m) {
        super(n, o, a);
        this.numOfMasters = m;
    }

    public Dog(String n, String o) {
        super(n, o);
        this.numOfMasters = 1;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("I am a dog. I have "+ numOfMasters +" masters at home");
    }
}//end of the pet class
