import java.util.Scanner;

public class ex02{
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        int num = 0;
        int total = 0;
        int count = 0;
        while(num >= 0){    
            total += num;
            System.out.print("Enter a Number : ");
            num = scn.nextInt();
            count++;
        }
        double avg = (double)total / (count - 1);

        System.out.println("Average : " + avg); 
    }
}