import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the Height (cm) : ");
        double height = scn.nextDouble();

        System.out.print("Enter the Width (cm) : ");
        double width = scn.nextDouble();

        System.out.print("Enter the Length (cm) : ");
        double length = scn.nextDouble();

        scn.close();

        double vol = height * width * length ;

        System.out.println("Cube Volume : " + vol + "cm³");

    }
}
