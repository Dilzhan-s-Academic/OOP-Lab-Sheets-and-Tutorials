import java.util.Scanner;

public class ex01{
    public static void main(String[] arg){

        Scanner scn = new Scanner(System.in);
        int num = 0;

        while(num <= 0){
            System.out.print("Enter a Number : ");
            num = scn.nextInt();
            if(num <= 0) {
                System.out.println("Please Enter the Valid Number!!");
            }
        }

        int fact = 1;
        for ( int i = num;  0 <9 i; i--){
            fact *= i;
        }

        System.out.println(fact);

    }
}