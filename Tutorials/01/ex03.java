import java.util.Scanner;

public class ex03{
    public static void main ( String[] arg){
        Scanner scn = new Scanner(System.in);
        int num = 0;

        while( !(num <= 10 && num > 0) ){
            System.out.print("Enter an integer : ");
            num = scn.nextInt();
            if (!(num <= 10 && num > 0)){
                System.out.println("Please Enter Valid Integer!!");
            }
        }

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++){
                System.out.print((i * j) + (((Integer.toString(i * j)).length() == 1) ? "  " : " "));
            }
            System.out.println();
        }
    }
}