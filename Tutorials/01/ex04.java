import java.util.Scanner;

public class ex04{
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Type Your String Here : ");
        String input = scn.nextLine();

        for (int i = input.length() - 1; i >= 0; i-- ){
            System.out.print(input.charAt(i));
        }
    }
}