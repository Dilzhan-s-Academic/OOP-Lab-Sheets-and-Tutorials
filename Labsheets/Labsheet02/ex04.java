import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex04 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);

        // BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in)) -> another way

        System.out.print("Enter the Height (cm) : ");
        double height = Double.parseDouble(bfr.readLine());

        System.out.print("Enter the Width (cm) : ");
        double width = Double.parseDouble(bfr.readLine());

        System.out.print("Enter the Length (cm) : ");
        double length = Double.parseDouble(bfr.readLine());

        bfr.close();
        isr.close();

        double vol = height * width * length ;

        System.out.println("Cube Volume : " + vol + "cm³");

    }
}
