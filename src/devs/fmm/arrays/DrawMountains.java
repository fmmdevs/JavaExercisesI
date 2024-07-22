package devs.fmm.arrays;

import java.util.Arrays;
import java.util.Random;

public class DrawMountains {

    private static void printMountain(int[] altitudes) {

        int maxAltitude = 0;

        int indexMaxAltitude = 0;

        for (int i = 0; i < altitudes.length; i++) {
            if (maxAltitude < altitudes[i]) {
                maxAltitude = altitudes[i];
                indexMaxAltitude = i;
            }
        }

        for (int i = maxAltitude; i >= 0; i--) {
            System.out.print(i + " ");

            for (int j = 0; j < altitudes.length; j++) {

                if (altitudes[j] == maxAltitude && i == maxAltitude) {

                    System.out.print("^");

                } else if (altitudes[j] == i && indexMaxAltitude < j) {

                    if (j < altitudes.length - 1) {
                        System.out.print(altitudes[j + 1] == i ? "-" : "\\");
                    } else {
                        System.out.print("\\");
                    }


                } else if (altitudes[j] == i && indexMaxAltitude > j) {

                    if (j < altitudes.length - 1) {
                        System.out.print(altitudes[j + 1] == i ? "-" : "/");
                    } else {
                        System.out.print("\\");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    // maxAltitude must be <= Math.floor(size/2)
    /*private static int[] generateRandomAltitudes(int size, int maxAltitude) {
        if(size<Math.floor((double) maxAltitude/2)) return null;

        Random random = new Random();
        int[] altitudes = new int[size];


        altitudes[0] = 0;
        for (int i = 1; i < size; i++) {
            if (i <  maxAltitude) {
                if (altitudes[i] > 0 && altitudes[i-1]<altitudes[i]) {
                    altitudes[i] = altitudes[i-1];
                } else {
                    altitudes[i] = altitudes[i]+1;
                }
            } else {
            }

        }

        return altitudes;
    }*/

    public static void main(String[] args) {
        int[] altitudes = {0, 1, 1, 2, 2, 3, 3, 3, 4, 5, 4, 3, 2, 2, 1, 0};
        printMountain(altitudes);
        System.out.println("-----------------------------------------------------------------");
       /* int[] randomAltitudes = generateRandomAltitudes(20,6);
        System.out.println(Arrays.toString(randomAltitudes));
        printMountain(randomAltitudes);*/
    }
}
