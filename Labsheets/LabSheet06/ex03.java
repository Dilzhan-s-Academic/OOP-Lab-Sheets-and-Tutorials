import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> uniqueHeights = new HashSet<>();

        System.out.println("Enter the heights of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Height " + (i + 1) + ": ");
            int height = scanner.nextInt();
            uniqueHeights.add(height);
        }

        scanner.close();

        System.out.println("Unique heights are: ");
        for (int height : uniqueHeights) {
            System.out.println(height);
        }
    }
}
