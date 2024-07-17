package devs.fmm.imperativeone.controlflow;

import java.util.Scanner;

public class Payday {
    public static void main(String[] args) {
        System.out.println("Please Enter Amount");

        double amount = new java.util.Scanner(System.in).nextDouble();

        System.out.println("Please Enter Purchase");
        double purchase = new java.util.Scanner(System.in).nextDouble();

        double dif = purchase - amount;

        if (dif < -amount * 0.1 || dif > amount * 0.2) {

            System.out.println("You son of a bi***!");

        } else {
            System.out.println("Good boy!");

        }



    }
}
