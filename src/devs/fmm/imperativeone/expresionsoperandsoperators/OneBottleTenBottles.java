package devs.fmm.imperativeone.expresionsoperandsoperators;

import java.util.Scanner;

public class OneBottleTenBottles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of bottles");

        int noOfBottles = sc.nextInt();

        String grammar;

        grammar = noOfBottles == 0 || noOfBottles > 1 ? "bottles" : "bottle";

        System.out.println(noOfBottles + " " + grammar + " of rum");


        int zero = 0;
        int ten = 10;
        double anotherTen = 10;
        System.out.println(anotherTen / zero);
        System.out.println(ten / zero);
    }
}
