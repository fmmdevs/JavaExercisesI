package devs.fmm.arrays.onedimensionalarrays;

import java.util.Arrays;
import java.util.Random;

public class IsSaltySnookComing {

    private static final String[] SIGNSLIST = {"AHOY", "ALC", "PRG"};

    static boolean isProbablyApproaching(String[] signs) {
        // The array passed must not be null
        if (signs == null) return false;

        String last = signs[0];
        int counter = 1;

        for (int i = 1; i < signs.length; i++) {
            // No element in the array must be null
            if (signs[i] == null) return false;

            if (last.equals(signs[i])) {
                counter++;
                if (counter == 4) return true;
            } else {
                counter = 1;
            }

        }
        return false;
    }

    static String[] generateRandomSigns(String[] signsList, int signsNumber) {

        Random random = new Random();

        String[] randomSigns = new String[signsNumber];

        for (int i = 0; i < signsNumber; i++) {
            randomSigns[i] = signsList[random.nextInt(signsList.length)];
        }

        return randomSigns;

    }

    public static void main(String[] args) {

        String[] signs = generateRandomSigns(SIGNSLIST, 20);
        System.out.println(Arrays.toString(signs));
        System.out.println("Is Salty Snook probably approaching? " + isProbablyApproaching(signs));
    }
}
