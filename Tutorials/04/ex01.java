public class ex01 {
    public static void main(String[] arg){
        Manager m1 = new Manager("Kamal" , 2121 , 60000.00 , 35400.00);
        Deverloper d1 = new Deverloper("Nimal" , 3332 , 2500.00 , 60);

        System.out.println("Manager's Salary : " + m1.calculateSalary());
        System.out.println();
        System.out.println("Deverloper's Salary : " + d1.calculateSalary());
        System.out.println();

        m1.displayDetails();
        System.out.println();
        d1.displayDetails();
        System.out.println();
    }
}

public abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }
    public abstract double calculateSalary();
    public abstract void displayDetails();
}


public class Manager extends Employee {
    double basicSalary;
    double bonus;
    
    public Manager(String name, int employeeId,double basicSalary, double bonus){
        super(name,employeeId);

        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }
    public double calculateSalary() {
        return bonus + basicSalary;
    }

    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Position : Manager ");
    }
}

public class Deverloper extends Employee {
    double hourlyWage;
    double numOfHrs;

    public Deverloper(String name, int employeeId,double hourlyWage, double numOfHrs){
        super(name,employeeId);

        this.hourlyWage = hourlyWage;
        this.numOfHrs = numOfHrs;
    }

    public double calculateSalary() {
        return hourlyWage * numOfHrs;
    }

    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Hourly Wage : " + hourlyWage);
        System.out.println("Worked Hours : " + numOfHrs);
    }
}