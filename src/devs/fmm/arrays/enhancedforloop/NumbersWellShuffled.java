package devs.fmm.arrays.enhancedforloop;

import java.util.Arrays;
import java.util.Random;

public class NumbersWellShuffled {

    private static int[] shuffleDice() {
        int[] dices = new int[5];
        Random random = new Random();

        // Enhanced for loop not for modified array since dice in just a copy of each element.
       /* for(int dice: dices){
            System.out.println("hola");
            dice = random.nextInt(1,7);
        }
        System.out.println(Arrays.toString(dices));*/
        for (int i = 0; i < dices.length; i++) {
            dices[i] = random.nextInt(1, 7);
        }
        System.out.println(Arrays.toString(dices));
        return dices;
    }

    // Test if all values in the array are equal
    private static boolean isHomogeneous(int[] values) {
        int firstValue = values[0];

        for (int value : values) {
            if (firstValue != value) return false;
        }

        return true;
    }

    private static int[] occurrences(int[] values) {
        int[] ocurrences = new int[6];

        for (int i = 0; i < ocurrences.length; i++) {

            for (int value : values) {
                if (value == i + 1) ocurrences[i]++;
            }
        }
        return ocurrences;
    }

    private static boolean isFullHouse(int[] values) {
        boolean three = false;
        boolean pair = false;
        int[] occurrences = occurrences(values);

        for (int occurrence : occurrences) {
            if (occurrence == 3) three = true;
            if (occurrence == 2) pair = true;
        }
        return three && pair;
    }

    private static void printDiceValues(int[] values) {
        //Unicode symbols ⚀ (Unicode character U+2680), ⚁ (U+2681), ⚂ (U+2682), ⚃ (U+2683), ⚄ (U+2684), ⚅ (U+2685)

        char diceOne = '\u2680';
        char diceTwo = '\u2681';
        char diceThree = '\u2682';
        char diceFour = '\u2683';
        char diceFive = '\u2684';
        char diceSix = '\u2685';

        char[] unicodesDices = {diceOne, diceTwo, diceThree, diceFour, diceFive, diceSix};

        int[] occurrences = occurrences(values);

        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] != 0 && i != occurrences.length - 1) {
                System.out.print(occurrences[i] != 1 ? occurrences[i] + " X " + unicodesDices[i] + ", " : unicodesDices[i] + ", ");
            } else if (occurrences[i] != 0 && i == occurrences.length - 1) {
                System.out.print(occurrences[i] != 1 ? occurrences[i] + " X " + unicodesDices[i]+"." : unicodesDices[i]+".");
            }
        }


    }

    public static void main(String[] args) {
        int[] dices = shuffleDice();
        System.out.println(Arrays.toString(occurrences(dices)));
        System.out.println("Full House? " + isFullHouse(dices));

        printDiceValues(dices);
    }
}
