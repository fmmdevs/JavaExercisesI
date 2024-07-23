package devs.fmm.imperativeprogramming.expresionsoperandsoperators;

import java.util.Scanner;

public class NumbersShareDigit {
    public static void main(String[] args) {
        int number1, number2;

        String s1, s2;

        boolean shareDigit = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("insert number 1");

        number1 = sc.nextInt();

        System.out.println("Introduce number 2");

        number2 = sc.nextInt();

        if (number1 < 10) {

            s1 = "0" + number1;

        } else if (number1 > 99) {

            s1 = String.valueOf(number1);

            s1 = s1.substring(s1.length() - 2);

        } else {
            s1 = String.valueOf(number1);
        }

        if (number2 < 10) {

            s2 = "0" + number2;

        } else if (number2 > 99) {

            s2 = String.valueOf(number2);

            s2 = s2.substring(s2.length() - 2);

        } else {
            s2 = String.valueOf(number2);
        }


        System.out.println(s1);
        System.out.println(s2);

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == s1.charAt(i)) {
                    shareDigit=true;
                    break;
                }
            }

        }
        System.out.println(shareDigit);

    }
}
