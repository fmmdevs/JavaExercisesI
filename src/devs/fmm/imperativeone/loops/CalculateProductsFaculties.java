package devs.fmm.imperativeone.loops;

import java.util.Scanner;

public class CalculateProductsFaculties {
    public static void main(String[] args) {

        System.out.println("Enter a number please");

        long number = new Scanner(System.in).nextLong();

        long factorial = 1;

        String result = "";

        for (int i = 1; i <= number; i++) {

            factorial = Math.multiplyExact(factorial,i);

            if (i != number) {

                result += i + " * ";

            } else {

                result += i + " = " + factorial;

            }
        }
        System.out.println("Input: " + number + " -> " + "Output: " + number + "!" + " = " + result);
    }
}
