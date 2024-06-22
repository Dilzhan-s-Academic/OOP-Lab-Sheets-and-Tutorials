class Main {
    public static void main(String[] args) {
        //we need to remove animal object creations bcs we cant create any object using abstract class
            // Animal animal1 = new Animal("test");
            // animal1.display();

        Cat mycat = new Cat("Micky");
        mycat.display();
        Dog mydog = new Dog("Rover");
        mydog.display();
        ToyCat mytoy = new ToyCat();
        mytoy.display();
    }
}

abstract class Animal {
    private String name;

    public Animal() {
        System.out.println("Animal constructor called");
    }


    public Animal(String name) {
        this.name = name;
    }

    abstract String speak();

    public void display() {
        System.out.println("My name is " + this.name + ". " + this.speak() + ".");
    }

}

class Dog extends Animal {
    
    public Dog(String name) {
        super(name);
    }
    
    public String speak() {
        return "Bow Wow";
    }
}
class Cat extends Animal {
    public Cat(){}

    public Cat(String name) {
        super(name);
    }
    public String speak() {
        return "Meow Meow";
    }
}
class ToyCat extends Cat {
    String manufacturer;
    
    public ToyCat(){
    }
    public ToyCat(String name, String manufacturer) {
        super(name);
        this.manufacturer = manufacturer;
    }
    public void display() {
        super.display();
        System.out.println("I am from " + manufacturer + ".");
    }
}


//when we create an object using ToyoCat using default constructor. that constructor call the it's parent class (Cat)default Constructor. Cat's default constructor call the Animal Class Default constructor. its print the "Animal constructor called" in the console.