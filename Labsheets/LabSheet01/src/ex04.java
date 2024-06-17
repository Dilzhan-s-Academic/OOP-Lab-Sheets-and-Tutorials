import java.util.Scanner;

public class ex04 {
	public static void main(String arg[]) {
		Scanner myObj = new Scanner(System.in);

		System.out.print("Value of the day : ");
		String dayValue = myObj.nextLine();

		myObj.close();
		
		switch(dayValue) {
		case "1":
			System.out.println("Day of the week : Monday");
			break;
		case "2":
			System.out.println("Day of the week : Tuesday");
			break;
		case "3":
			System.out.println("Day of the week : Wednesday");
			break;
		case "4":
			System.out.println("Day of the week : Thursday");
			break;
		case "5":
			System.out.println("Day of the week : Friday");
			break;
		case "6":
			System.out.println("Day of the week : Saturday");
			break;
		case "7":
			System.out.println("Day of the week : Sunday");
			break;
		default:
			System.out.println("Invalid Value!!");
		}
		System.out.println("Good Bye!");
	}
}
