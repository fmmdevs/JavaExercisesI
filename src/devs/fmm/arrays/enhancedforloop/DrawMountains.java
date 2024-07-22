package devs.fmm.arrays.enhancedforloop;

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



    public static void main(String[] args) {
        int[] altitudes = {0, 1, 1, 2, 2, 3, 3, 3, 4, 5, 4, 3, 2, 2, 1, 0};
        printMountain(altitudes);

        System.out.println("-----------------------------------------------------------------");

        int[] altitudes1 = {0, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8, 8, 8, 9, 9, 9, 8, 8, 7, 7, 7, 6, 5, 4, 3, 3, 3, 2, 2, 2, 1, 1, 0};
        printMountain(altitudes1);
    }
}
