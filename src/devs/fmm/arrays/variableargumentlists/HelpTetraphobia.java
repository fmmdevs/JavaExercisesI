package devs.fmm.arrays.variableargumentlists;

import java.util.Arrays;

public class HelpTetraphobia {
    private static int[] fourLast(int... numbers) {

        int[] numbersWith4 = new int[numbers.length];
        int[] numbersWithout4 = new int[numbers.length];

        int x = 0;
        int y = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (Integer.toString(numbers[i]).contains("4")) {
                numbersWith4[x] = numbers[i];
                x++;

            } else {
                numbersWithout4[y] = numbers[i];
                y++;
            }
        }

        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            if (numbersWith4[i] != 0) {
                numbers[j] = numbersWith4[i];
            }

            if (numbersWithout4[i] != 0) {
                numbers[i] = numbersWithout4[i];
            }
        }


        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 44, 2, 4, 43};
        System.out.println(Arrays.toString(fourLast(numbers)));
    }
}
