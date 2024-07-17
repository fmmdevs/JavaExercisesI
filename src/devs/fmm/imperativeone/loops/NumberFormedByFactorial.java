package devs.fmm.imperativeone.loops;

import java.util.Scanner;

public class NumberFormedByFactorial {
    public static void main(String[] args) {

        long number = new Scanner(System.in).nextLong();

        boolean isFactorial = false;

        long product = 1;
        int factorial = 0;

        for (int i = 1; i <= 20; i++) {

            product *= i;

            if (product < number && number % product == 0) continue;

            if (product == number) {

                isFactorial = true;
                factorial = i;
                break;

            }
            if (product > number) {

                //isFactorial = false;
                break;

            }
        }

        if (isFactorial) {
            System.out.println(number + "=" + factorial + "!");
        } else {
            System.out.println(number + " is not factorial");
        }
    }
}
