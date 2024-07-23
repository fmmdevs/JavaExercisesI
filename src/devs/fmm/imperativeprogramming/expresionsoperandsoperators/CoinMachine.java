package devs.fmm.imperativeprogramming.expresionsoperandsoperators;

import java.util.Scanner;

public class CoinMachine {
    public static void main(String[] args) {
        int[] lirettaCoins = {2, 1};
        int[] lirettaCents = {50, 20, 10, 5, 2, 1};

        int lirettaCoins2 = 0;
        int lirettaCoins1 = 0;

        int lirettaCents50 = 0;
        int lirettaCents20 = 0;
        int lirettaCents10 = 0;
        int lirettaCents5 = 0;
        int lirettaCents2 = 0;
        int lirettaCents1 = 0;

        int rest = 0;

        double amount;
        int intPart, decimalPart;


        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount of money");

        amount = sc.nextDouble();

        intPart = Integer.parseInt(String.valueOf(amount).substring(0, 2));
        // System.out.println(intPart);

        decimalPart = Integer.parseInt(String.valueOf(amount).substring(3));

        // System.out.println(decimalPart);

        if (intPart % 2 == 0) {
            lirettaCoins2 = intPart / 2;
        } else if (intPart > 2) {
            lirettaCoins2 = (int) Math.floor((double) intPart / 2);
            lirettaCoins1 = 1;
        }

        if (decimalPart >= 50) {
            lirettaCents50 = (int) Math.floor((double) decimalPart / 50);
            rest = decimalPart % 50;
        }

        if (rest >= 20) {
            lirettaCents20 = (int) Math.floor((double) rest / 20);
            rest = rest % 20;
        }

        if (rest >= 10) {
            lirettaCents10 = (int) Math.floor((double) rest / 10);
            rest = rest % 10;
        }

        if (rest >= 5) {
            lirettaCents5 = (int) Math.floor((double) rest / 5);
            rest = rest % 5;
        }

        if (rest >= 2) {
            lirettaCents2 = (int) Math.floor((double) rest / 2);
            rest = rest % 2;
        }

        if(rest==1){
            lirettaCents1=1;
        }

        System.out.println(lirettaCoins2 + " X " + "2 Liretta");
        System.out.println(lirettaCoins1 + " X " + "1 Liretta");
        System.out.println(lirettaCents50 + " X " + "50 Lirettacent");
        System.out.println(lirettaCents20 + " X " + "20 Lirettacent");
        System.out.println(lirettaCents10 + " X " + "10 Lirettacent");
        System.out.println(lirettaCents5 + " X " + "5 Lirettacent");
        System.out.println(lirettaCents2 + " X " + "2 Lirettacent");
        System.out.println(lirettaCents1 + " X " + "1 Lirettacent");


    }
}
