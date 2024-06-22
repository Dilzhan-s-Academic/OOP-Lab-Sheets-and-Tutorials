import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

public class exMain{

    public static void main(String[] args) {
        int maxSubjects;
        int [] marks = new int[5];
        int total = 0;
        Scanner scn = new Scanner(System.in);
        double avg;
        int i;
        try {
        // 1. Input a value for maxSubjects
        System.out.print("Enter MaxSubjects : ");
        maxSubjects = scn.nextInt();

        // 2. Using a for loop
        // input marks
        for(i = 0; i < marks.length; i++ ){
            System.out.print("Enter Mark " + (i + 1) + ": ");
            marks[i] = scn.nextInt();
            total += marks[i];
        }

        // 3. Calculate the avg marks
        avg = total / (double)marks.length;
        System.out.println("Total : " + total);
        System.out.println("Average : " + avg);
        // 4. Use a try catch block to
        // prevent the following
        // run time errors
        // (a) Input valid integers to the
        // inputs
        }
        catch(InputMismatchException ime){
            System.out.println("Please Enter the Valid Input! " + ime);
        }
        // (b) ArithmeticException division
        // by zero
        catch(ArithmeticException ae){
            System.out.println("Cannot Devide by Zero! " + ae);
        }
        // (c) ArrayIndexOutOfBounds
        // Exception
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("cannot add anymore! " + aie);
        }
        catch (Exception e) {
            System.out.println("Something went Wrong!!");
        }
        finally {
            System.out.println("This code will be gurrentied to run");
            scn.close();
        }
        System.out.println("The end");
    }
}
