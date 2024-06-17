import java.util.Scanner;
public class ex07 {
	public static void main(String arg[]) {
		int num1,num2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the 1st Number : ");
		num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Enter the 1st Number : ");
		num2 = Integer.parseInt(scanner.nextLine());
		
		double avg = ( num1 + num2 ) / 2.0;
		int total = num1 + num2;
		
		System.out.println("Total is : " + total);
		System.out.println("Average is : " + avg);
		
	}

}
