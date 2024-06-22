import java.util.Scanner;

public class ex05{
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Type Your String Here : ");
        String input = scn.nextLine();

        System.out.print("Type Your Character here : ");
        String chr = scn.next();

        int count = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == chr.charAt(0)) {
                count++;
            }
        }

        System.out.print( "\""+ chr.charAt(0) +"\" Count is : " + count);


    }
}