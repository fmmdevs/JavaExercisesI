package devs.fmm.imperativeprogramming.loops;

import java.util.Scanner;

public class SummingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int number;
        System.out.println("Enter numbers, if you enter 0 I will show you the sum");

        do{
            number= sc.nextInt();
            sum+=number;
        } while (number!=0);

        System.out.println("Sum: "+sum);



    }
}
