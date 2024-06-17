import java.util.Scanner;

public class ex03 {
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Age : ");
		int age = Integer.parseInt(scanner.nextLine());

		scanner.close();
		
		if(age > 18) {
			System.out.println("Adult");
		}else {
			System.out.println("Child");
		}
	}

}