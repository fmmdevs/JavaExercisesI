package devs.fmm.imperativeprogramming.expresionsoperandsoperators;

import java.util.Scanner;

public class LootCanBeShared {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalBottles;

        int captainBottles, crewBottles, crewMembers;

        System.out.println("Number of bottles in total?");

        totalBottles = sc.nextInt();

    /*    if (totalBottles % 2 == 0) {
            captainBottles = totalBottles / 2;
        } else {
            captainBottles = Math.floorDiv(totalBottles, 2);
        }*/

        // it can be simplified to
        captainBottles = Math.floorDiv(totalBottles, 2);

        crewBottles = totalBottles - captainBottles;

        System.out.println("Bottles for the captain: " + captainBottles);

        System.out.println("Bottles for all crew members: " + crewBottles);

        System.out.println("Number of crew members?");

        crewMembers = sc.nextInt();

        System.out.println("Fair share without remainder? " + (crewBottles % crewMembers == 0));


    }
}
