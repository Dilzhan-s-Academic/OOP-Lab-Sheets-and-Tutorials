public class ex02 {
    public static void main (String[] arg){

    }
}

class Feet {
    private int feet;
    private int inches;
    public Feet(int feet, int inches){
        this.feet = feet;
        this.inches = inches;
    }

    public Feet(Feet that) {
        this.feet = that.feet;
        this.inches = that.inches;

        this.feet += this.inches / 12;
        this.inches = this.inches % 12;
    }
    // Add f1+f2 feet and store in current feet
    public void add(Feet f1, Feet f2){
        this.feet = f1.feet + f2.feet;
        this.inches = f1.inches + f2.inches;

        this.feet += this.inches / 12;
        this.inches = this.inches % 12;
    }

    public void add(Feet that) {
        this.feet += that.feet;
        this.inches += that.inches;

        this.feet += this.inches / 12;
        this.inches = this.inches % 12;
    }
    // Display a Length e.g 5’6”
    public void print() {
        System.out.println(feet + "'" + inches + "\"");
    }
    public void print(String msg) {
        System.out.println(msg + feet + "'" + inches + "\"");
    }

    // public static Feet add(Feet f1, Feet f2){} -> cant use bcs method add(Feet,Feet) is already defined in class Feet

    public static Feet add(Feet f1, Feet f2, Feet f3) {
        int feet = f1.feet + f2.feet + f3.feet;
        int inches = f1.inches + f2.inches + f3.inches;

        feet += inches / 12;
        inches = inches % 12;

        Feet fr = new Feet(feet,inches);

        return fr;
    }

    public static void print(Feet f) {
        f.print();
    }
}
