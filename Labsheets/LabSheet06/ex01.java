import java.util.Scanner;

public class ex01 {
    public static void main (String[] arg) {
        int[] arr = new int[10];

        boolean isEmpty = true;

        for (int a : arr) {
           isEmpty = (a == 0) ? true : false;
        }


        Scanner scn = new Scanner(System.in);
        if (isEmpty) {
            for (int i = 0; i < arr.length; i++ ) {
                System.out.print("Enter " + (i+1) + " Number : ");
                arr[i] = scn.nextInt();
            }
        }

        int total = 0;

        for (int a : arr) {
            total += a;
        }

        System.out.println("Total : " + total);
    }
}