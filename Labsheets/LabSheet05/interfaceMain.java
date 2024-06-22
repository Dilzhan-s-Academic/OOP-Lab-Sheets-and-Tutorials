public class interfaceMain{
    public static void main(String[] args) {
        ICompute obj1 = new Person("Danushka",40000, 1000, 5);
            obj1.calculate();
            obj1.display();
        ICompute obj2 = new Box(10, 20, 30);
            obj2.calculate();
            obj2.display();
    }
}

interface ICompute {
    void calculate();
    void display();
}
class Person implements ICompute {
    private String name;
    private double basicSal;
    private double otRate;
    private double otHrs;
    private double netSal;

    public Person(String name, double basicSal, double otRate, double otHrs){
        this.name = name;
        this.basicSal = basicSal;
        this.otHrs = otHrs;
        this.otRate = otRate;
    }

    public void calculate(){
        netSal = basicSal + (otHrs * otRate);
    }

    public void display(){
        System.out.println("\n-----------------------------------\n");
        System.out.println("Name : " + name);
        System.out.println("Basic Salary : " + basicSal);
        System.out.println("OT Hours : " + otHrs);
        System.out.println("OT Rate : " + otRate);
        System.out.println("Net Salary : " + netSal);
        
    }
}
class Box implements ICompute {
    private int length, width, height;
    private int volume;

    public Box(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void calculate(){
        volume = length * width * height;
    }

    public void display(){
        System.out.println("\n-----------------------------------\n");
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
        System.out.println("Volume : " + volume);

    }
}